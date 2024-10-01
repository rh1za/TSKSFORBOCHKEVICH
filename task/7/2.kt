fun main() {
    println("Введите слово")
    val word = readln().toString()
    val a = word.reversed()
    if (word == a) println("Палиндром")
    else
        println("Не является")
}


