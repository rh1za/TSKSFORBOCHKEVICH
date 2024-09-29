fun main() {
    var arrayone: ArrayList<String> = arrayListOf("a", "b", "c")
    val arraytwo = arrayone.drop(1)
    for (i in arraytwo) {
        println(i)
    }
}
