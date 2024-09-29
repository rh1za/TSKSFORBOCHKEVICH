fun main() {
    val nums = arrayOf(4, 7, 2, 11, 5,"базару джексон")
for (i in 0 until nums.size)
    if(nums[i] is String) println(nums[i])
}