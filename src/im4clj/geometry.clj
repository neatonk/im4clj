;   Copyright (c) deeperbydesign, inc 2012. All rights reserved.
;   The use and distribution terms for this software are covered by the
;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;   which can be found in the file epl-v10.html at the root of this distribution.
;   By using this software in any fashion, you are agreeing to be bound by
;   the terms of this license.
;   You must not remove this notice, or any other, from this software.

(ns ^{:doc "Functions used to generate and validate ImageMagick geometry spec strings."
      :author "Kevin Neaton"}
    im4clj.geometry)

(defn signed-string
  "Converts an integer to a signed string."
  [n]
  {:pre [(integer? n)]
   :post [(#{\+ \-} (first %))]}
  (if (>= n 0)
    (str "+" n)
    (str n)))

(defn size
  "Specify the image width and height in pixels or percentages."
  ([w] (str w))
  ([w h] (str w "x" h))
  ([w h s] (str w "x" h s)))

(defn offset
  "Specify the image offset in pixels from top left."
  [x y]
  (apply str (map signed-string [x y])))

;; check
(def ^{:doc "Special characters used to modify the meaning of a geometry-spec."}
  special-chars #{\% \@ \! \^ \< \>})

(defn special-char?
  "Predicate. Determines whether or not 'c' is a special character, or a string
   begining with a special character. :see-also special-chars."
  [c]
  (let [c (if (string? c) (first c) c)]
    (boolean (special-chars c))))

(def ^:private size-re #"(?>\d+x\d*|\d*x\d+)")
(def ^:private offset-re #"(?>[+-]\d+[+-]\d+)")
(def ^:private special-re
  (re-pattern (str "(?>[" (apply str special-chars) "])")))
(def ^:private geometry-spec-re
  (re-pattern (str "^" size-re offset-re "?" special-re "?" "$")))

(defn valid-geometry-spec?
  "Predicate. Returns true if 's' is a properly formed geometry-spec string."
  [s]
  (boolean (re-find geometry-spec-re s)))

(defn geometry-spec
  "Image size and offset."
  ([w] (size w))
  ([w h] (size w h))
  ([w h s] (size w h s))
  ([w h x y] (str (size w h) (offset x y)))
  ([w h x y s] (str (size w h) (offset x y) s)))
