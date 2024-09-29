fun main() {
    val first = 1
    val dif = 3
    val progression = IntArray(10) { i -> first + i * dif }
    println(progression.contentToString())
}
