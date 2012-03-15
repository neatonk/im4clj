(ns im4clj.test.defoptions
  (:use [im4clj.defoptions]
        [clojure.test]
        [clojure.template]))

(deftest argspec-test
  (testing "argspecs..."
    (are [in out] (= (expand-argspec in) out)
         '([])
         '([])

         ;;-label
         '([name])
         '([name])

         ;;-limit
         '([type] [value])
         '([[type] [value]])

         ;;-geometry
         '([width "x" height ["+" x "+" y] [special]])
         '([width "x" height]
             [width "x" height "+" x "+" y]
               [width "x" height "+" x "+" y special])

         ;;-level
         '([black-point ["," gamma] ["," white-point] [percent?]])
         '([black-point]
             [black-point "," gamma]
               [black-point "," gamma "," white-point]
                 [black-point "," gamma "," white-point percent?])))

  (testing "multi-word argspecs..."
    (are [in out] (= (expand-argspec in) out)
         '([w] [h] [x] [y])
         '([[w] [h] [x] [y]])

         '([w] [h] [x] [[y]])
         '([[w] [h] [x]]
             [[w] [h] [x] [y]])

         '([w] [h] [[x]] [[y]])
         '([[w] [h]]
             [[w] [h] [x]]
               [[w] [h] [x] [y]])

         '([w] [[h]] [[x]] [[y]])
         '([[w]]
             [[w] [h]]
               [[w] [h] [x]]
                 [[w] [h] [x] [y]])

         '([[w]] [[h]] [[x]] [[y]])
         '([]
             [[w]]
               [[w] [h]]
                 [[w] [h] [x]]
                   [[w] [h] [x] [y]])

         '([[w]] [[h]] [[x]] [y])
         '([]
             [[w]]
               [[w] [h]]
                 [[w] [h] [x] [y]])

         '([[w]] [[h]] [x] [y])
         '([]
             [[w]]
               [[w] [h] [x] [y]])

         '([[w]] [h] [x] [y])
         '([]
             [[w] [h] [x] [y]])

         '([w "," h] ["," x ["," y]])
         '([[w "," h] ["," x]]
             [[w "," h] ["," x "," y]]))))

(comment
  (run-all-tests)
  )
