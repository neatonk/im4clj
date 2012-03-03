;   Copyright (c) deeperbydesign, inc 2012. All rights reserved.
;   The use and distribution terms for this software are covered by the
;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;   which can be found in the file epl-v10.html at the root of this distribution.
;   By using this software in any fashion, you are agreeing to be bound by
;   the terms of this license.
;   You must not remove this notice, or any other, from this software.

(ns ^{:doc "Basic logging util's"
      :author "Kevin Neaton"}
  im4clj.util.log)

(def ^:dynamic *debug* false)

(defn debug
  "Print a debug message to *out* when *debug* is true."
  [msg & form]
  (when *debug*
    (print (str "[DEBUG: " msg "] "))
    (prn form)))

(defmacro with-debug
  "Print debug messages."
  [& body]
  `(binding [*debug* true]
     ~@body))

(def ^:dynamic *report-progress* false)

(defn progress
  "Print a progress message to *out* when *report-progress* is true."
  [msg]
  (when *report-progress*
    (println msg)))

(defmacro with-progress
  "Report progress."
  [& body]
  `(binding [*report-progress* true]
     ~@body))
