fun timeToCook(food:String): String{
    return when{
        food == "Картофель" -> "25 мин"
        food == "Рис" -> "10 мин"
        food == "Курица" -> "60 мин"
        food == "Говядина" -> "50 мин"
        food == "Свинина" -> "30 мин"
        food == "Руккола" -> "2 мин"
        else -> "Неверно!"
    }
}
fun main(){

    println("""
            1        2     3         4        5       6
        [Картофель, Рис, Курица, Говядина, Свинина, Руккола]
    """.trimIndent())
    print("\nВведите номер пищи, что вы будете готовить: ")
    var num:Int
    do {
        num = readln().toInt()
    }while (num > 6 || num < 1)
    val food:Array<String> = arrayOf("Картофель", "Рис", "Курица", "Говядина", "Свинина", "Руккола")
    println("\n\nВремя готовки для ${food[num-1]}: ${timeToCook(food[num-1])}")
}