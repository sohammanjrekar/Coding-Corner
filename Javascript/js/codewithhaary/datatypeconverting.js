// 1. Implicit Type Conversion (Coercion)
// JavaScript automatically performs type conversion in certain situations, such as when using operators between different data types.
let x = 10;        // x is a number
let y = "20";      // y is a string

let result = x + y;  // JavaScript implicitly converts x to a string and performs string concatenation
console.log(result,typeof(x+y)); // Output: "1020" (a string)


// 2. Explicit Type Conversion
// Developers can explicitly convert data types using built-in functions or operators.

let value1 = Boolean(0);     // 0 is falsy, converts to false
let value2 = Boolean("");    // Empty string is falsy, converts to false
let value3 = Boolean("Hello"); // Non-empty string is truthy, converts to true

console.log(value1);  // Output: false
console.log(value2);  // Output: false
console.log(value3);  // Output: true

let floatStr = "3.14";
let floatNum = parseFloat(floatStr);  // Convert string to float using parseFloat()
console.log(floatNum);                // Output: 3.14 (a floating-point number)

let intStr = "42";
let intNum = parseInt(intStr);        // Convert string to integer using parseInt()
console.log(intNum);                  // Output: 42 (an integer)
let str = "456";
let num = Number(str);  // Explicitly convert string to number using Number()
console.log(num);       // Output: 456 (a number)

let invalidStr = "abc";
let invalidNum = Number(invalidStr);  // NaN (Not-a-Number) for invalid conversion
console.log(invalidNum);              // Output: NaN
 num = 123;
 str = String(num);  // Explicitly convert number to string using String()
console.log(str);       // Output: "123" (a string)




// 3. Using toString() Method
 num = 123;
let numStr = num.toString();  // Convert number to string using toString() method
console.log(numStr);         // Output: "123" (a string)

