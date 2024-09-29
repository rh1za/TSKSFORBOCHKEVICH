fun main() {
    val nums = arrayOf(4, 7, 2, 5, 10)
    var sum = 0
for (i in 0 until nums.size) {
    if (nums[i] % 2 == 0)
        sum += nums[i]
}
    println("$sum")
}
