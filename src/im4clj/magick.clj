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

(def ^:private magick-bindings
  (flatten (concat (ns-publics 'im4clj.commands)
                   (ns-publics 'im4clj.options))))

(defmacro magick
  "Access to all of im4clj's goodness without polluting our current namespace.

   Example Usage:

   (magick (convert input-path (resize 100) output-path))
  "
  [& body]
  `(let [~@magick-bindings]
     ~@body))
