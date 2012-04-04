;   Copyright (c) deeperbydesign, inc 2012. All rights reserved.
;   The use and distribution terms for this software are covered by the
;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;   which can be found in the file epl-v10.html at the root of this distribution.
;   By using this software in any fashion, you are agreeing to be bound by
;   the terms of this license.
;   You must not remove this notice, or any other, from this software.

(ns ^{:doc "Command function's. Uses im4clj.command/defcommands to define named series of named fn's which run the similarly named IM/GM commands."
      :author "Kevin Neaton"}
  im4clj.commands
  (:refer-clojure :exclude [import compare])
  (:use [im4clj.command]))

(defcommands
  {:project "GraphicsMagick"
   :version "1.3.13"}

  animate
  {:examples '[(animate "cockatoo.*")
               (animate "-map" "best" "cockatoo.*" )]
   :arglists '([options? files*])}

  compare
  {:arglists '([options? reference-image options? compare-image options?])}

  composite
  {:arglists '([options? change-image base-image mask-image? output-image])}

  conjure
  {:arglists '([options? script.msl & more])}

  convert
  {:examples '[(convert "input.jpg" "-resize" "640x480" "output.jpg")
               (convert (-> "input.jpg" (-resize 640 480)) "output.jpg")
               (convert (-resize "input.jpg" 640 480) "output.jpg")]
   :arglists '([options? input-file? options? output-file])}

  display
  {:arglists '([options? files* & more])}

  identify
  {:arglists '([files*])}

  import
  {:arglists '([options? file])}

  mogrify
  {:arglists '([options? files*])}

  montage
  {:arglists '([options? file options-and-files? output-file])})

;; (defcommand stream
;;   {:project "ImageMagick"
;;    :example "\n\nImageMagick only."})
