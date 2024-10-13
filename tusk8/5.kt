fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    println(SUM(a, b))
}
fun SUM(a: Int, b: Int): Boolean {
    if (a + b < 100) return true else return false
}