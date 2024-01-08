import kotlin.math.abs

fun printLine(line: String = "", end: String = "\n") = print("$line$end")

fun main() {
    printLine("Hello, Kotlin", "!!!") // prints "Hello, Kotlin!!!"
    printLine("Kotlin") // prints "Kotlin" with an ending newline
    printLine() // prints an empty line like println()

    println(findMax(11, 15)) // 15
    println(findMax(11, 15, true)) // 15
    println(findMax(-4, -9)) // -4
    println(findMax(-4, -9, true)) // -9

    numbers(1, 2, 3)

}

// Mixing default and regular parameters during declaration

// Adding default values to function parameters during declaration is called Idiom in Kotlin
fun findMax(n1: Int, n2: Int, absolute: Boolean = false): Int {
    val v1: Int
    val v2: Int

    if (absolute) {
        v1 = abs(n1)
        v2 = abs(n2)
    } else {
        v1 = n1
        v2 = n2
    }

    return if (v1 > v2) n1 else n2
}

fun numbers(a: Int = 0, b: Int, c: Int) {}