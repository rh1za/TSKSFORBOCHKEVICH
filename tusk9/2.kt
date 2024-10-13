fun main() {
    val a = "qwerty"
    var sumglas = 0
    var sumsogl = 0
    for (i in a) {
        when (i) {
            'a', 'e', 'o', 'i', 'u', 'y' -> sumglas++
            else -> sumsogl++

        }
    }
    println("$sumglas")
    println("$sumsogl")
}