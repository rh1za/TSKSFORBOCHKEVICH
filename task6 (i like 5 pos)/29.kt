fun main() {
    val nums = intArrayOf(12, 5, 1, 8, 7, 3)
    val median = findMedian(nums)
    println("$median")
}

fun findMedian(nums: IntArray): Double {
    val sortedArray = nums.sortedArray()
    val n = sortedArray.size
    return if (n % 2 == 0) {
        (sortedArray[n / 2 - 1] + sortedArray[n / 2]) / 2.0
    } else {
        sortedArray[n / 2].toDouble()
    }
}