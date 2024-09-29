import kotlin.random.Random

fun main(){
    var nums = Array<Int>(25, { Random.nextInt(0, 9)})
    for (i in 0 until nums.size){
        if ((i + 1) % 5 == 0)
        println("${nums[i]}\t")
        else print("${nums[i]}\t")
    }
}
