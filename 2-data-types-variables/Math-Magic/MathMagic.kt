fun main() { 
    
    // This program determines the user's age using  an arithmetic magic trick. 
    
    val userName = "Galina"
    var magicNum: Int

    // Multiply first digit of your age by 5 and assign it to magicNum
    magicNum = 2 * 5 
    
    // Add 3 to the magicNum variable
    magicNum += 3 

    // Multiply 2 to the magicNum variable
    magicNum *= 2 

    // Add 5 to the magicNum variable
    magicNum += 5

    // Subtract 6 to the magicNum Variable
    magicNum -= 6
    
    // Print the desired output using String templates
    println("$userName's age is $magicNum") 
}
