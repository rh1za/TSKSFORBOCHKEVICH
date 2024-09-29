fun main() {
    val nums = arrayOf(1, 2, 3, 4, 5, 6)
    val chetNums = arrayListOf<Int>()
    val nechetNums = arrayListOf<Int>()
    for (i in 0 until nums.size) {
        if (nums[i] % 2 == 0)
            chetNums.add(nums[i])
        else nechetNums.add(nums[i])
    }
    println(chetNums)
    println(nechetNums)
}