fun main() {
    val firstName = "Anthony"
    val secondName = "Anastasia"
    val names: List<String?> = listOf(firstName, null, secondName)

    var res: List<String?> = listOf()

    for (item in names) {
        item?.let { res = res.plus(it) }
    }

    println(res)
}