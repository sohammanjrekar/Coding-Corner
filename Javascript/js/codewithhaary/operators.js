// Arithmetic Operators
let sum = 10 + 5;            // Addition: sum is 15
let difference = 20 - 8;     // Subtraction: difference is 12
let product = 7 * 4;         // Multiplication: product is 28
let quotient = 100 / 5;      // Division: quotient is 20
let remainder = 15 % 4;      // Modulus/Remainder: remainder is 3

// Exponentiation Operator
let result = 2 ** 3;         // Exponentiation: result is 8 (2 raised to the power of 3)

// Increment and Decrement Operators
let count = 10;
count++;                    // Increment: count is now 11
let anotherCount = count--; // Decrement: anotherCount is 11 (count becomes 10 after this)

// Assignment Operators
let x = 10;
let y = 5;
y += 3;                     // Compound Assignment: y is now 8

// Comparison Operators
console.log(10 == '10');    // Loose Equal to: true only want data equal
console.log(10 === '10');   // Strict Equal to: false it want data and type both equal 
console.log(10 != '10');    // Loose Not Equal to: false
console.log(10 !== '10');   // Strict Not Equal to: true
console.log(20 > 10);       // Greater Than: true
console.log(15 <= 15);      // Less Than or Equal To: true

// Logical Operators
console.log(true && false); // Logical AND: false
console.log(true || false); // Logical OR: true
console.log(!true);         // Logical NOT: false

// Bitwise Operators (using 5 and 3 as examples)
console.log(5 & 3);         // Bitwise AND: 1 (binary: 0101 & 0011 = 0001)
console.log(5 | 3);         // Bitwise OR: 7 (binary: 0101 | 0011 = 0111)
console.log(5 ^ 3);         // Bitwise XOR: 6 (binary: 0101 ^ 0011 = 0110)

// Other Operators
let str1 = "Hello";
let str2 = "World";
let combinedStr = str1 + ", " + str2;  // String Concatenation
console.log(combinedStr);  // Output: Hello, World

let obj = { a: 1, b: 2 };
let objKey = 'a';
console.log(obj[objKey]);  // Accessing Object Property with Variable: 1

let arr = [1, 2, 3];
console.log(arr[0]);  // Accessing Array Element: 1

// typeof Operator
console.log(typeof 42);         // Output: number
console.log(typeof "hello");    // Output: string
console.log(typeof true);       // Output: boolean
console.log(typeof undefined);  // Output: undefined
console.log(typeof null);       // Output: object (typeof null is a known quirk in JavaScript)
console.log(typeof Symbol());   // Output: symbol
console.log(typeof {});         // Output: object (for objects and arrays)
console.log(typeof []);         // Output: object (for arrays)
