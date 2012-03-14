(ns im4clj.test.command
  (:use [im4clj command config [run :only [stringify]]]
        [clojure.test]))

(deftest command-test
  (let [convert-cmd (command :convert)]
    (is (= ["convert"] (stringify convert-cmd)))
    (is (= ["gm" "convert"] (with-gm (stringify convert-cmd))))))
