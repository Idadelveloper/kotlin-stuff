fun main() {
    // Association
    // create a map where elements of original elements are keys and values will be produced by the expression defined in the lambda function
    val numbers = listOf("one", "two", "three", "four")
    println(numbers.associateWith { it.length })

    // with associateBy, the jey will rather be what's defined in the lambda function
    println(numbers.associateBy { it.first().uppercase() })
    // keys and values will change
    println(numbers.associateBy(keySelector = {it.first().uppercase()}, valueTransform = {it.length}))
}
