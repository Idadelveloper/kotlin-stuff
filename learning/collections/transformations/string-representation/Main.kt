fun main() {
    // String Representation
    val numbersStrings = listOf("one", "two", "three", "four")
    println(numbersStrings)

    // remove parentheses when printed
    println(numbersStrings.joinToString())

    val listString = StringBuffer("The list of numbers: ")
    println(numbersStrings.joinTo(listString))

    println(numbersStrings.joinToString(separator = " | ", prefix = "start: ", postfix = ": end"))

    val numbers = (1..100).toList()
    println(numbers.joinToString(limit = 15, truncated = "<..>"))

    println(numbersStrings.joinToString { "Element: ${it.uppercase()}" })
}
