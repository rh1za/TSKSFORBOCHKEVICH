import kotlin.random.Random
fun main(){
    val nums = Array<Int>(5, { Random.nextInt(0, 9)})
    println(nums.contentToString())
    println(SredneeAref(nums))
}

fun SredneeAref(nums: Array<Int>, sred: Int = nums.size, sum: Int = nums.sum()): Int {
    return sum / sred
}
