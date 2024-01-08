fun main() {
    val list = mutableListOf(1, 2, 3)
    // Adds an element to the list.
    list.add(4) // list becomes [1, 2, 3, 4]

    // Inserts an element at a specified index.
    list.add(1, 5) // list becomes [1, 5, 2, 3, 4]

    // Removes an element from the list.
    list.remove(5) // list becomes [1, 2, 3, 4]

    // Removes an element at a specified index.
    list.removeAt(0) // list becomes [2, 3, 4]

    // Updates an element at a specified index.
    list.set(1, 10) // list becomes [2, 10, 4]

    // Removes all elements from the list.
    list.clear() // list becomes []


    // Iteration

    // Using for loop to iterate over the list
    val mutableList = mutableListOf("apple", "banana", "cherry")
    for (item in mutableList) {
        println(item)
    }

    // Using the forEach method to iterate over the list
    mutableList.forEach { item ->
        printLine(item)
    }


    // Batch Operations

    val lengths = mutableList.map { it.length } // map function modifies each element
    val longFruits = mutableList.filter { it.length > 5 } // filter function retains elements that fulfill a condition
    mutableList.forEach { println(it.toUpperCase()) } // forEach function carries out an action on each element

    println(lengths)
    println(longFruits)


    // Modifying Lists

    // From Android Api 24 upward
    mutableList.replaceAll { it.toUpperCase() }

    // Api 23 and lower
    val upperCaseList = mutableList.map { it.toUpperCase() }
    mutableList.clear()
    mutableList.addAll(upperCaseList)

    println(mutableList[mutableList.size - 1])
    println(mutableList[mutableList.lastIndex])
    println(mutableList.last())

}