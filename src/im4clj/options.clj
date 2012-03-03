;   Copyright (c) deeperbydesign, inc 2012. All rights reserved.
;   The use and distribution terms for this software are covered by the
;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;   which can be found in the file epl-v10.html at the root of this distribution.
;   By using this software in any fashion, you are agreeing to be bound by
;   the terms of this license.
;   You must not remove this notice, or any other, from this software.

(ns ^{:doc "Namespace used to generate option fn's"
      :author "Kevin Neaton"}
  im4clj.options
  (:use [im4clj.geometry]))

(defn- option-name
  "Converts a keyword, symbol, or string to an IM commandline option by
   prepending a \\- unless it begins with #{\\+ \\-} already."
  [opt-name]
  {:post [(#{\+ \-} (first %))]}
  (let [opt-name (name opt-name)]
    (if (#{\+ \-} (first opt-name))
      opt-name
      (str "-" opt-name))))

(defn- option
  "Build a new commandline option. Takes a keyword, symbol, or string followed
   by zero or more args. Returns a seq of the form [opt-str & args].

   Example Usage:

   (option :resize 640 480)
   (option 'resize 640 480)
   (option \"resize\" 640 480)
   (option \"-resize\" 640 480)
   => (\"-resize\" 640 480)

   (option :+adjoin)
   => (\"+adjoin\")
  "
  [opt & args]
  (let [opt-str (option-name opt)]
    (cons opt-str args)))

(def ^:private opt-specs
  {'border
   {:doc "TODO: add docstring."
    :arglists '([width height])}

   'bordercolor
   {:doc "TODO: add docstring."
    :arglists '([color])}

   'borderwidth
   {:doc "TODO: add docstring."
    :arglists '([width height [offset-x offset-y]? special?])}

   'colorspace
   {:doc "TODO: add docstring."
    :arglists '([value])}

   'contrast
   {:doc "TODO: add docstring."
    :arglists '([])}

   'crop
   {:doc "TODO: add docstring."
    :arglists '([width height [offset-x offset-y]? special?])}

   'define
   {:doc "TODO: add docstring."
    :arglists '([key] [key value])}

   'depth
   {:doc "TODO: add docstring."
    :arglists '([value])}

   'draw
   {:doc "TODO: add docstring."
    :arglists '([string])}

   'flip
   {:doc "TODO: add docstring."
    :arglists '([])}

   'flop
   {:doc "TODO: add docstring."
    :arglists '([])}

   'font
   {:doc "TODO: add docstring."
    :arglists '([name])}

   'gaussian
   {:doc "TODO: add docstring."
    :arglists '([radius] [radius sigma])}

   'intent
   {:doc "TODO: add docstring."
    :arglists '([type])}

   'limit
   {:doc "TODO: add docstring."
    :arglists '([type value])}

   'quality
   {:doc "TODO: add docstring."
    :arglists '([value])}

   'resize
   {:doc "resize an image."
    :arglists '([width] [width height])}

   'rotate
   {:doc "TODO: add docstring."
    :arglists '([degrees])}

   ;; 'set
   ;; {:doc "TODO: add docstring."
   ;;  :arglists '([attribute value])}

   'sharpen
   {:doc "TODO: add docstring."
    :arglists '([radius] [radius sigma])}

   'text-font
   {:doc "TODO: add docstring."
    :arglists '([name])}

   ;; 'type
   ;; {:doc "TODO: add docstring."
   ;;  :arglists '([type])}

   'unsharp
   {:doc "TODO: add docstring."
    :arglists '([])}})

(defn- intern-imops
  ([] (intern-imops *ns*))
  ([ns]
     (doseq [[opt opt-meta] opt-specs]
       (let [doc (format "Returns a new %s option for ImageMagick/GraphicsMagick. See IM/GM documentation." opt)
             doc (str doc "\n\n" (:doc opt-meta))
             opt (with-meta opt
                   (assoc opt-meta
                     :doc doc
                     :file "im4clj/options.clj"
                     :type ::option))]
         (intern ns opt (partial option opt))))))

(intern-imops)
