;   Copyright (c) deeperbydesign, inc 2012. All rights reserved.
;   The use and distribution terms for this software are covered by the
;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;   which can be found in the file epl-v10.html at the root of this distribution.
;   By using this software in any fashion, you are agreeing to be bound by
;   the terms of this license.
;   You must not remove this notice, or any other, from this software.

(ns ^{:doc "Command infrastructure. Used by im4clj.commands to define IM/GM command-fn's for 'convert, 'identify, 'montage, etc."
      :author "Kevin Neaton"}
  im4clj.command
  (:use [im4clj run])
  (:require [im4clj.config :as config]))

(defrecord Command [command-seq use-gm]
  Stringifiable
  (stringify [this]
    (stringify
     (cond
      (true? use-gm) (cons "gm" command-seq)
      (false? use-gm) command-seq
      (config/use-gm?) (cons "gm" command-seq)
      :else command-seq))))

(defn command
  "Create a new Command object for 'cmd'. When stringified, \"gm\" will be
  conditionally prepended to the result if (use-gm?) is true. Use the second
  form to force the use of im or gm.

  Example Usage:

  (command :convert)
  (command :convert true)
  "
  ([cmd]
     (Command. (list cmd) nil))
  ([cmd use-gm]
     (Command. (list cmd) use-gm)))

(defn- command-examples
  [attr-map]
  (if-let [examples (second (:examples attr-map))]
    (case (count examples)
      0 ""
      1 (str (first examples))
      (apply str "\n\n  " (interpose "\n  " examples)))
    "TODO: add example usage."))

(defn- command-docstr
  [cmd attr-map]
  (let [examples (command-examples attr-map)]
    (format "Run the %s command with the given argument form. See IM/GM documentation for detailed usage.\n\n  Example Usage: %s" cmd examples)))

(defmacro defcommand
  "Define a new command-fn. Takes a symbol and an attr-map representing the
  command to be defined. If present in attr-map, the keys :arglists and
  :examples are treated specially. All keys are retained as meta-data for the
  symbol provided.

  (defcommand convert
    {:examples '[(convert \"input.jpg\" \"-resize\" \"640x480\" \"output.jpg\")
                 (convert (-> \"input.jpg\" (-resize 640 480)) \"output.jpg\")
                 (convert (-resize \"input.jpg\" 640 480) \"output.jpg\")]
     :arglists '([options? input-file? options? output-file])})"
  [cmd attr-map]
  (let [arglists (or (:arglists attr-map) ''([& options]))
        attr-map (assoc attr-map
                   :arglists arglists)
        docstr   (command-docstr cmd attr-map)]
    `(defn ~cmd
       ~docstr
       ~attr-map
       [& options#]
       (apply run (command ~(str cmd)) options#))))

(defmacro defcommands
  "Define a number of command-fn's from the given specs. If a map is provided
  prior to the specs it's contents will be applied to each spec."
  [attr-map? & specs]
  (let [[attr-map specs] (if (map? attr-map?)
                           [attr-map? specs]
                           [{} (cons attr-map? specs)])
        specs (partition 2 specs)
        defs  (for [[cmd cmd-attr-map] specs]
                (let [attrs (merge attr-map cmd-attr-map)]
                  `(defcommand ~cmd ~attrs)))]
    `(do ~@defs)))
