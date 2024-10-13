fun main() {
    val b = readln().toInt()
    println(Google(b))
}
fun Google(b: Int): String {
    return "G" + "o".repeat(b) + "gle"
}