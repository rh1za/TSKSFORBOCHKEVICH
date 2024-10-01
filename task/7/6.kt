import kotlin.random.Random

fun main() {
    val qa = 21
    println("Привет, это игра очко!")
    println("Хотите сыграть?")
    val a = readln()
    if (((a == "Да" ) or (a == "да") or (a == "ДА")))  { println("Начнем!")
    println("Ваши карты")
    val first = (5..11).random()
    val second = (5..11).random()
    val res = first + second
    println("$res - у вас, скажите Еще, если хотите продолжить")
        val b = readln()
        if(b == "Еще") {
            val third = 11
            val res1 = res + third
            println("У вас $res1")
            println("Думаю у вас достаточно, давайте глянем")
            println("У меня $qa")
            println("У вас $res1")
            if(res1 == qa)
                println("Вы победили")
            else println("ХАХАХАХАХАХ, лузер")
        } else println("Ну тогда вскрываемся")
        if(res == qa)

            println("Вы победили, поздравляю")
        else println("У меня $qa, я опять победил)))")
    }


    else println ("Проваливай")




}