fun main() {
    val cars = listOf<String>("BMW", "Honda", "Mercedes")
    println(cars) // output: [BMW, Honda, Mercedes

    // If you need to initialize an empty list, you can use the method emptyList:
    val staff = emptyList<String>()
    println(staff) // output: []

    // Another way of creating a list is to call a builder function - buildList()
    val names = listOf<String>("Emma", "Kim")

    val list = buildList {
        add("Marta")
        addAll(names)
        add("Kira")
    }
    println(list) // output: [Marta, Emma, Kim, Kira]


    val partyList = listOf("Fred", "Emma", "Isabella", "James", "Olivia")

    if (!partyList.isEmpty()) {
        val size = partyList.size
        val whoIsFirst = partyList[0]

        println("The party will not be lonesome! We already got $size people. And $whoIsFirst was the first to arrive today!")
        // The party will not be lonesome! We already got 5 people. And Fred was the first to arrive today!

        println("Emma came in ${partyList.indexOf("Emma") + 1}") // Emma came in 2

        println("Guys, is it true that Isabella came? It's ${partyList.contains("Isabella")}") // Guys, is it true that Isabella came? It's true
    }


    // Iterating through the elements with for loop

    val participants = listOf("Fred", "Emma", "Isabella")

    for (participant in participants) {
        println("Hello $participant!")
    }

// Hello Fred!
// Hello Emma!
// Hello Isabella!

    // List Idiom - shortest way of creating a list
    val listIdiom = listOf("a", "b", "c")
}

