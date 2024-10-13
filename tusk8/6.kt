fun main() {
    val a = readln().toInt()
    println(deL(a))
}
fun deL(a: Int): Boolean {
    if (a % 100 == 0) return true else return false
}