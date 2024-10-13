fun sortStrings(strings: Array<String>): Array<String> {
    return strings.sortedArray()
}
fun main() {
    val stringArray = arrayOf("киви", "яблоко", "апельсин", "груша")
    val sortedArray = sortStrings(stringArray)
    println("Отсортированные строки: ")
    sortedArray.forEach { println(it) }

}
