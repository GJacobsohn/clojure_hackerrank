; iterates over a list and repeatly prints every elem `num` times
; num      number of prints of an element
; lst      list with elements that should be printed `num`times
(fn[num lst]
    (doseq [elem lst i (range 0 num)] 
        (println elem)
    )
)
