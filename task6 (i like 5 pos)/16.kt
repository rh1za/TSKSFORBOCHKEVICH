import kotlin.random.Random
fun main() {
    val nums1 = Array<Int>(5, { Random.nextInt(0, 100) })
    val nums2 = Array<Int>(15, { Random.nextInt(0, 100) })
    val nums3 = arrayOf(*nums1, *nums2)
    println(nums3.contentToString())
}