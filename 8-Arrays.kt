fun main(args: Array<String>) {

    // Elements :   32  0   0   54  0
    // Index    :   0   1   2   3   4

    var myArray = Array<Int>(5) { 0 }   // Mutable
    myArray[0] = 32
    myArray[3] = 54
    myArray[1] = 11

    for (element in myArray) {              // Individual Elements
        println(element)
    }

    println()

    for (index in 0..myArray.size - 1) {
        println(myArray[index])
    }
}
