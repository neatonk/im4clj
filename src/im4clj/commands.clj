;   Copyright (c) deeperbydesign, inc 2012. All rights reserved.
;   The use and distribution terms for this software are covered by the
;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;   which can be found in the file epl-v10.html at the root of this distribution.
;   By using this software in any fashion, you are agreeing to be bound by
;   the terms of this license.
;   You must not remove this notice, or any other, from this software.

(ns ^{:doc "Command fn's"
      :author "Kevin Neaton"}
  im4clj.commands
  (:refer-clojure :exclude [import compare])
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
  "Build a new command. Prepends \"gm\" to the command if (use-gm?) is true.

   Example Usage:

   (command :convert)
   (command 'convert)
   (command \"convert\")
  "
  [cmd]
  (Command. (list cmd)))

(defn- command-docstr
  [cmd]
  (format "Run a %s command with the given options. See IM/GM documentation for usage." cmd))

(defmacro defcommand
  "Define a new command-fn. Takes a symbol and an attr-map.

   TODO: add example usage."
  [cmd attr-map]
  (let [docstr (command-docstr cmd)
        docstr (if-let [d (:doc attr-map)] (str docstr "\n\n" d) docstr)
        attr-map (assoc attr-map
                   :doc docstr
                   :arglists ''([& options]))]
    `(defn ~cmd
       ~docstr
       ~attr-map
       [& options#]
       (apply run (command ~(str cmd)) options#))))

(defmacro defcommands
  "Define a bunch of command-fn's with the given attributes."
  [attr-map & specs]
  (let [[attr-map specs] (if (map? attr-map)
                           [attr-map specs]
                           [{} (cons attr-map specs)])
        specs (partition 2 specs)
        defs  (for [[cmd cmd-attr-map] specs]
                (let [attrs (merge attr-map cmd-attr-map)]
                  `(defcommand ~cmd ~attrs)))]
    `(do ~@defs)))

(defcommands

  animate
  {:doc "TODO: add example usage."}

  compare
  {:doc "TODO: add example usage."}

  composite
  {:doc "TODO: add example usage."}

  conjure
  {:doc "TODO: add example usage."}

  convert
  {:doc "Example Usage:\n\n(convert \"input.jpg\" (resize 640 480) \"output.jpg\")"}

  display
  {:doc "TODO: add example usage."}

  identify
  {:doc "TODO: add example usage."}

  import
  {:doc "TODO: add example usage."}

  mogrify
  {:doc "TODO: add example usage."}

  montage
  {:doc "TODO: add example usage."}

  stream
  {:doc "TODO: add example usage.\n\nImageMagick only."})
