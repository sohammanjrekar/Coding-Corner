// Kotlin is a modern, trending programming language.

// Kotlin is easy to learn, especially if you already know Java (it is 100% compatible with Java).

// Kotlin is used to develop Android apps, server side apps, and much more.

fun main(){
//     println("hello world")
//     println(3+3)
//     var name = "John"      // String (text)
// val birthyear = 1975   // Int (number)

// println(name)          // Print the value of name
// println(birthyear)     // Print the value of birthyear

// // Kotlin supports data types like Int, Double, String, Char, Boolean, etc. 

// var name1 : String
// name1="soham"
// println(name1) // Print the value

// //Val:  When you create a variable with the val keyword, the value cannot be changed/reassigned.
// // Var : The variable to be assigned to the variable you create and the value must not be changed /reassigned.

// // 1. Integer Types
// val myByte: Byte = 100               // Byte: Stores whole numbers from -128 to 127
// println(myByte)

// val myShort: Short = 5000           // Short: Stores whole numbers from -32768 to 32767
// println(myShort)

// val myInt: Int = 100000            // Int: Stores whole numbers from -2147483648 to 2147483647
// println(myInt)

// val myLong: Long = 15000000000L     // Long: Stores whole numbers from -9223372036854775808 to 9223372036854775807
// println(myLong)


// // 2. Floating Point Types
// val myFloat: Float = 5.75F         // Float: Stores decimal numbers with 6-7 digits precision
// println(myFloat)

// val myDouble: Double = 19.99      // Double: Stores decimal numbers with 15 digits precision
// println(myDouble)

// val myScientificFloat: Float = 35E3F  // Scientific notation (Float)
// val myScientificDouble: Double = 12E4  // Scientific notation (Double)
// println(myScientificFloat)
// println(myScientificDouble)


// // 3. Boolean Types
// val isKotlinFun: Boolean = true    // Boolean: Stores true or false values
// val isFishTasty: Boolean = false
// println(isKotlinFun)  // Outputs: true
// println(isFishTasty)  // Outputs: false


// // 4. Char Type
// val myGrade: Char = 'B'            // Char: Stores a single character
// println(myGrade)


// // 5. String Type
// val myText: String = "Hello World"  // String: Stores a sequence of characters (text)
// println(myText)


// // 6. Type Conversion (Converting Int to Long)
// val x: Int = 5
// val y: Long = x.toLong()            // Converting Int to Long using toLong() function
// println(y)                          // Outputs: 5

// // Type conversion from Int to other types (e.g., to Float, to Double)
// val z: Float = x.toFloat()         // Convert Int to Float
// val w: Double = x.toDouble()       // Convert Int to Double
// println(z)  // Outputs: 5.0
// println(w)  // Outputs: 5.0



//     // 1. Declaring Strings
//     var greeting = "Hello"           // Kotlin infers the type String
//     println(greeting)                // Outputs: Hello

//     var name: String                 // Declaring the type explicitly
//     name = "John"
//     println(name)                    // Outputs: John

//     // 2. Accessing Characters in a String
//     var txt = "Hello World"
//     println(txt[0])  // Accessing the first character (H)
//     println(txt[2])  // Accessing the third character (l)

//     // 3. Finding the Length of a String
//     var alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
//     println("The length of the alphabet string is: ${alphabet.length}")
//     // Outputs: The length of the alphabet string is: 26

//     // 4. String Functions
//     var txt2 = "Hello World"
//     println(txt2.toUpperCase())  // Converts the string to uppercase (HELLO WORLD)
//     println(txt2.toLowerCase())  // Converts the string to lowercase (hello world)

//     // 5. Comparing Strings
//     var txt3 = "Hello World"
//     var txt4 = "Hello World"
//     println(txt3.compareTo(txt4))  // Compares two strings (Outputs: 0, they are equal)

//     var txt5 = "Hello"
//     var txt6 = "World"
//     println(txt5.compareTo(txt6))  // Compares two strings (Outputs a negative number)

//     // 6. Finding a String within a String
//     var txt7 = "Please locate where 'locate' occurs!"
//     println(txt7.indexOf("locate"))  // Outputs: 7 (The index of the first occurrence of "locate")

//     // 7. Using Quotes Inside a String
//     var txt8 = "It's alright"  // Using single quotes inside double quotes
//     println(txt8)  // Outputs: It's alright

//     var txt9 = "That's great" // Another example of using single quotes inside double quotes
//     println(txt9)  // Outputs: That's great

//     // 8. String Concatenation using '+'
//     var firstName = "John"
//     var lastName = "Doe"
//     println(firstName + " " + lastName)  // Outputs: John Doe

//     // 9. String Concatenation using the plus() function
//     println(firstName.plus(lastName))  // Outputs: JohnDoe

//     // 10. String Templates (Interpolation)
//     println("My name is $firstName $lastName")  // Outputs: My name is John Doe

//     // You can also use expressions in string templates
//     val age = 30
//     println("I am $age years old")  // Outputs: I am 30 years old
  
//         // 1. Arithmetic Operators
//         val x = 10
//         val y = 5
    
//         // Addition
//         val sum = x + y
//         println("Addition: $x + $y = $sum")  // Outputs: Addition: 10 + 5 = 15
    
//         // Subtraction
//         val difference = x - y
//         println("Subtraction: $x - $y = $difference")  // Outputs: Subtraction: 10 - 5 = 5
    
//         // Multiplication
//         val product = x * y
//         println("Multiplication: $x * $y = $product")  // Outputs: Multiplication: 10 * 5 = 50
    
//         // Division
//         val quotient = x / y
//         println("Division: $x / $y = $quotient")  // Outputs: Division: 10 / 5 = 2
    
//         // Modulus (Remainder)
//         val remainder = x % y
//         println("Modulus: $x % $y = $remainder")  // Outputs: Modulus: 10 % 5 = 0
    
//         // Increment and Decrement
//         var z = 5
//         println("Increment: ${++z}")  // Outputs: Increment: 6
//         println("Decrement: ${--z}")  // Outputs: Decrement: 5
    
//         // 2. Assignment Operators
//         var a = 10
//         println("Assignment: a = $a")  // Outputs: Assignment: a = 10
    
//         // Add and assign
//         a += 5  // Same as a = a + 5
//         println("a += 5: $a")  // Outputs: a += 5: 15
    
//         // Subtract and assign
//         a -= 3  // Same as a = a - 3
//         println("a -= 3: $a")  // Outputs: a -= 3: 12
    
//         // Multiply and assign
//         a *= 2  // Same as a = a * 2
//         println("a *= 2: $a")  // Outputs: a *= 2: 24
    
//         // Divide and assign
//         a /= 4  // Same as a = a / 4
//         println("a /= 4: $a")  // Outputs: a /= 4: 6
    
//         // Modulus and assign
//         a %= 4  // Same as a = a % 4
//         println("a %= 4: $a")  // Outputs: a %= 4: 2
    
//         // 3. Comparison Operators
//         val x1 = 10
//         val y1 = 5
    
//         // Equal to
//         println("x1 == y1: ${x1 == y1}")  // Outputs: x1 == y1: false
    
//         // Not equal to
//         println("x1 != y1: ${x1 != y1}")  // Outputs: x1 != y1: true
    
//         // Greater than
//         println("x1 > y1: ${x1 > y1}")  // Outputs: x1 > y1: true
    
//         // Less than
//         println("x1 < y1: ${x1 < y1}")  // Outputs: x1 < y1: false
    
//         // Greater than or equal to
//         println("x1 >= y1: ${x1 >= y1}")  // Outputs: x1 >= y1: true
    
//         // Less than or equal to
//         println("x1 <= y1: ${x1 <= y1}")  // Outputs: x1 <= y1: false
    
//         // 4. Logical Operators
//         val a1 = true
//         val b1 = false
    
//         // Logical AND
//         println("a1 && b1: ${a1 && b1}")  // Outputs: a1 && b1: false
    
//         // Logical OR
//         println("a1 || b1: ${a1 || b1}")  // Outputs: a1 || b1: true
    
//         // Logical NOT
//         println("!a1: ${!a1}")  // Outputs: !a1: false
        
    
// val time = 20
// val greeting = if (time < 18) "Good day." else "Good evening."
// println(greeting)  
    
// // Kotlin When
// val day = 4
// // The when expression is similar to the switch statement in Java.
// val result = when (day) {
//   1 -> "Monday"
//   2 -> "Tuesday"
//   3 -> "Wednesday"
//   4 -> "Thursday"
//   5 -> "Friday"
//   6 -> "Saturday"
//   7 -> "Sunday"
//   else -> "Invalid day."
// }
// println(result)

// // Outputs "Thursday" (day 4)





// // While Loop
// var i = 0
// println("While Loop:")
// while (i < 5) {
//     println(i)
//     i++
// }

// // Do..While Loop
// i = 0
// println("\nDo..While Loop:")
// do {
//     println(i)
//     i++
// } while (i < 5)

// // Break Statement
// i = 0
// println("\nBreak Statement:")
// while (i < 10) {
//     print(i)
//     i++
//     if (i == 4) {
//         break
//     }
// }

// // Continue Statement
// i = 0
// println("\nContinue Statement:")
// while (i < 10) {
//     if (i == 4) {
//         i++
//         continue  // Skip printing 4
//     }
//     print(i)
//     i++
// }

// // for loop
// for (i in 1..5) {
//     print(i)  // Prints values 1, 2, 3, 4, 5
// }
// //Unlike Java and other programming languages, there is no traditional for loop in Kotlin.

// // array
// //create ranges of values with ".."
// val cars=arrayOf(1,2,3,4,5)
// println(cars[0]) // prints 1
// for(i in 1..cars.size){
//     println(cars[i-1])
// }
// // check if exist or not
// if (6 in cars) {
//     println("It exists!")
//   } else {
//     println("It does not exist.")
//   } 

fun my(name: String){
    println("Hello, Kotlin!"+name+"!")
}

// Call the function
my("soham")










val result = myFunction(5, 3)
    println(result)  // Outputs: 8




}


fun myFunction(x: Int, y: Int) = x + y