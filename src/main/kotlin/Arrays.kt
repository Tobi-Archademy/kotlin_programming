fun main() {
    val numberS = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9) // It stores 5 elements of the Int type
    println(numberS.joinToString()) // 1, 2, 3, 4, 5

    val characters = charArrayOf('K', 't', 'l') // It stores 3 elements of the Char type
    println(characters.joinToString()) // K, t, l

    val doubles = doubleArrayOf(1.25, 0.17, 0.4) // It stores 3 elements of the Double type
    println(doubles.joinToString()) // 1.25, 0.17, 0.4

    // The joinToString() function converts an array into a string.


    // Creating an Array of a specified size

    val sNumbers = IntArray(5) // an array of 5 integer numbers
    println(sNumbers.joinToString())

    val sDoubles = DoubleArray(7) // an array of 7 doubles
    println(sDoubles.joinToString())

    val number = IntArray(10) { i -> i + 1 }
    println("Numbers: ${number.joinToString()}")
// 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    val onlyOne = IntArray(10) { 1 }
    println("Only 1: ${onlyOne.joinToString()}")
// 1, 1, 1, 1, 1, 1, 1, 1, 1, 1
    val onlyMinusOne = IntArray(10).apply { fill(-1) }
    println("Only -1: ${onlyMinusOne.joinToString()}")
// -1, -1, -1, -1, -1, -1, -1, -1, -1, -1


    // Reading Array from Input
    val inputNumbers = IntArray(5) {
        readln().toInt()
    }
    println(inputNumbers.joinToString())

    val inputNumbersSameLine = readln().split(" ").map { it.toInt() }.toTypedArray()
    println(inputNumbersSameLine.joinToString())


    // Using regex to ignore spaces and tabs

    val regex = "\\s+".toRegex()
    val str = "1 2\t\t3  4\t5  6"
    val nums = str.split(regex).map { it.toInt() }.toTypedArray()
    println(nums.joinToString()) // 1, 2, 3, 4, 5, 6


    // Checking the size of an ARRAY
    // You cannot change the size of an array after it has been created.
    val size = intArrayOf(1, 2, 3, 4, 5)
    println(size.size) // 5


    // Accessing the elements of an array and changing the values
    val numbers = IntArray(3) // numbers: 0, 0, 0

    numbers[0] = 1 // numbers: 1, 0, 0
    numbers[1] = 2 // numbers: 1, 2, 0
    numbers[2] = numbers[0] + numbers[1] // numbers: 1, 2, 3

    println(numbers[0]) // 1, the first element
    println(numbers[2]) // 3, the last element

    // Accessing the last element
    val alphabet = charArrayOf('a', 'b', 'c', 'd')

    val last = alphabet[alphabet.size - 1]    // 'd'
    val prelast = alphabet[alphabet.size - 2] // 'c'

    println(alphabet.first())   // 'a'
    println(alphabet.last())    // 'd'
    println(alphabet.lastIndex) // 3


    // Comparing Arrays

    val numbers1 = intArrayOf(1, 2, 3, 4)
    val numbers2 = intArrayOf(1, 2, 3, 4)
    val numbers3 = intArrayOf(1, 2, 3)

    println(numbers1.contentEquals(numbers2)) // true
    println(numbers1.contentEquals(numbers3)) // false
}