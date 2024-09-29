import kotlin.random.Random

fun main() {
    var nums1 = Array<Int>(25, { Random.nextInt(0, 100) })
    var nums2 = Array<Int>(25, { Random.nextInt(0, 100) })
    val nums3 = arrayOf(*nums1, *nums2)
    nums3.sort()
    println(nums3.contentToString())
}