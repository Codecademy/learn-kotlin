fun main() {
  // Write your code below 🏞
//creating responsibility list
var responsibilities=listOf("feed the chimps",
"play a random game",
"conduct a health check on Foxie")
//declaring variables
var responsibilitiesComplete=0
var timeSpent=0
val totalShiftTime=4
//declaring maps
val foxiesHealthCheck = mutableMapOf<String, Any?>()
var chimpsHaveEaten=mutableMapOf("Bonnie" to false, "Jubilee" to false, "Frodo" to false, "Foxie" to false)

//handling first responsibility
println("\nFirst, ${responsibilities[0]}")
println("Feeding Bonnie....")
chimpsHaveEaten["Bonnie"]=true
println("Feeding Jubilee....")
chimpsHaveEaten["Jubilee"]=true
println("Feeding Frodo....")
chimpsHaveEaten["Frodo"]=true
println("Feeding Foxie....")
chimpsHaveEaten["Foxie"]=true
timeSpent+=1
responsibilitiesComplete+=1
println("All chimps have now been fed! You've completed $responsibilitiesComplete / ${responsibilities.size} responsibilities.")

//handling 2nd responsibility
println("\nNext, ${responsibilities[1]}.")
var games= setOf("tug-of-war with a blanket",
"catch and throw",
"number game")
var randomGame = games.random()
println(randomGame)
timeSpent+=1
responsibilitiesComplete+=1
println("Each chimp has now played a game of $randomGame! You've completed $responsibilitiesComplete / ${responsibilities.size} responsibilities.")

//handling 3rd responsibility
println("\nNext, ${responsibilities[2]}.")
foxiesHealthCheck.put("temperature",32.7)
foxiesHealthCheck.put("mood","happy")
println("Foxie has a temperature of ${foxiesHealthCheck["temperature"]} and is feeling ${foxiesHealthCheck["mood"]}.")
timeSpent+=1
responsibilitiesComplete+=1
println("You've completed $responsibilitiesComplete / ${responsibilities.size} responsibilities.\n")

//declaring a variable which will return true if responsibilities are completed
 var completed:Boolean = (responsibilitiesComplete == responsibilities.size)

 //if-else statements to check the time spent and responsibilities completed
if(timeSpent <= totalShiftTime && completed){
  println("Congrats. You did a good job")
}
else if(timeSpent >= totalShiftTime && completed){
  println("You did it, but overtime.")
}
else{
  println("All of the responsibilities were not complete and you took extra time. Don't be lazy.")
}
}
