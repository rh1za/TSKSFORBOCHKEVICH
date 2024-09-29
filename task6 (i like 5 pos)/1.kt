//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
 val nums = arrayOf(1, 2, 3, 4 ,5)
    var a = 0
    for (i in 0 until nums.size) {
        println(nums[i])
        a = a + nums[i]
    }
    println("$a")

}
