;   Copyright (c) deeperbydesign, inc 2012. All rights reserved.
;   The use and distribution terms for this software are covered by the
;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;   which can be found in the file epl-v10.html at the root of this distribution.
;   By using this software in any fashion, you are agreeing to be bound by
;   the terms of this license.
;   You must not remove this notice, or any other, from this software.

(ns ^{:doc "ImageMagick for Clojure."
      :author "Kevin Neaton"}
  im4clj.core
  (:refer-clojure :exclude [import compare])
  (:use [im4clj.util ns])
  (:require [im4clj commands config options]))

(immigrate 'im4clj.commands
           'im4clj.config
           'im4clj.options)
