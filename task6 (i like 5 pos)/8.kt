fun main() {
    val values = listOf(4, 7, 2, 5, 1, 9, 5, 3)
    val item = 5

    val index = values.indices.find { values[it] == item }
    println(index)
}
