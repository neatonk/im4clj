(ns im4clj.test.magick
  (:use [im4clj.magick]
        [im4clj.test-common]
        [clojure.test] :reload)
  (:require [clojure.core :as clj]))


(defn-magick convert-grayscale
  [in-path out-path]
  (convert in-path (colorspace "GRAY") out-path))

(defn-magick resize-100-100
  [in-path out-path]
  (convert in-path (resize 100 100) out-path)
  out-path)

(defn-magick polaroid
  [in-path out-path size]
  ;; convert spiral_stairs_sm.jpg -thumbnail 120x120 \
  ;;         -bordercolor white -background black  +polaroid  poloroid.png
  (convert in-path (thumbnail size size)
           (bordercolor "white") (background "black")
           "+polaroid"
           out-path))

(deftest test-magick
  (convert-grayscale test-image (tmp-path "convert-grayscale.jpg"))
  (polaroid test-image (tmp-path "convert+polaroid.png") 200)
  (resize-100-100 test-image (tmp-path "convert-resize-100-100.jpg")))

(defn test-ns-hook []
  (ensure-tmp-dirs)
  (cleanup-tmp-dir)
  (test-magick))
