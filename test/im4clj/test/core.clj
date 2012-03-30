;   Copyright (c) deeperbydesign, inc 2012. All rights reserved.
;   The use and distribution terms for this software are covered by the
;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;   which can be found in the file epl-v10.html at the root of this distribution.
;   By using this software in any fashion, you are agreeing to be bound by
;   the terms of this license.
;   You must not remove this notice, or any other, from this software.

(ns im4clj.test.core
  (:refer-clojure :exclude [import compare])
  (:use [im4clj core test-common]
        [clojure test template [string :only [join]]]))

(deftest convert-tests
  (do-template
   [opt]
   (let [im-or-gm (if (use-gm?) "gm" "im")
         out-path (tmp-path (apply str im-or-gm "/" "convert" opt))
         ret-val  (convert test-image-small opt out-path)]
     (println out-path)
     (is (nil? ret-val))
     (is (exists? out-path)))

   (-colorspace "GRAY")
   (-crop 100 100 0 0)
   (-border 10 10)
   (-bordercolor "#123")
   ;;(-borderwidth "10x10")
   (-contrast)
   (-define "jpeg:preserve-settings")
   (-depth 8)
   (-draw "circle 100,100 150,150")
   (-flip)
   (-flop)
   ;;(-font "Arial.ttf")
   (-gaussian 3)
   (-intent "Perceptual")
   (-limit "memory" "32MiB")
   (-quality 100)
   (-resize 100 100) ;this should work with 1 arg as well.
   (-rotate -90)
   (-set "bogus" "true")
   (-sharpen 3)
   ;;(-text-font "Courier.ttf") failing...
   (-type "Optimize")
   (-unsharp 3)))

(defn test-ns-hook []
  (ensure-tmp-dirs)
  (cleanup-tmp-dir)
  (with-im
    (convert-tests))
  (with-gm
    (convert-tests)))
