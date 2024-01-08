fun main() {
//    val list = mutableListOf(1, 2, 3)
//    // Adds an element to the list.
//    list.add(4) // list becomes [1, 2, 3, 4]
//
//    // Inserts an element at a specified index.
//    list.add(1, 5) // list becomes [1, 5, 2, 3, 4]
//
//    // Removes an element from the list.
//    list.remove(5) // list becomes [1, 2, 3, 4]
//
//    // Removes an element at a specified index.
//    list.removeAt(0) // list becomes [2, 3, 4]
//
//    // Updates an element at a specified index.
//    list.set(1, 10) // list becomes [2, 10, 4]
//
//    // Removes all elements from the list.
//    list.clear() // list becomes []
//
//
//    // Iteration
//
//    // Using for loop to iterate over the list
//    val mutableList = mutableListOf("apple", "banana", "cherry")
//    for (item in mutableList) {
//        println(item)
//    }
//
//    // Using the forEach method to iterate over the list
//    mutableList.forEach { item ->
//        printLine(item)
//    }
//
//
//    // Batch Operations
//
//    val lengths = mutableList.map { it.length } // map function modifies each element
//    val longFruits = mutableList.filter { it.length > 5 } // filter function retains elements that fulfill a condition
//    mutableList.forEach { println(it.toUpperCase()) } // forEach function carries out an action on each element
//
//    println(lengths)
//    println(longFruits)
//
//
//    // Modifying Lists
//
//    // From Android Api 24 upward
//    mutableList.replaceAll { it.toUpperCase() }
//
//    // Api 23 and lower
//    val upperCaseList = mutableList.map { it.toUpperCase() }
//    mutableList.clear()
//    mutableList.addAll(upperCaseList)
//
//    println(mutableList[mutableList.size - 1])
//    println(mutableList[mutableList.lastIndex])
//    println(mutableList.last())


    // Working with MutableList

    // Using joinToString() function
    val southernCross = mutableListOf("Acrux", "Gacrux", "Imai", "Mimosa")
    println(southernCross.joinToString())   //  Acrux, Gacrux, Imai, Mimosa
    println(southernCross.joinToString(" -> "))   //  Acrux -> Gacrux -> Imai -> Mimosa



    // Working with multiple lists

    // You can concatenate several lists as shown in the following example:
    val southernCross2 = mutableListOf("Acrux", "Gacrux", "Imai", "Mimosa")
    val stars = mutableListOf("Ginan", "Mu Crucis")

    val newList = southernCross2 + stars
    println(newList)
    println(newList.joinToString())    //  Acrux, Gacrux, Imai, Mimosa, Ginan, Mu Crucis

    // You can use the operators == and != to compare lists – their contents and sizes:
    val firstList = mutableListOf("result", "is", "true")
    val secondList = mutableListOf("result", "is", "true")
    val thirdList = mutableListOf("result")

    println(firstList == secondList)  //  true
    println(firstList == thirdList)   //  false
    println(secondList != thirdList)  //  true


    // Also, you can use += to add new elements to the list:

    val vowels = mutableListOf('a', 'o', 'i', 'e', 'u')
    val intList1 = mutableListOf(1, 2, 3, 4, 5)
    val intList2 = mutableListOf(5, 4, 3, 2, 1)

    vowels += 'y'
    intList1 += intList2

    println(vowels)   // [a, o, i, e, u, y]
    println(intList1) // [1, 2, 3, 4, 5, 5, 4, 3, 2, 1]


    // Copying the list contents

    // Kotlin uses toMutableList() function to copy the contents of a list to another
    val list = mutableListOf(1, 2, 3, 4, 5)
    val copyList = list.toMutableList()

    print(copyList) // [1, 2, 3, 4, 5]


    // Other Useful functions in a MutableList
    val numbers = mutableListOf(1, 2, 3, 4, 5)
    var sublist = mutableListOf<Int>()
    if (numbers.isNotEmpty() && numbers.size >= 4) {
        sublist = numbers.subList(1, 4)
    }

    print(sublist) // [2, 3, 4]

    // list.indexOf(element)
    val numbers1 = mutableListOf(1, 2, 3, 4, 5)

    if (5 in numbers1) {
        println(numbers1.indexOf(5)) // 4
    }

    print(numbers1.indexOf(7)) // -1


    // list.sorted, list.minOrNull(), list.maxOrNull, list.sortedDescending()
    val numbers2 = mutableListOf(1, 2, 3, 4, 5)

    val vowels1 = mutableListOf('e', 'a', 'y', 'i', 'u', 'o')

    println(numbers2.minOrNull()) // 1
    println(numbers2.maxOrNull()) // 5
    println(numbers2.sum())      // 15

    println(vowels1.sorted()) // [a, e, i, o, u, y]
    println(vowels1.sortedDescending()) // [y, u, o, i, e, a]
}