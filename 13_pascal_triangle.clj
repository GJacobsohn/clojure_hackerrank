
(defn faculty [n] (if (= n 0) 1 (reduce * (for [x (range 1 (inc n))] x))))

(defn binomial_coefficient [n r] (let [n! (faculty n) 
                                       r! (faculty r) 
                                       n-r! (faculty (- n r))]
    (/ n! (* r! n-r!))
))

(def pascal_triangle (fn 
    ([K] (pascal_triangle (dec K) 0) )
    ([K n] 
        (doseq [i (range 0 (inc n))] 
            (print (binomial_coefficient n i) ""))         
        (if (< n K) 
            (do      
                (println)
                (recur K (inc n))
            )
        )
    )
))

(def K (Integer/parseInt (read-line)))
(pascal_triangle K)
