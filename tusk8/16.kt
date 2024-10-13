fun main() {
    val b = readln().toInt()
    println(FUCKTORIAL(b))
}
fun FUCKTORIAL(b: Int): Int {
    require(b >= 0)
    return if (b <= 1) {
        1
    } else b * FUCKTORIAL(b - 1)
}
