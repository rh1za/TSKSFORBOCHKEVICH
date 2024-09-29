fun j(num: Int, arr: Array<String>): String {
    return when (num % 7) {
        in 0..6 -> arr[num % 7]
        else -> "НЕ ТОТ ДЕНЬ"
    }
}

fun main() {
    val dn = readln().toInt()
    var day = arrayOf("Вc", "Пн", "Вт", "Ср", "Чт", "Пт", "Сб")
    println(j(dn, day))
}
