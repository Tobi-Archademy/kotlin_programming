fun isOdd(x: Int) = x % 2 != 0

fun isEven(x: Int) = x % 2 == 0

fun printNumbers(numbers: MutableList<Int>, filter: (Int) -> Boolean) {
    for (number in numbers) {
        if (filter(number))
            print("$number ")
    }
}

fun main() {
    val numbers = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val oddFunction = ::isOdd
    print("Odd numbers: ")
    printNumbers(numbers, oddFunction)
    print("\nEven numbers: ")
    printNumbers(numbers, ::isEven)

    // Creating a function reference for a class method
    val person: Persons = Persons("Sara", "Rogers")
    val personFun: () -> String = person::printFullName

    println(personFun.invoke())
    print(personFun()) // printing without calling the invoke() method


    // Using the function referencing on a class from the kotlin standard library
    val dec: (Int) -> Int = Int::dec
    print(dec(18)) // decrease int-value by 1
    //val dec: (Int) -> Int = {x -> x.dec()} -> the same function as lambda

    val inc: (Int) -> Int = Int::inc
    //val inc: (Int) -> Int = {x -> x.inc()} -> the same function as lambda
    println(inc(22)) // increase int-value by 1
}


// Syntax for referencing functions that belong to a class objectOrClass::functionName

class Persons(val name: String, val lastname: String) {

    fun printFullName(): String {
        return("full name: $name $lastname")
    }
}