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
  (:use [im4clj.command]))

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
