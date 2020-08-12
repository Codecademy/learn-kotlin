fun getListOfNumbers(): List<Int> {
    var myList = mutableListOf<Int>()
    for (i in 1..7) {
        println("Enter a number")
        var numberInput = Integer.valueOf(readLine())
        myList.add(numberInput)
    }
    return myList
}

fun findMax(myList: List<Int>): Int {
    var largestNumber = myList[0]
    for (i in myList) {
        if (i > largestNumber) {
            largestNumber = i
        }
    }
    return largestNumber
}

fun findMin(myList: List<Int>): Int {
    var smallestNumber = myList[0]
    for (i in myList) {
        if (i < smallestNumber) {
            smallestNumber = i
        }
    }
    return smallestNumber
}

fun findAverage(myList: List<Int>): Int {
    var sum = 0
    for (i in myList) {
        sum += i
    }
    return sum / myList.size
}

fun checkForValue(myList: List<Int>, numToFind: Int): Boolean {
    for (i in myList) {
        if (i == numToFind) {
            return true
        }
    }
    return false
}
fun main() {
    var values = getListOfNumbers()
    println(values)
    var largestValue = findMax(values)
    println("The largest number is $largestValue.")
    var smallestValue = findMin(values)
    println("The smallest number is $smallestValue.")
    var average = findAverage(values)
    println("The average is $average.")
    println("What number should I check for?")
    var numToFind = Integer.valueOf(readLine())
    var containsValue = checkForValue(values, numToFind)

    if (containsValue) {
        println("$numToFind exists in the list.")
    } else {
        println("$numToFind does not exist in the list.")
    }

}
