```kotlin
fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    // Solution 1: Create a new list
    val oddNumbers = list.filter { it % 2 != 0 }.toMutableList()
    println(oddNumbers)

    // Solution 2: Iterate backwards to avoid index issues
    val list2 = mutableListOf(1, 2, 3, 4, 5)
    for (i in list2.size - 1 downTo 0) {
        if (list2[i] % 2 == 0) {
            list2.removeAt(i)
        }
    }
    println(list2)
}
```