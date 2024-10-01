//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Напишите операцию")
 val mark = readLine()
    println("Напишите переменные")
    val a = readln().toFloat()
    val b = readln().toFloat()
     val res = when (mark) {
         "Сложение" -> a + b
         "Вычитание" -> a - b
         "Умножение" -> a * b
         "Деление" -> a / b
     else -> {
         println("Введите операцию верно")
     }
}
println(res)
}