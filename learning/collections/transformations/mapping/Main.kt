fun main() {
    // with sets
    val numbers = setOf(1, 2, 3, 4, 5)
    println(numbers.map { it * 10 })
    println(numbers.mapIndexedNotNull { index, value -> if (index == 0) null else index * value })

    // with maps
    val numbersMap = mapOf("key 1" to 1, "key 2" to 2, "key 3" to 3, "key 4" to 4)
    println(numbersMap.mapKeys { it.key.uppercase() })
    println(numbersMap.mapValues { it.value + it.key.length })

    // utilizes lambda functions
}
