fun main() {
    val numbers = arrayOf(1, 2, 2, 3, 3, 3, 2, 2)
    val (element, length) = findMaxPosled(numbers)
    println("$element, $length")
}

fun findMaxPosled(numbers: Array<Int>): Pair<Int, Int> {
    if (numbers.isEmpty())
    return Pair(0, 0)
    var maxe = numbers[0]
    var maxl = 1
    var currentElement = numbers[0]
    var currentLength = 1
    for (i in 1 until numbers.size) {
        if (numbers[i] == currentElement) {
            currentLength++
        } else {
            if (currentLength > maxl) {
                maxl = currentLength
                maxe = currentElement
            }
            currentElement = numbers[i]
            currentLength = 1
        }
    }
    if (currentLength > maxl) {
        maxl = currentLength
        maxe = currentElement
    }

    return Pair(maxe, maxl)
}