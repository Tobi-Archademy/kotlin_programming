// Primary constructor
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
    val name: String
    var age: Int
    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }
}
