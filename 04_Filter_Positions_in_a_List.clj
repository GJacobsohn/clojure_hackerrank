(fn[lst]
    (doseq [x 
            (for [[idx y] (map-indexed vector lst):when(odd? idx)] y)] 
        (println x))
)
