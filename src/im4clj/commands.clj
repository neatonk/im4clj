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

;; IM/GM Command's
(defn convert
  "Run a convert command with the given options.

   Example Usage:

   (convert \"input.jpg\" (resize 640 480) \"output.jpg\")
  "
  [& opts]
  (let [cmd (command :convert)]
    (apply run cmd opts)))
