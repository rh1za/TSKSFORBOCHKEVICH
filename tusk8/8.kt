fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    println(kvadrad(a, b))
}
fun kvadrad(n: Int, k: Int): Boolean {
    if (k * k == n) return true else return false
        
}