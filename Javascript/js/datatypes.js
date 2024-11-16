// Number
let age = 25;
let height = 5.9;

// String
let firstName = "John";
let lastName = 'Doe';

// Boolean
let isStudent = true;
let hasJob = false;

// Undefined
let undefinedVar;

// Null
let nullVar = null;

// Symbol
let symbol1 = Symbol("unique1");
let symbol2 = Symbol("unique2");

// BigInt
let bigIntNum = 9007199254740991n;

// Object
let person = {
  name: "Alice",
  age: 30,
  address: {
    city: "Wonderland",
    country: "Fantasia"
  },
  hobbies: ["Reading", "Gardening"]
};

// Array
let colors = ["red", "green", "blue"];

// Function
function add(a, b) {
  return a + b;
}

// Arrow function
const multiply = (x, y) => x * y;

// Output
console.log("Age:", age);
console.log("Full Name:", firstName + " " + lastName);
console.log("Is Student?", isStudent);
console.log("Undefined Variable:", undefinedVar);
console.log("Null Variable:", nullVar);
console.log("Symbol 1:", symbol1);
console.log("BigInt Number:", bigIntNum);
console.log("Person:", person);
console.log("Favorite Colors:", colors);
console.log("Addition:", add(5, 7));
console.log("Multiplication:", multiply(3, 4));
