(ns im4clj.test.config
  (:use [im4clj.config]
        [clojure.test]))

(deftest config-test
  (testing "defaults..."
    (is (false? (use-gm?)) "im4clj uses ImageMagick by default."))

  (testing "with-gm/with-im..."
    (is (true? (with-gm (use-gm?))) "Use GM.")
    (is (false? (with-im (use-gm?))) "Use IM."))

  (testing "use-gm/use-gm!"
    (is (nil? (use-gm)) "*use-gm* is nil by default.")
    (use-gm!)
    (is (true? (use-gm)) "*use-gm* is now true.")
    (use-gm! false)
    (is (false? (use-gm)) "*use-gm* is false again.")))
