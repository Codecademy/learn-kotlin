fun main() {
    // Write your code below 🏞
  
    val responsibilities = mutableListOf("feed the chimps", "play a random game", "conduct a health check on Foxie")
    var responsibilitiesComplete = 0
    var timeSpent = 0
    var totalShiftTime = 4
    val foxiesHealthCheck = mutableMapOf<String, Any?>()

    var chimpsHaveEaten = mutableMapOf("Bonnie" to false, "Jubilee" to false, "Frodo" to false, "Foxie" to false)

    // First responsibility
    println("First, ${responsibilities[0]}")

    println("Feeding Bonnie...")
    chimpsHaveEaten["Bonnie"] = true
    println("Feeding Jubilee...")
    chimpsHaveEaten["Jubilee"] = true
    println("Feeding Frodo...")
    chimpsHaveEaten["Frodo"] = true
    println("Feeding Foxie...")
    chimpsHaveEaten["Foxie"] = true
    timeSpent += 1
    responsibilitiesComplete++
    
    println("All chimps have now been fed! You've completed $responsibilitiesComplete / ${responsibilities.size} responsibilities.")

    // Second responsibility
    println("\nNext, ${responsibilities[1]}")

    val games = mutableSetOf("tug-of-war with a blanket", "catch and throw", "number game")
    val randomGame = games.random()

    println(randomGame)
    timeSpent += 1
    responsibilitiesComplete++
    println("Each animal has now played a game of $randomGame. You've completed $responsibilitiesComplete / ${responsibilities.size} responsibilities.")

    // Third responsibility
    println("\nNext, ${responsibilities[2]}")

    foxiesHealthCheck.put("Temperature", 37.2)
    foxiesHealthCheck.put("Mood", "Happy")
    println("Foxie has a temperature of ${foxiesHealthCheck["Temperature"]} and is feeling ${foxiesHealthCheck["Mood"]}.")

    timeSpent += 1
    responsibilitiesComplete++
    println("You've now completed $responsibilitiesComplete / ${responsibilities.size} responsibilities.")

    // Wrap up 
    if (timeSpent <= totalShiftTime && responsibilitiesComplete == responsibilities.size) {
        println("\nAwesome work! You've completed all of your responsibilites for the day, and you can clock out.")
    } else if (timeSpent >= totalShiftTime && responsibilitiesComplete == responsibilities.size){
        println("Great job today! You've completed all of your responsibilities but with over time.")
    } else {
        println("You went over time and did not complete all of your responsibilites.")
    }
}