import kotlin.random.Random

fun main() {
    val nums = Array<Int>(4, { Random.nextInt(0, 9)})
    var x = 0
    for (i in 0..nums.size/2 - 1){
        if (nums[i] == nums[(nums.size - 1) - i])
           x++

    }
    if (x == nums.size/2)
    println("палиндром")
    else println("не палиндром")
}