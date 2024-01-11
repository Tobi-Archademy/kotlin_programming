class DeclaringClass {

    // Creating an instance of a class
//    val declaringClass: DeclaringClass = DeclaringClass()

    // Declaring properties of a class
    var name: String = "Unknown"
    var age: Int = 0
    var height: Double = 0.0


}

fun main() {
    // Creating an object of a class
    val obj = DeclaringClass()

    println(obj.age)
    println(obj.height)
    println(obj.name)

    // Accessing the properties of the class and changing them
    val john = DeclaringClass()
    john.name = "John"
    john.age = 30
    john.height = 180.0

    val alice = DeclaringClass()
    alice.name = "Alice"
    alice.age = 22
    alice.height = 165.0

    println("${john.name}: ${john.age} yrs, ${john.height} cm")
    println("${alice.name}: ${alice.age} yrs, ${alice.height} cm")

}