fun main() {
    val a = arrayOf(1, 2, 3, 4, 5)
    val b = arrayOf(6, 7, 8, 9, 10)
    println(arraySum(a, b))
}
fun arraySum(a: Array<Int>, b: Array<Int>) {
    val c = a + b
  for (i in 0 until c.size)
      println(c[i])
}