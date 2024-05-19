fun main() {
    // Flatten
    // used to convert multidimensional list or array to single one
    val numbersSets = listOf(setOf(1, 2, 3), setOf(4, 5, 6), setOf(7, 8, 9))
    for (numbers in numbersSets) {
        for (number in numbers) {
            println(number)
        }
        println("\n")
    }

    val numbersFlatten = numbersSets.flatten()
    for (number in numbersFlatten) {
        println(number)
    }

}
