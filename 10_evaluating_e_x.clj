
(def n (Integer/parseInt (clojure.string/trim (read-line))))

(doseq [n-itr (range n)]
    (def x (Double/parseDouble (clojure.string/trim (read-line))))
    ( let [ fac (fn [n] (reduce * (for [x (range 1 (inc n))] x)))
            e_x (fn [y n] (/ (Math/pow y n) (fac n)))
            e_xn (fn [y n] (+ 1 y (reduce + (for [n1 (range 2 n)] (e_x y n1)))))
           ]
        (println (format "%.4f" (e_xn x 10)))
    )
)

