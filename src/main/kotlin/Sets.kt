fun main() {
    val visitors1 = setOf<String>("Vlad", "Vanya", "Liza", "Liza")
    println(visitors1) // output: [Vlad, Vanya, Liza]

    // Another means of Initialization
    val languages = setOf("English", "Russian", "Italian")

    // Initializing an empty set
    val numbers = emptySet<Int>()
    println(numbers) // output: []

    // Another way to create a set is to call the buildSet() method
    val letters = setOf<Char>('b', 'c')

    val set = buildSet<Char> {
        add('a')
        addAll(letters)
        add('d')
    }
    println(set) // output: [a, b, c, d]

    // Converting a mutableList to a set
    val groceries = mutableListOf("Pen", "Pineapple", "Apple", "Super Pen", "Apple", "Pen")
    println(groceries.toSet()) // [Pen, Pineapple, Apple, Super Pen]


    // Iterating over a set of collections
    val visitors = setOf("Vlad", "Liza", "Vanya", "Nina")

    for (visitor in visitors) {
        println("Hello $visitor!")
    }

// output:
// Hello Vlad!
// Hello Liza!
// Hello Vanya!
// Hello Nina!



    // Working with MutableSet()
    val words = mutableSetOf<String>("Apple", "Coke")
    val friendsWords = mutableSetOf<String>("Banana", "Coke")

    words.add("Phone")
    words.add("Controller")

    friendsWords.add("Phone")
    friendsWords.add("Pasta")
    friendsWords.add("Pizza")

    words.addAll(friendsWords)

    println(words) // [Apple, Coke, Phone, Controller, Banana, Pasta, Pizza]

    // Removing elements from the MutableSet
    val groceryList = mutableSetOf("Apple", "Water", "Banana", "Pen")

    groceryList.remove("Apple")
    println(groceries) // [Water, Banana, Pen]

    val uselessGroceries = setOf("Banana", "Pen")
    groceryList.removeAll(uselessGroceries)
    println(groceryList) // [Water]

    groceryList.clear()
    println(groceryList) // []


    // Iterating over MutableSet
    val places = mutableSetOf("Saint-Petersburg", "Moscow", "Grodno", "Rome")

    for (place in places) {
        println(place)
    }

// Saint-Petersburg
// Moscow
// Grodno
// Rome
}