;   Copyright (c) deeperbydesign, inc 2012. All rights reserved.
;   The use and distribution terms for this software are covered by the
;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;   which can be found in the file epl-v10.html at the root of this distribution.
;   By using this software in any fashion, you are agreeing to be bound by
;   the terms of this license.
;   You must not remove this notice, or any other, from this software.

(ns im4clj.test.core
  (:use [im4clj.core]
        [clojure.test]
        [clojure.string :only [join]]
        [clojure.java.io :only [file]]))

(def test-image "test/test-image.jpg")

(def tmp-dir "test/tmp")
(def tmp-dir-im (str tmp-dir "/im"))
(def tmp-dir-gm (str tmp-dir "/gm"))

(defn tmp-path
  [file-name]
  (str tmp-dir "/" file-name))

(defn exists?
  [path]
  (-> path file .exists))

(defn ensure-tmp-dirs
  []
  (when-not (exists? tmp-dir)
    (-> tmp-dir file .mkdir))
  (when-not (exists? tmp-dir-im)
    (-> tmp-dir-im file .mkdir))
  (when-not (exists? tmp-dir-gm)
    (-> tmp-dir-gm file .mkdir)))

(defn cleanup-tmp-dir []
  (doseq [f (-> tmp-dir file file-seq)]
    (when-not (.isDirectory f)
      (.delete f))))

;; (defn fixture-setup-tmp-dirs [f]
;;   (ensure-tmp-dirs)
;;   (cleanup-tmp-dir)
;;   (f))

;; (use-fixtures :once fixture-setup-tmp-dirs)

;; Tests...
(deftest config-test
  (testing "defaults..."
    (is (false? (use-gm?))
        "im4clj should use ImageMagick by default."))

  (testing "with-gm/with-im..."
    (is (true? (with-gm (use-gm?))))
    (is (false? (with-im (use-gm?))))))

;; commands
(deftest command-test
  (let [im-convert-cmd (stringify (command :convert))
        gm-convert-cmd (stringify (with-gm (command :convert)))]
    (is (= ["convert"] im-convert-cmd))
    (is (= ["gm" "convert"] gm-convert-cmd))))

;; options
(defn opt-symbol
  [opt]
  (symbol "im4clj.core" (name opt)))

;; IM/GM tests
(def options
  (map opt-symbol
       ['colorspace 'crop 'border 'bordercolor 'borderwidth 'contrast 'define
        'depth 'draw 'flip 'flop 'font 'gaussian 'intent 'limit 'quality 'resize
        'rotate 'set 'sharpen 'text-font 'type 'unsharp]))

(deftest existing-options-test
  (doseq [opt options]
    (is (resolve opt))))

(deftest convert-tests
  (doseq [opt ['(colorspace "GRAY")
               '(crop "100x100+0+0")
               '(border "10x10")
               '(bordercolor "#123")
               ;'(borderwidth "10x10")
               '(contrast)
               ;'(-contrast)
               ;'(+contrast)
               '(define "jpeg:preserve-settings")
               '(depth 8)
               '(draw "circle 100,100 150,150")
               '(flip)
               '(flop)
               '(font "Arial.ttf")
               '(gaussian 3)
               '(intent "Perceptual")
               '(limit "memory" "32MiB")
               '(quality 100)
               '(resize 100)
               '(rotate -90)
               ;'(set "bogus" "true")
               '(sharpen 3)
               ;'(text-font "Courier.ttf")
               ;'(type "Optimize")
               '(unsharp 3)]]
    (let [im-or-gm (if (use-gm?) "gm" "im")
          out-path (tmp-path (str im-or-gm "/convert-" (join "-" opt) ".jpg"))
          opt-var  (resolve (-> opt first opt-symbol))
          opt-args (rest opt)
          test-str (join " " (cons opt-var opt-args))]

      (testing test-str
        (println out-path)
        (let [return-val (convert test-image
                                  (apply opt-var opt-args)
                                  out-path)]
          (is (nil? return-val))
          (is (exists? out-path)))))))

(defn test-ns-hook []
  (ensure-tmp-dirs)
  (cleanup-tmp-dir)
  (config-test)
  (command-test)
  (with-im
    (convert-tests))
  (with-gm
    (convert-tests)))
