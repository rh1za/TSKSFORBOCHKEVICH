import kotlin.random.Random
fun main() {
    val nums = Array<Int>(10, { Random.nextInt(0, 50) })
    for (i in 0 until nums.size)
        if (nums[i] % 3 == 0)
            println(nums[i])
}