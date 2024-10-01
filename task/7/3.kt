fun main() {
    println("Напишите название команды")
    val Team = readln()
    println("Напишите: победы, поражения и ничьи")
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    println("$Team имеет - ${POints(a, b, c)} очков")

}

fun POints(Wins: Int, Loses: Int, Drows: Int): Int{
    val win = 3
    val lose = 0
    val drow = 1
    val res = (Wins * win) + (Loses * lose) + (Drows * drow)
    return res
}