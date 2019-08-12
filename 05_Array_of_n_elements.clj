(
    let [lines (line-seq (java.io.BufferedReader. *in*))] (
        println(

            (fn[n] (for [x (range 0 n)] 1))

            (Integer. (first lines))
        )
    )
)
