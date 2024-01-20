fun main() {
    val firstName = "Anthony"
    val secondName = "Anastasia"
    secondName.isNotEmpty()
    print(secondName.lastIndex >= 0)
    val names: List<String?> = listOf(firstName, null, secondName)

    var res: List<String?> = listOf()

    for (item in names) {
        item?.let { res = res.plus(it) }
    }

    println(res)
}