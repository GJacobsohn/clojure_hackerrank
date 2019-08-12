; Prints all elemts that are smaller than delim from lst
(fn [delim lst]
    (doseq [x (for [x lst :when (< x delim)] x) ] 
        (println x))
)
