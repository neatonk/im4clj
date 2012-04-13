(ns im4clj.test.command
  (:use [im4clj command config [run :only [stringify]]]
        [clojure.test]))

(deftest command-test
  (let [convert-cmd (command :convert)
        convert-cmd-true (command :convert true)
        convert-cmd-false (command :convert false)]
    (is (= ["convert"] (stringify convert-cmd)))
    (is (= ["gm" "convert"] (stringify convert-cmd-true)))
    (is (= ["convert"] (stringify convert-cmd-false)))

    (is (= ["gm" "convert"] (with-gm (stringify convert-cmd))))
    (is (= ["gm" "convert"] (with-gm (stringify convert-cmd-true))))
    (is (= ["convert"] (with-gm (stringify convert-cmd-false))))

    (is (= ["convert"] (with-im (stringify convert-cmd))))
    (is (= ["gm" "convert"] (with-im (stringify convert-cmd-true))))
    (is (= ["convert"] (with-im (stringify convert-cmd-false))))))
