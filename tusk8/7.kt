fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    println(UMn(a, b))
}
fun UMn(fps: Int, min: Int): Int {
    return fps * min
}