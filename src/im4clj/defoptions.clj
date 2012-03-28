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

(defn- normalize-argspec
  [argspec]
  (if (vector? (first argspec))
    (cons "" argspec)
    argspec))

(defn- expand-argspec
  [argspec]
  (let [[base opts] (partition-by vector? argspec)]
    (for [n (range (+ 1 (count opts)))]
      (concat base (take n opts)))))

(defn- mk-fn-arglists
  [argspecs]
  (map vec (for [spec argspecs]
             (cons 'this (->> spec flatten (filter symbol?))))))

(defprotocol AppendableSeq
  "Protocol. Used to append zero or more items to 'this."
  (append [this]
    "Returns a coll containing 'this or the items in 'this if it is a collection.")
  (append [this more]
    "Returns a coll containing 'this or the items in 'this if it is a collection,
    followed by the items in 'more."))

(extend-protocol AppendableSeq

  clojure.lang.Seqable
  (append [this] this)
  (append [this more] (concat this more))

  String
  (append [this] (list this))
  (append [this more] (cons this more))

  nil
  (append [this] nil)
  (append [this more] more))

(defn- mk-fn-clause
  [optstr spec params]
  (let [[[this] params] (split-at 1 params)]
    (if (empty? params)
      `([~this] (append ~this (list ~optstr)))
      `([~this ~@params] (append ~this (list ~optstr (str ~@(flatten spec))))))))

(defn- mk-gensym-param-map
  [params]
  (zipmap params (map gensym params)))

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
  "Predicate. Returns true is the argspec is valid."
  (not (nested-argspec? argspec)))

(defmacro defoption
  "Define a new option-fn. Takes a symbol, one or more argspecs, and an attr-map.

   argspec => [required-form [optional-form]+]
   required-form => constant-or-symbol+
   optional-form => constant-or-symbol+

   e.g. [width \"x\" height [\"+\" x \"+\" y] [special]]

   TODO:
   - implement pre and post conditions.
   - implement +options."
  [opt argspec attr-map]
  (assert (valid-argspec? argspec)
          (throw (IllegalArgumentException.
                  (format  "defoption recieved an invalid argspec: %s %s"
                  opt argspec))))
  (let [argspecs (-> argspec normalize-argspec expand-argspec)
        arglists (mk-fn-arglists argspecs)
        pre-post (select-keys attr-map [:pre :post])
        attr-map (-> attr-map
                     (dissoc :pre :post)
                     (assoc :arglists `(quote ~arglists)))
        gensyms  (mk-gensym-param-map (-> arglists flatten set))
        fn-tail  (map (partial mk-fn-clause (name opt))
                      (prewalk-replace gensyms argspecs)
                      (prewalk-replace gensyms arglists))]
    `(defn ~opt ~attr-map ~@fn-tail)))

(defmacro defoptions
  "Define a bunch of option-fn's with the given attributes."
  [attr-map & specs]
  (let [specs (partition 3 specs)
        defs  (for [[opt argspec opt-attr-map] specs]
                (let [attrs (merge attr-map opt-attr-map)]
                  `(defoption ~opt ~argspec ~attrs)))]
    `(do ~@defs)))
