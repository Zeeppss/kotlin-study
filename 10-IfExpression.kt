fun main() {

    val a = 2
    val b = 5

    var maxValue: Int = if (a > b) {
                            print("a lebih besar")
                            a
                        } else {
                            print("b lebih besar")
                            b
                        }

    println(maxValue)
}

// Maka hasil yang diperoleh adalah b = 5, karena `>` menandakan lebih besar
// Jenis operators >> `7-ComparativeOperations`
