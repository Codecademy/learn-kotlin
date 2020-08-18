fun main() {

  // Square Variables
  val sqSide = 7
  val sqChar1 = "X  "
  val sqChar2 = "O  "

  // Write your code below
  for (i in 1..sqSide) {
    for (j in 1..sqSide) {
      if (i % 2 == 0 && j % 2 == 0 || i % 2 == 1 && j % 2 ==1) {
        print(sqChar1)
      } else {
        print(sqChar2)
      }
    }
    println()
  }
​
  // Triangle Variables
  val triRows = 10
  var triCount = 0
  var triRowLen = triRows
  val triChar1 = "/  "
  val triChar2 = "   "
  
  // Write your code below
  for (i in triRows downTo 1) {
    while (triCount < triRowLen) {
      triCount++
      print(triChar1)
    }
    println()
    triCount = 0
    triRowLen--
  }
​
  triRowLen = triRows
  for (i in triRows downTo 1) {
    while (triCount < triRowLen) {
      triCount++
      if (triCount != 1 && triCount != triRowLen && i != triRows) {
        print(triChar2)
      } else {
        print(triChar1)
      }
    }
    println()
    triCount = 0
    triRowLen--
  }
}
