fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val temp = this[index2] // 'this' corresponds to the list
    this[index2] = this[index1]
    this[index1] = temp
}

fun main() {
    val list = mutableListOf(1, 2, 3)
    list.swap(0, 2)

    print(list)
}