;   Copyright (c) deeperbydesign, inc 2012. All rights reserved.
;   The use and distribution terms for this software are covered by the
;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;   which can be found in the file epl-v10.html at the root of this distribution.
;   By using this software in any fashion, you are agreeing to be bound by
;   the terms of this license.
;   You must not remove this notice, or any other, from this software.

(ns ^{:doc "Code common to multiple tests"
      :author "Kevin Neaton"}
  im4clj.test-common
  (:use [clojure.java.io :only [file]]))

(def test-image "test/test-image.jpg")
(def test-image-small "test/test-image-small.jpg")

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

;; (defn test-ns-hook
;;   [] nil)
