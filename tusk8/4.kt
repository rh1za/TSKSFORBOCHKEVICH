fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    println(Arguments(a, b, c))
}
fun Arguments(prob: Int, prize: Int, pay: Int): Boolean {
    if (prob * prize > pay) return true else return false
}