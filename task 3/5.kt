fun main() {
    println("Напишите координаты треугольника")
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    if ((a + b >= c) and (a + c >= b) and (b + c >= a)) println("Существует")
    else println("Не существует")
}