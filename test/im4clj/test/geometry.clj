;   Copyright (c) deeperbydesign, inc 2012. All rights reserved.
;   The use and distribution terms for this software are covered by the
;   Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;   which can be found in the file epl-v10.html at the root of this distribution.
;   By using this software in any fashion, you are agreeing to be bound by
;   the terms of this license.
;   You must not remove this notice, or any other, from this software.

(ns im4clj.test.geometry
  (:use [im4clj.geometry]
        [clojure.test]))

(deftest test-geometry
  (testing "geometry..."
    (is (= (geometry-spec 100) "100"))
    (is (= (geometry-spec 100 100) "100x100"))
    (is (= (geometry-spec 100 100 "!") "100x100!"))
    (is (= (geometry-spec 100 100 0 0) "100x100+0+0"))
    (is (= (geometry-spec 100 100 0 0 "!") "100x100+0+0!")))

  (testing "valid-geometry-spec? ..."
    (is (valid-geometry-spec? "100x"))
    (is (valid-geometry-spec? "x100"))
    (is (valid-geometry-spec? "100x100"))
    (is (valid-geometry-spec? "100x100!"))
    (is (valid-geometry-spec? "100x100>"))
    (is (valid-geometry-spec? "100x100<"))
    (is (valid-geometry-spec? "100x100+0+0"))
    (is (valid-geometry-spec? "100x100+10-10"))
    (is (valid-geometry-spec? "100x100+10-10!"))
    (is (not (valid-geometry-spec? "10dhjsdkjfh")))
    (is (not (valid-geometry-spec? "x")))
    (is (not (valid-geometry-spec? "100x100+0")))))

(comment
  (test-geometry)
  )
