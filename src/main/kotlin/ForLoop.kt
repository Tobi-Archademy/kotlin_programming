fun main() {
    // This is the syntax the for loop has:
//    for (element in source) {
//        // body of loop
//    }


    // Iterating through a range
    for (i in 1..4) {
        println(i)
    }

    // It is also possible to iterate through a range of characters:
    for (ch in 'a'..'c') {
        println(ch)
    }

    // Iterating over a string in reversed order
    val str = "Hello!"
    for (ch in str.reversed()) {
        println(ch)
    }

    // Iterating over backwards
    for (i in 4 downTo 1) {
        println(i)
    }

    // Excluding the upper limit
    for (i in 1 until 4) {
        println(i) //prints 1, 2, 3
    }


    // Specifying a step

    // Prints only odd numbers
    for (i in 1..7 step 2) {
        println(i)
    }

    // Backward iteration of odd numbers
    for (i in 7 downTo 1 step 2) {
        println(i)
    }


    // An example: the factorial of a number

    val n = readln().toInt()
    var result = 1

    for (i in 2..n) {
        result *= i
    }
    println(result)


    // An example: the multiplication table of even numbers
    for (i in 2..10 step 2) {
        for (j in 2..10 step 2) {
            print(i * j)
            print("\t")
        }
        println()
    }

}