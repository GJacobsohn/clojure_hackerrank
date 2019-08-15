(defn fibonacci [n] 
    (cond
        (<= n 1) 0
        (= n 2) 1
        :else (+ (fibonacci (- n 1)) (fibonacci (- n 2))))
)

(def n (Integer/parseInt (read-line)))
(println (fibonacci n))
