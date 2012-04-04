;   Copyright (c) deeperbydesign, inc 2012. All rights reserved.
;   The use and distribution terms for this software are covered by the
;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;   which can be found in the file epl-v10.html at the root of this distribution.
;   By using this software in any fashion, you are agreeing to be bound by
;   the terms of this license.
;   You must not remove this notice, or any other, from this software.

(ns ^{:doc "Glob related utils."
      :author "Kevin Neaton"
      :skip-wiki true}
  im4clj.util.glob
  (:use [org.satta.glob :only [glob]]
        [clojure.walk :only [postwalk]]))

(defn glob?
  "Predicate. Returns true if 's' appears to be a glob string."
  [s]
  (and (string? s)
       (boolean (re-find #"[\*{}]" s))))

(defn expand-globs
  "Expand all glob strings in body."
  [& body]
  (postwalk #(if (glob? %)
               (map str (glob %))
               %)
            body))
