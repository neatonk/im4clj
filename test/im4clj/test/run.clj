(ns im4clj.test.run
  (:use [im4clj run test-common]
        [clojure.test]))

(deftest stringify-test
  (testing "stringify..."
    (testing "string, keyword, symbol, nil"
      (is (= "convert" (stringify "convert")) "stringify a string")
      (is (= "convert" (stringify :convert)) "stringify a keyword")
      (is (= "convert" (stringify 'convert)) "stringify a symbol")
      (is (empty? (stringify nil))) "stringify nil")

    (testing "seqs"
      (is (= ["convert" "input.jpg" "-resize" "100x100" "output.jpg"]
             (stringify [:convert "input.jpg" '-resize "100x100" "output.jpg"]))
          "stringify a seq containing keywords, symbols, and strings.")
      (is (empty? (stringify [nil nil nil])) "stringify a seq of nils")))

  (testing "stringify-all"
    (is (= ["convert" "input.jpg" "-resize" "100x100" "output.jpg"]
           (stringify-all :convert "input.jpg" '-resize "100x100" "output.jpg"))
        "stringify-all with keyword, symbol, and string arguments."))

  (testing "stringify-all"
    (is (= ["convert" "input.jpg" "-resize" "100x100" "output.jpg"]
           (stringify-all :convert "input.jpg" '-resize "100x100" "output.jpg"))
        "stringify-all with keyword, symbol, and string arguments.")))

(deftest run-test
  (let [out-path (tmp-path "run-test-resize-100x100.jpg")]
    (run "convert" test-image "-resize" "100x100" out-path)
    (println out-path)
    (is (exists? out-path))))

(defn test-ns-hook []
  (ensure-tmp-dirs)
  (cleanup-tmp-dir)
  (stringify-test)
  (run-test))
