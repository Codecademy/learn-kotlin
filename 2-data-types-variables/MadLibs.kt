fun main () {

  val costOfGas = 2.28
  val mileage = 25

  // Declare the variable distance below
  val distance: Int

  println("What's your name?")
  var name = readLine()

  println("What's your friend's name?")
  var friendsName = readLine()

  println("What adjective would you like to use?")
  var adjective = readLine()

  println("What city will you be driving to?")
  var city = readLine()

  println("What's your favorite band's name?")
  var bandName = readLine()

  println("What will you and $friendsName work as?")
  var work = readLine()

  println("Enter an amount of miles between 400 and 600")

  // Initialize the variable named distance below
  distance = Integer.valueOf(readLine())

  // Calculate the total cost for gas and store it in a variable called totalForGas below
  var totalForGas = (costOfGas / mileage) * distance
  totalForGas = Math.round(totalForGas * 100) / 100.00

  //  Create the variable named totalMoneySaved below
  var totalMoneySaved = totalForGas + 200

  print("""
  A long time ago, $name and their friend $friendsName planned a(n) $adjective road trip to see their favorite band: $bandName. 
  The venue was $distance miles away which meant they needed to save $$totalForGas dollars to get there.
  Both of them worked as $work for the whole summer and managed to save up a total of $$totalMoneySaved dollars!
  To celebrate, they ended up driving to $city for the whole weekend; seeing their band and buying $bandName t-shirts to remember their trip.
  """.trimIndent())
}