fun main() {
    val bob = DataClassLesson("Bob", 28, "Male")
    val john = bob.copy(name = "John")

//    println(bob)
//    println(john)
//    println(bob.component3())

    // Destructuring
    val (name, age, gender) = john
    println(name) // John
    println(age)  // 28
    println(gender) // Male



}