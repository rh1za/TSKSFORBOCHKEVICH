import kotlin.random.Random
fun main() {
    val nums = Array<Int>(20, { Random.nextInt(0, 100)})
    println(nums.contentToString())
}
