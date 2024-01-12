// Primary constructor

@Suppress("unused")
class Main(val name: String, val age: Int)  {
    // Initialization code for primary constructors can be placed in initializer blocks, prefixed with init

    init {
        println("New main instance created: $name, $age")
    }

    // Secondary constructor delegating to the primary constructor
    constructor(name: String): this(name, 0) {
        println("Secondary constructor called")
    }
}


// Secondary constructor
class Person {
    var name: String = ""
    var age: Int = 0

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    constructor() {

    }
}


class Size {
    var width: Int = 0
    var height: Int = 0

    // Secondary constructor
    constructor(_width: Int, _height: Int) {
        this.width = _width
        this.height = _height
    }

    // To use multiple constructors in a class, we must ensure each constructor
    //...signature is unique and different from the other:

    constructor(_height: Int) {
        height = _height
    }

    constructor(_width: Int, _height: Double) {
        width = _width
        height = _height.toInt()
    }

    constructor(_height: Double, _width: Int) {
        width = _width
        height = _height.toInt()
    }

    // To be able to initialize the class object with arguments, create a custom constructor
    constructor() {

    }
}
fun main() {
    val person = Person()
    person.name = "John"
    person.age = 22

    println(person)

    val size = Size(3, 4)

    @Suppress("UNUSED_VARIABLE")
    val sized = Size() // No error

    val size1 = Size(7) // uses 1st constructor
    val size2 = Size(0,7) // uses 2nd constructor
    val size3 = Size(0, 7.0) // uses 3rd constructor
    val size4 = Size(7.0, 0) // uses 4th constructor

    println(size.height)
}