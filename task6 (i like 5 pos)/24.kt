fun transposedMatrix(matrix: Array<Array<Int>>): Array<Array<Int>> {
    val rows = matrix.size
    val columns = matrix[0].size
    val transposedMatrix = Array(columns) { Array(rows) { 0 } }

    for (i in 0 until rows) {
        for (j in 0 until columns) {
            transposedMatrix[j][i] = matrix[i][j]
        }
    }

    return transposedMatrix
}

fun main() {
    val main = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(7, 8, 9)
    )
    val trans = transposedMatrix(main)
    for (row in main) {
        println(row.contentToString())
    }
    println("\n")
    for (row in trans) {
        println(row.contentToString())
    }
}