// Non premetive Data objects in js
const soham = {
    "s": 1,             // Number
    "o": "hello",       // String
    "h": true,          // Boolean
    "a": undefined,     // Undefined
    "m": null,          // Null
    "symbolKey": Symbol("description"),  // Symbol
    "arrayKey": [1, 2, 3],  // Array
    "objectKey": { "nested": true }  // Nested Object
};

// Accessing and logging different data types from the 'soham' object

console.log(soham["s"]);  // Output: 1
console.log(typeof soham["s"]);  // Output: number

console.log(soham["o"]);  // Output: hello
console.log(typeof soham["o"]);  // Output: string

console.log(soham["h"]);  // Output: true
console.log(typeof soham["h"]);  // Output: boolean

console.log(soham["a"]);  // Output: undefined
console.log(typeof soham["a"]);  // Output: undefined

console.log(soham["m"]);  // Output: null
console.log(typeof soham["m"]);  // Output: object

console.log(soham["symbolKey"]);  // Output: Symbol(description)
console.log(typeof soham["symbolKey"]);  // Output: symbol

console.log(soham["arrayKey"]);  // Output: [1, 2, 3]
console.log(Array.isArray(soham["arrayKey"]));  // Output: true (checking if it's an array)

console.log(soham["objectKey"]);  // Output: { nested: true }
console.log(typeof soham["objectKey"]);  // Output: object


// for access two methods of object
//i) soham["s"] ;
//ii) soham.s