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
  (:use [im4clj config run]))

(defrecord Command [command-seq])

(extend-type Command
  Stringifiable
  (stringify [this]
    (stringify
     (if (use-gm?)
       (cons "gm" (:command-seq this))
       (:command-seq this)))))

(defn command
  "Create a new Command object. When stringified, \"gm\" will be conditionally
  prepended to the result if (use-gm?)  is true.

  Example Usage:

  (command :convert)
  (command 'convert)
  (command \"convert\")
  "
  [cmd]
  (Command. (list cmd)))

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
  "Define a new command-fn. Takes a symbol and an attr-map.

   TODO: add example usage."
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
  "Define a bunch of command-fn's at once. Accepts an optional map of attributes
  to be applied to each command."
  [attr-map? & specs]
  (let [[attr-map specs] (if (map? attr-map?)
                           [attr-map? specs]
                           [{} (cons attr-map? specs)])
        specs (partition 2 specs)
        defs  (for [[cmd cmd-attr-map] specs]
                (let [attrs (merge attr-map cmd-attr-map)]
                  `(defcommand ~cmd ~attrs)))]
    `(do ~@defs)))
