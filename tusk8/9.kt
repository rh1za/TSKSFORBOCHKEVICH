fun main() {
    val a = readln()
    val b = readln().toInt()
    println(Ctroka(a, b))
}
fun Ctroka(a: String, b: Int): String {
   return a.repeat(b)

}