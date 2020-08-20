class Calculator(val name: String) {

  init {
    println("$name's Calculator 🧮")
  }
  
  fun add(a: Int, b: Int): Int {
    return a + b
  }
  
  fun subtract(a: Int, b: Int): Int {
    return a - b
  }
  
  fun multiply(a: Int, b: Int): Int {
    return a * b
  }
  
  fun divide(a: Int, b: Int): Any {
    if (b == 0) {
      return "Error! Dividing by zero is not allowed." 
    } else {
      return a / b
    } 
  }
  
  fun power(a: Int, b: Int): Int {
    var result = 1

    for (i in 1..b) {
      result *= a
    } 
    return result
  } 
}
  
fun main() {
  var myCalculator = Calculator("Codey")
  println(myCalculator.add(5, 7))
  println(myCalculator.subtract(45, 11))
  println(myCalculator.divide(8, 0))
  println(myCalculator.power(2, 1))
}