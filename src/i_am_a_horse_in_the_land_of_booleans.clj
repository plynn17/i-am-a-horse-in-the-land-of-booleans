(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (= x nil) (= x false))
    false
    true))

(defn abs [x]
  (if (< x 0)
    (* x -1)
    x))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0)
    true
    false))

(defn fizzbuzz [n]
  (if (divides? 15 n)
    "gotcha!"
    (if (divides? 5 n)
      "buzz"
      (if (divides? 3 n)
        "fizz"
        ""))))

(defn teen? [age]
  (if (and (> age 12) (< age 20))
    true
    false))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (if (number? x)
    (* x 2)
    (if (empty? x)
      nil
      (if (or (list? x) (vector? x))
        (* 2 (count x))
        true))))

(defn leap-year? [year]
  (if (divides? 4 year)
    (if  (divides? 100 year)
      (if (divides? 400 year)
        true
        false)
      true)
    false))

; '_______'
