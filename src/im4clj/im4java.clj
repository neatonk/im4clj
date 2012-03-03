;   Copyright (c) deeperbydesign, inc 2012. All rights reserved.
;   The use and distribution terms for this software are covered by the
;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;   which can be found in the file epl-v10.html at the root of this distribution.
;   By using this software in any fashion, you are agreeing to be bound by
;   the terms of this license.
;   You must not remove this notice, or any other, from this software.

(ns ^{:doc "Wrapper functions and utils for running shell commands with im4java."
      :author "Kevin Neaton"}
  im4clj.im4java
  (:use [im4clj config])
  (:import [org.im4java.core ImageCommand Operation CompositeCmd ConvertCmd
            DcrawCmd DisplayCmd ExiftoolCmd GraphicsMagickCmd IdentifyCmd
            ImageMagickCmd JpegtranCmd MogrifyCmd MontageCmd UFRawCmd]
           [org.im4java.process ProcessStarter]))

;; util fn's
(defn search-path
  "Get the system search path used by im4java."
  ([] (ProcessStarter/getGlobalSearchPath)))

(defn search-path!
  "Set the system search path used by im4java."
  ([path]
     (ProcessStarter/setGlobalSearchPath path)
     path))

;; core fn's
(defn command
  "Create and return a new im4java ImageCommand from the string(s) provided."
  {:tag ImageCommand}
  [cmd & more]
  {:pre [(string? cmd) (every? string? more)]}
  (ImageCommand. (into-array String (cons cmd more))))

(defn operation
  "Create and return a new im4java Operation from the string(s) provided."
  {:tag Operation}
  [& opt-strs]
  {:pre [(every? string? opt-strs)]}
  (-> (Operation.) (.addRawArgs (into-array String opt-strs))))

(defn- run*
  "Run an ImageCommand command."
  [^ImageCommand cmd ^Operation op & imgs]
  (let [imgs (->> imgs (map str) object-array)]
    (.run cmd op imgs)))

(defn run
  "Create and run an im4java ImageCommand from the string(s) provided.

   Example Usage:

   (run \"convert\" \"input.jpg\" \"resize\" \"100\" \"output.jpg\")"
  [cmd & op]
  {:pre [(string? cmd) (every? string? op)]}
  (let [cmd  (command cmd)
        op   (apply operation op)]
    (run* cmd op)))
