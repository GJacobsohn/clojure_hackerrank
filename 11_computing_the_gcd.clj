; Computes the GCD
(let [f (fn [a b] (if (= a b) 
                         a 
                         (recur (if (> a b) (- a b) a) (if (< a b) (- b a) b)) 
    ) ) [m n] (map read-string (re-seq #"\d+" (read-line)))] (println (f m  n)))


