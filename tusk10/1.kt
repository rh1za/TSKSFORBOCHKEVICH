//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    fun countdown(n: Int): List<Int> {
        return if (n <= 0) {
            emptyList()
        } else {
            (n downTo 1).toList()
        }
    }

    fun main() {
        println(countdown(5))
        println(countdown(0))
    }

}