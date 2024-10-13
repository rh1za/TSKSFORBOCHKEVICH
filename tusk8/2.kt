
fun main() {
    val a = arrayOf(1, 2, 3, 4, 5)
 println(raz(a))

}
fun raz (a: Array<Int>): Int {
    return a.max() - a.min()
}