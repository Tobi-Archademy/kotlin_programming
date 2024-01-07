fun main() {

    // Monads in Kotlin
    val result: Result<Unit> = Result.runCatching {
        somethingRisky()
    }
    result.map {
        value -> doSomethingWith(value)
    }


    // Functors in Kotlin
    val numbers = listOf(1, 2, 3)
    val squared = numbers.map { it * it }


    // Tail Recursion
    tailrec fun factorial(n: Int, acc: Int = 1): Int {
        return if (n == 1) acc else factorial(n-1, n * acc)
    }
}

fun somethingRisky() {}

fun doSomethingWith(value: Unit) {}