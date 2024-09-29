fun main() {
    println("Первое число должно быть больше чем второе")
    val a = readln().toInt()
    val b = readln().toInt()
    val c = 0
    if (a % b == 0)
        println("Делится без остатка")
    else
        println("Не делятся и остаток = ${a % b}")
}