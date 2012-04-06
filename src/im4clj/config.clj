;   Copyright (c) deeperbydesign, inc 2012. All rights reserved.
;   The use and distribution terms for this software are covered by the
;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;   which can be found in the file epl-v10.html at the root of this distribution.
;   By using this software in any fashion, you are agreeing to be bound by
;   the terms of this license.
;   You must not remove this notice, or any other, from this software.

(ns ^{:doc "Configure im4clj"
      :author "Kevin Neaton"}
  im4clj.config)

(def ^{:doc "Dynamic var used to select the GraphicksMagick command. nil by default."
       :dynamic true}
  *use-gm* nil)

(defn use-gm
  "Get the thread-local value of *use-gm*."
  [] *use-gm*)

(defn use-gm!
  "Set the thread-local value of *use-gm*."
  ([] (use-gm! true))
  ([bool] (set! *use-gm* bool)))

(defn use-gm?
  "Predicate. Returns true if *use-gm* is bound to true. Use with-gm and with-im
  for binding."
  [] (true?  *use-gm*))

(defmacro with-gm
  "Evaluates 'body' with *use-gm* bound to true."
  [& body]
  `(binding [*use-gm* true]
     ~@body))

(defmacro with-im
  "Evaluates 'body' with *use-gm* bound to false."
  [& body]
  `(binding [*use-gm* false]
     ~@body))
