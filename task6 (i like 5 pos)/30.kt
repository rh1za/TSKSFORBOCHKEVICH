import kotlin.random.Random

fun main(){
    var nums = Array<Int>(100, { Random.nextInt(0, 100)})
    for (a in 0 until nums.size){
        if ((a+1) % 10 == 0) println("${nums[a]} ")
        else print("${nums[a]}\t")
    }
}
