fun main() {
    val measurements = doubleArrayOf(10.8, 14.3, 13.5, 12.1, 9.7)
    var sum = 0.0

    for (elem in measurements) {
        sum += elem
    }
    val mean = sum / measurements.size
    println(mean)
}