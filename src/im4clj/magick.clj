;   Copyright (c) deeperbydesign, inc 2012. All rights reserved.
;   The use and distribution terms for this software are covered by the
;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;   which can be found in the file epl-v10.html at the root of this distribution.
;   By using this software in any fashion, you are agreeing to be bound by
;   the terms of this license.
;   You must not remove this notice, or any other, from this software.

(ns ^{:doc "ImageMagick for Clojure. im4clj.magick defines a single public... magick. Use magick to access all of im4clj's goodness without polluting our current namespace."
      :author "Kevin Neaton"}
  im4clj.magick
  (:require [im4clj commands options]))

(defn- alias-options
  [env]
  (reduce (fn [keep [k v]]
            (let [[minus? & newk] (name k)]
              (if (= \- minus?)
                (cons keep [(symbol (apply str newk)) v]))))
          []
          env))

(def ^:private magick-bindings
  (let [commands (ns-publics 'im4clj.commands)
        options (ns-publics 'im4clj.options)
        aliases (alias-options options)]
    (flatten (concat commands options aliases))))

(defmacro magick
  "Access all of im4clj's goodness without polluting the current namespace.

   Example Usage:

   (magick (convert input-path (resize 100) output-path))
  "
  [& body]
  `(let [~@magick-bindings]
     ~@body))

(defmacro defn-magick
  "Same as defn, but with all of the bindings of magick inside.

   Example Usage:

   (defn-magick [input-path output-path]
     (convert input-path (resize 100) output-path))
  "
  {:arglists '([name doc-string? attr-map? [params*] body]
                 [name doc-string? attr-map? ([params*] body)+ attr-map?])
   :see-also 'magick}
  [& defn-form]
  `(magick (defn ~@defn-form)))
