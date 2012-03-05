;   Copyright (c) deeperbydesign, inc 2012. All rights reserved.
;   The use and distribution terms for this software are covered by the
;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;   which can be found in the file epl-v10.html at the root of this distribution.
;   By using this software in any fashion, you are agreeing to be bound by
;   the terms of this license.
;   You must not remove this notice, or any other, from this software.

(ns ^{:doc "Macros used internally to define the option-fn's used by im4clj."
      :author "Kevin Neaton"}
  im4clj.defoptions)

(defn- expand-argspec
  [argspec]
  (let [[base opts] (partition-by vector? argspec)]
    (for [n (range (+ 1 (count opts)))]
      (cons base (take n opts)))))

(defn- mk-fn-arglists
  [argspecs]
  (map vec (for [spec argspecs]
             (->> spec flatten (filter symbol?)))))

(defn- mk-fn-clause
  [optstr spec params]
  (if (empty? params)
    `([] ~optstr)
    `([~@params] (list ~optstr (str ~@(flatten spec))))))

(defmacro defoption
  "Define a new option-fn.

   TODO:
   - implement pre and post conditions.
   - Handle nested optional params in argspec. See -modulate.
   - implement +options."
  [opt argspec attr-map]
  (let [argspecs (expand-argspec argspec)
        arglists (mk-fn-arglists argspecs)
        pre-post (select-keys attr-map [:pre :post])
        attr-map (dissoc attr-map :pre :post)
        fn-tail  (map (partial mk-fn-clause (name opt)) argspecs arglists)]

    `(defn ~opt ~attr-map ~@fn-tail)))

(defmacro defoptions
  "Define a bunch of option-fn's with the given attributes.

   TODO:
   - alias -options. eg. -adjoin => adjoin"
  [attr-map & specs]
  (let [specs (partition 3 specs)
        defs  (for [[opt argspec opt-attr-map] specs]
                (let [attrs (merge attr-map opt-attr-map)]
                  `(defoption ~opt ~argspec ~attrs)))]
    `(do ~@defs)))
