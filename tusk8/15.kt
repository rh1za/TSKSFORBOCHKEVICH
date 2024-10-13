fun main() {
    val b = readln().toInt()
    println(CHETORNO(b))
}
fun CHETORNO(b: Int): Boolean {
    if (b % 2 == 0)
        return true else return false
}