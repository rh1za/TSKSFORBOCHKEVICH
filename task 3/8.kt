fun main() {
    val km = 1000
    val ft = 305
    val dl1 = readln().toFloat() / km
    val dl2 = readln().toFloat() / ft
    if (dl1 > dl2) println("Расстояние 1 больше чем расстояние 2")
    else println("Расстояние 2 больше чем расстояние 1")


}