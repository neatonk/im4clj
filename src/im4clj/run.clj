;   Copyright (c) deeperbydesign, inc 2012. All rights reserved.
;   The use and distribution terms for this software are covered by the
;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;   which can be found in the file epl-v10.html at the root of this distribution.
;   By using this software in any fashion, you are agreeing to be bound by
;   the terms of this license.
;   You must not remove this notice, or any other, from this software.

(ns ^{:doc "Stringify and run commands via im4java."
      :author "Kevin Neaton"}
  im4clj.run
  (:require [im4clj.im4java :as im4java]))

(defprotocol Stringifiable
  "Protocol to control the conversion of commandline components prior to execution."
  (stringify [this] "Returns a string or a sequence of strings representing this."))

(extend-protocol Stringifiable

  clojure.lang.Seqable
  (stringify [this] (flatten (map stringify this)))

  clojure.lang.Keyword
  (stringify [this] (.getName this))

  clojure.lang.Symbol
  (stringify [this] (.toString this))

  java.lang.Long
  (stringify [this] (.toString this))

  String
  (stringify [this] this)

  nil
  (stringify [this] []))

(defn stringify-all
  "Convert args to a flat sequence of strings."
  [& args]
  {:post [(coll? %)
          (every? string? %)]}
  (stringify args))

(defn run
  "Run a command by name with the given opts. Accepts any Stringifiable
   type.

   Prefer pre-defined commands e.g. im4clj.core/convert.

   Example Usage:

   (run :convert \"input.jpg\" '-resize 100 \"output.jpg\")
   (run [:gm :convert] \"input.jpg\" '-resize 100 \"output.jpg\")
  "
  [cmd & opts]
  (apply im4java/run (stringify-all cmd opts)))
