fun main() {
    val students = mapOf(
        "Zhenya" to 5,
        "Vlad" to 5,
        "Nina" to 4
    )
    println(students)

    // Recreating the students variable with a MutableList() collection
    val students2 = mutableListOf("Zhenya", "Vlad", "Nina")
    val studentMarks = mutableListOf(5, 5, 4)

    println("${students2[0]}=${studentMarks[0]}, " +
            "${students2[1]}=${studentMarks[1]}, " +
            "${students2[2]}=${studentMarks[2]} ")


    // Checking stored values with key
//    val grade = students["Nina"]
//    println("Nina's grade is: $grade") // output: Nina's grade is: 5


    // Map element is represented by the Pair type
    val (name, grade) = Pair("Zhenya", 5) // easy way to get the first and the second values
    println("Student name is: $name And their grade is: $grade") // output: Student name is: Zhenya And their grade is: 5


    // Another way to access the elements in Pair is .first amd .second property
    val p = Pair(2, 3)
    println("${p.first} ${p.second}") // 2 3
    val (first, second) = p
    println("$first $second")         // 2 3


    // to is a simplified construct for creating a Pair:
    val (person, mark) = "Johnson" to 15
    println("Student name is: $person And their grade is: $mark") // prints the student name is: Johnson and their grade is: 15


    // Initializing an empty map
    val emptyStringToDoubleMap = emptyMap<String, Double>()


    // Another way of creating a map is to call a builder function buildMap():
    val values = mapOf<String, Int>("Second" to 2, "Third" to 3)

    val map = buildMap<String, Int> {
        put("First", 1)
        putAll(values)
        put("Fourth", 4)
    }
    println(map) // output: {First=1, Second=2, Third=3, Fourth=4}


    val employees = mapOf(
        "Mike" to 1500,
        "Jim" to 500,
        "Sara" to 1000
    )

    if (!employees.isEmpty()) {
        println("Number of employees: ${employees.size}")
        println("Mike wants to earn ${employees["Mike"]}")
    }

    val isWanted = employees.containsKey("Jim")
    println("Does Jim want to be our employee? It's $isWanted")

    val isAnyoneWilling = employees.containsValue(500)
    println("Is anyone willing to earn $500? It's $isAnyoneWilling")


    // Iterating over the map collection
    for (employee in employees)
        println("${employee.key} ${employee.value}")

    for ((k, v) in employees)
        println("$k $v")


    // Idioms in Map
    val mapIdiom = mapOf("a" to 1, "b" to 2, "c" to 3) // Initializing

    println(map.get("a")) // 1
    println(map["b"])     // 2, idiomatic way

    for ((k, v) in map) {
        println("$k -> $v")
    } // Iterating

}