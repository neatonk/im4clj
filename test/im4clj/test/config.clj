(ns im4clj.test.config
  (:use [im4clj.config]
        [clojure.test]))

(deftest config-test
  (testing "defaults..."
    (is (false? (use-gm?))
        "im4clj should use ImageMagick by default."))

  (testing "with-gm/with-im..."
    (is (true? (with-gm (use-gm?))))
    (is (false? (with-im (use-gm?))))))
