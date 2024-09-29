import kotlin.random.Random

fun main(){
    var nums = Array<Int>(10, { Random.nextInt(0, 50)})
    println(nums.contentToString())
    var i = readln().toInt()
    println(LineFind(i, nums))
}

fun LineFind(a: Int, arr:Array<Int>): Boolean {
    return if (a in arr) true
    else false
}