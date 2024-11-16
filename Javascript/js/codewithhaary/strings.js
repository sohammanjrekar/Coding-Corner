//strings is immutable hence not change
let names="soham"
console.log(names);
// length of string 
console.log(names.length);
// each letter access of string
console.log(names[0]);

//print each letter usig loop
for (let index = 0; index < names.length; index++) {
    console.log(names[index]);
}

// for in
for (const i in names) {
   console.log(names[i]);
   
}

// template literals
let boy1="Pramod"
let boy2="Nikhil"
console.log(`${boy1} is friend of ${boy2}`);

// Escape Sequence Characters
let fruit ='Bana\'na'
console.log(fruit);

// Define a string
names = "Soham";

// Convert the string to lowercase
console.log(names.toLowerCase()); // Output: "soham"

// Convert the string to uppercase
console.log(names.toUpperCase()); // Output: "SOHAM"

// Extract a portion of the string (from index 2 to 4, exclusive)
console.log(names.slice(2, 4)); // Output: "ha"

// Replace a substring within the string
console.log(names.replace("soh", "har")); // Output: "Haram"
// Find the index of a substring within the string
console.log(names.indexOf("ha")); // Output: 2

// Find the last index of a substring within the string
console.log(names.lastIndexOf("a")); // Output: 4

// Split the string into an array of substrings based on a separator
console.log(names.split("")); // Output: ["S", "o", "h", "a", "m"]

// Check if the string starts with a certain substring
console.log(names.startsWith("So")); // Output: true

// Check if the string ends with a certain substring
console.log(names.endsWith("ham")); // Output: true

// Extract a substring based on start index and length
console.log(names.substr(1, 3)); // Output: "oha"

// Extract a single character at a specified index
console.log(names.charAt(3)); // Output: "a"

// Repeat the string a certain number of times
console.log(names.repeat(2)); // Output: "SohamSoham"

// Trim whitespace from the beginning and end of the string
let whitespaceString = "   Hello   ";
console.log(whitespaceString.trim()); // Output: "Hello"

// Concatenate multiple strings
let firstName = "John";
let lastName = "Doe";
console.log(firstName.concat(" ", lastName)); // Output: "John Doe"

// Check if the string includes a certain substring
console.log(names.includes("oh")); // Output: true






