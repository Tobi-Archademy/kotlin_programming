class Cats(val name: String, val color: String) {
    fun sayMeow() {
        println("$name says: \"Meow\".")
    }

    inner class Bow(val color: String) {
        fun putOnABow() {
            sayMeow()
            println("The bow is on!")
        }

        fun printColor() {
            println("The cat named $name is ${this@Cats.color}, has a $color bow.") // accessing the outer class property using the this@Cats expression
        }
    }
}

fun main() {
    val cats: Cats = Cats("Princess", "white")
    val bow: Cats.Bow = cats.Bow("golden")

    bow.printColor()
    bow.putOnABow()
    
}