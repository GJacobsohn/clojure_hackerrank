;Hackerrank exercise: "Hello World N Times"
(defn hello_word_n_times [n]
    (println "Hello World")
    (if (> n 1) (recur (dec n))) 
)


(def n (Integer/parseInt (read-line)))
(hello_word_n_times n)
