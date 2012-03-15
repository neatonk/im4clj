;   Copyright (c) deeperbydesign, inc 2012. All rights reserved.
;   The use and distribution terms for this software are covered by the
;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;   which can be found in the file epl-v10.html at the root of this distribution.
;   By using this software in any fashion, you are agreeing to be bound by
;   the terms of this license.
;   You must not remove this notice, or any other, from this software.

(ns ^{:doc "Macros used internally to define the option-fn's used by im4clj."
      :author "Kevin Neaton"}
  im4clj.defoptions
  (:use [clojure.walk]))

(defn- expand-argspec-form
  "Expand argspec-word by enumerating optional forms. The result is a list
  containing the complete set of forms described by the argspec-word.

  Example:

  (expand-argsec-word '[width \"x\" height [\"+\" x \"+\" y] [special]])
  => ([width \"x\" height]
      [width \"x\" height [\"+\" x \"+\" y]]
      [width \"x\" height [\"+\" x \"+\" y] [special]])"
  [word]
  (let [[base opts] (split-with (comp not vector?) word)]
    (for [n (range (+ 1 (count opts)))]
      (vec (concat base (take n opts))))))

(defn- expand-argspec
  "Expand each form in argspec and remove empty forms from the result. See
  expand-argspec-form."
  [argspec]
  (->> argspec
    (map expand-argspec-form)
    (map (partial remove empty?))
    (reduce (fn [out in]
              (if-let [base (last out)]
                (concat out (map (partial concat base) (map list in)))
                (concat out (list in))))
            [])))

;; TODO:
;;
;; * expand-argspec-form and expand-argspec work gloriously.
;; * need to fix reduce-argspec-forms, this should get rid of forms which omit
;;   required arguments.
;; * not sure if flatten argspec is still needed. word-boundaries must remain
;;   intact.

(defn- reduce-argspec-forms
  ""
  [forms]
  (if-not (> (count forms) 1)
    forms
    (remove (partial every? nil?)
            (reduce (fn [keep form]
                      (if-let [lst (last keep)]
                        (if (some true? (map (some vector?) lst))
                          (list keep form)
                          (list (butlast keep) form))
                        (list form)))
                    forms))))

(defn- flatten-argspec
  [argspec]
  (let [argspec (for [form argspec] (map flatten form))]
    (if (empty? (first argspec))
      (cons (first argspec) (apply concat (rest argspec)))
      (apply concat argspec))))

(defn parse-argspec
  "Takes an option-argspec and expands it. The result is a new form enumerating
   the complete set of forms described by the argspec."
  [argspec]
  (if (= '([]) argspec)
    argspec
    (->> argspec
         expand-argspec
         ;reduce-argspec-forms
         ;flatten-argspec
         )))

(defn- mk-fn-arglists
  [argspec]
  (for [spec argspec]
    (->> spec flatten (filter symbol?) vec)))

(defn- mk-fn-clause
  [optstr spec params]
  (if (empty? params)
    `([] ~optstr)
    `([~@params] (list ~optstr (str ~@(flatten spec))))))

(defn- mk-gensym-param-map
  [params]
  (zipmap params (map gensym params)))

(defn- mk-fn-tail
  [opt argspecs arglists]
  (let [gensyms  (mk-gensym-param-map (-> arglists flatten set))]
    (map (partial mk-fn-clause (name opt))
         (prewalk-replace gensyms argspecs)
         (prewalk-replace gensyms arglists))))

(defn- nested-argspec?
  "Predicate. Returns true if argspec contains nested optional-form(s)."
  [argspec]
  (when (not (empty? argspec))
    (->> argspec
         (filter vector?)
         (map (partial some vector?))
         (some true?))))

(defn- valid-argspec?
  [argspec]
  "Predicate. Returns true if the argspec is valid."
  (not-any? true? (map nested-argspec? argspec))
  (not-any? true? (map empty? (next argspec))))

(defmacro defoption
  "Define a new option-fn. Takes a symbol, one or more argspecs, and an attr-map.

   argspec => [required-form [optional-form]+]
   required-form => constant-or-symbol+
   optional-form => constant-or-symbol+

   e.g. [width \"x\" height [\"+\" x \"+\" y] [special]]

   TODO:
   - implement pre and post conditions.
   - implement +options."
  {:arglists '([opt argspec* attr-map])}
  [opt & body]
  (let [argspec (butlast body)
        attr-map (last body)]
    (assert (valid-argspec? argspec)
            (throw (IllegalArgumentException.
                    (format  "defoption recieved an invalid argspec for %s: %s"
                             opt argspec))))
    (let [argspecs (-> argspec parse-argspec)
          arglists (mk-fn-arglists argspecs)
          pre-post (select-keys attr-map [:pre :post])
          attr-map (-> attr-map
                       (dissoc :pre :post)
                       (assoc :arglists `(quote ~arglists)))
          fn-tail  (mk-fn-tail opt argspecs arglists)]
      `(defn ~opt ~attr-map ~@fn-tail))))

(defn- partition-specs
  "Returns a lazy-seq of specs."
  [specs]
  (lazy-seq
   (when-let [s (seq specs)]
     (let [fst (first s)
           fv (symbol? fst)
           run (cons fst (take-while #(not= fv (symbol? %)) (next s)))]
       (cons run (partition-specs (seq (drop (count run) s))))))))

(defmacro defoptions
  "Define a bunch of option-fn's with the given attributes."
  [attr-map & specs]
  (let [specs (partition-specs specs)
        defs  (for [spec specs]
                (let [attrs (merge attr-map (last spec))]
                  `(defoption ~@(butlast spec) ~attrs)))]
    `(do ~@defs)))

(comment
  "ignore these randomn tests..."
 (defoption

   -adjoin
   []
   {:doc "join images into a single multi-image file",
    :command "gm convert",
    :project "GraphicsMagick",
    :version "1.3.13"})

 (defoptions
   {}

   -level [black-point ["," gamma] ["," white-point] [percent?]]
   {:doc "adjust the level of image contrast"}

   -limit [type] [value]
   {:doc "Disk, File, Map, Memory, Pixels, or Threads resource limit"}

   -list [type]
   {:doc "the type of list"})

 (-> '([a "," b] [c ["," d]]) expand-argspec mk-fn-arglists)
 (-> '([a "," b] [c ["," d]]) expand-argspec) ;;incorrect

 (-> '([]) expand-argspec)
 (-> '([black-point ["," gamma] ["," white-point] [percent?]]) expand-argspec)

 (-> '([[a] ["," b]] [[c] ["," d]]) expand-argspec)

 (-> '([type] [value [a]]) expand-argspec)


 (-> '([a ["," b]] [c ["," d]]) expand-argspec mk-fn-arglists)
 (->> '([a ["," b]] [c ["," d]]) expand-argspec)

 (->> '([black-point ["," gamma] ["," white-point] [percent?]])
      expand-argspec)

 (doseq [spec ['([])
               '([name])
               '([type] [value])
               '([attribute] [[value]])
               '([width "x" height ["+" x "+" y] [special]])
               '([black-point ["," gamma] ["," white-point] [percent?]])]]
   (-> spec parse-argspec prn))


 (= '([[name]]) (-> '([name]) expand-words))

 (-> '([a] [[b]] [[c]]) expand-optional-forms)
 )
