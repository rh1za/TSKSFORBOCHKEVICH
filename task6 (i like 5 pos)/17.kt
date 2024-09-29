import kotlin.random.Random
fun main() {
    val nums = Array<Int>(5, { Random.nextInt(1, 10) })
    println(nums.sum())
    println(nums.reduce { el, i -> el * i })
}