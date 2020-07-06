fun main() {
    val quizAnswer1 = 15
    var quizAnswer2 = 3
    val quizAnswer3 = "isosceles"
    val quizAnswer4 = 47

    // Write your code below
    
    // Creating Quiz Questions
    println("What is 75 / 5?: ")
    var studentAnswer1 = Integer.valueOf(readLine())

    println("What is the value of y: 6 * 2y = 36")
    val studentAnswer2 = Integer.valueOf(readLine())

    println("What is the name of a triangle that has two equal sides: ")
    val studentAnswer3 = readLine()

    println("What is the value of 8 * 6 - (3 - 2): ")
    val studentAnswer4 = Integer.valueOf(readLine())


    // Grading the Quiz
    var points = 0
    // Question 1
    if(studentAnswer1 == quizAnswer1) {
        points += 25
    }

    // Question 2
    if (studentAnswer2 == quizAnswer2) {
        points += 25
    } else if (studentAnswer2 == quizAnswer2++ || studentAnswer2 == quizAnswer2--) {
        points += 20
        println("The answer $studentAnswer2 is within 1 point of $quizAnswer2")
    } else {
        points += 1
    }

    // Question 3
    if (studentAnswer3 == quizAnswer3) {
        points += 25
    } else if (studentAnswer3 == "equilateral") {
        points += 10
    } else {
        points += 1
    }

    // Question 4
    if (studentAnswer4 == quizAnswer4) {
        points += 25
    } else if (studentAnswer4 in 44..54) {
        points += 20
    } else {
        points += 1
    }


    // Returning a Final Grade
    when (points) {
        in 0..59 -> println("$points points is an F.")
        in 60..69 -> println("$points points is a D.")
        in 70..79 -> println("$points points is a C.")
        in 80..89 -> println("$points points is a B.")
        in 90..99 -> println("$points points is an A.")
        in 100..110 -> println("$points points is an A+.")
        else -> println("Not a valid value.")
    }
}
