fun main() {
    val nums1 = intArrayOf(1, 2, 3)
    val nums2 = intArrayOf(4, 5, 6)
    val nums3 = intArrayOf(7, 8, 9)
    val nums4 = intArrayOf(*nums1, *nums2, *nums3)
    println(nums4.contentToString())
}