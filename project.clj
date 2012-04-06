(defproject im4clj "0.0.1-SNAPSHOT"
  :description "ImageMagick for Clojure. im4clj is a wrapper for the ImageMagick and GraphicsMagick commandline tools. It is heavily influenced by, and partly based on im4java. Use im4clj.core to get started."
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo
            :comments "same as Clojure"}
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [org.im4java/im4java "1.2.0"]
                 [clj-glob "1.0.0"]]
  :autodoc {:name "im4clj",
            :page-title "im4clj API Documentation"
            :copyright "Copyright 2012, deeperbydesign, inc."
            :web-src-dir "http://github.com/neatonk/im4clj/blob/"
            :web-home "http://neatonk.github.com/im4clj/"})
