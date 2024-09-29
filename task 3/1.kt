fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    if ((a > b) and (a > c))
        println(a)
    else if ((b > a) and (b > c))
        println(b)
    else if ((c > a) and (c > b))
        println(c)
}
