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
  (:use [im4clj config run]))

(defn command
  "Build a new command. Prepends \"gm\" to the command if (use-gm?) is true.

   Example Usage:

   (command :convert)
   (command 'convert)
   (command \"convert\")
  "
  [cmd]
  (if (use-gm?) (list "gm" cmd) cmd))

(def ^:private command-specs
  {'animate
   {:doc "TODO: add example usage."}

   'compare
   {:doc "TODO: add example usage."}

   'composite
   {:doc "TODO: add example usage."}

   'conjure
   {:doc "TODO: add example usage."}

   'convert
   {:doc "Example Usage:\n\n(convert \"input.jpg\" (resize 640 480) \"output.jpg\")"}

   'display
   {:doc "TODO: add example usage."}

   'identify
   {:doc "TODO: add example usage."}

   'import
   {:doc "TODO: add example usage."}

   'mogrify
   {:doc "TODO: add example usage."}

   'montage
   {:doc "TODO: add example usage."}

   'stream
   {:doc "TODO: add example usage.\n\nImageMagick only."}})

(defn- command-docstr
  [cmd]
  (format "Run a %s command with the given options. See IM/GM documentation for usage." cmd))

(defn- intern-commands
  "Intern all im4clj command fn's in the current namespace or the ns given. See
im4clj.commands."
  ([] (intern-commands *ns*))
  ([ns]
     (doseq [[cmd cmd-meta] command-specs]
       (let [doc (command-docstr cmd)
             doc (if-let [d (:doc cmd-meta)] (str doc "\n\n" d) doc)
             cmd (with-meta cmd
                   (assoc cmd-meta
                     :doc doc
                     :arglists '([& opts])
                     :file "im4clj/commands.clj"))]
         (intern ns cmd
                 (fn [& opts]
                   (let [cmd-str (command :convert)]
                     (apply run cmd-str opts))))))))

(intern-commands)
