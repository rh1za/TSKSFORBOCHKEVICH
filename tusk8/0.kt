//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val a = arrayOf(1, 2, 3, 4, 5)
   println(Sum(a))

    }
fun Sum (a: Array<Int>): Int{
    return a.sum()
}