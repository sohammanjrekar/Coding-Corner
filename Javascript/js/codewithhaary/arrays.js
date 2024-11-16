// Declare an array 'marks' containing various data types
let marks = [50, 85, 95, 85, null, "soham"];
console.log(marks, typeof(marks)); // Output: [50, 85, 95, 85, null, "soham"] object

// Access an element in the array using its index
console.log(marks[3], typeof(marks[3])); // Output: 85 number

// Iterate through each element of the array using a for...of loop
for (const i of marks) {
    console.log(i, typeof(i)); // Output each element of the array on a new line
}

// Get the length of the array
console.log(marks.length, typeof(marks.length)); // Output: 6 number

// Accessing an index beyond the array's length results in 'undefined'
console.log(marks[6], typeof(marks[6])); // Output: undefined undefined

// Change the value of an element in the array
marks[0] = 569;
console.log(marks, typeof(marks)); // Output: [569, 85, 95, 85, null, "soham"] object

// Array Methods:

// - push(): Add one or more elements to the end of an array.
marks.push(80);
console.log(marks, typeof(marks)); // Output: [569, 85, 95, 85, null, "soham", 80] object

// - pop(): Remove the last element from an array.
let lastElement = marks.pop();
console.log(lastElement, typeof(lastElement)); // Output: 80 number
console.log(marks, typeof(marks)); // Output: [569, 85, 95, 85, null, "soham"] object

// - shift(): Remove the first element from an array.
let firstElement = marks.shift();
console.log(firstElement, typeof(firstElement)); // Output: 569 number
console.log(marks, typeof(marks)); // Output: [85, 95, 85, null, "soham"] object

// - unshift(): Add one or more elements to the beginning of an array.
marks.unshift(70, 75);
console.log(marks, typeof(marks)); // Output: [70, 75, 85, 95, 85, null, "soham"] object

// - concat(): Merge two or more arrays.
let otherMarks = [80, 90];
let allMarks = marks.concat(otherMarks);
console.log(allMarks, typeof(allMarks)); // Output: [70, 75, 85, 95, 85, null, "soham", 80, 90] object

// - slice(): Extract a section of an array and return a new array.
let selectedMarks = allMarks.slice(2, 5);
console.log(selectedMarks, typeof(selectedMarks)); // Output: [85, 95, 85] object

// - splice(): Add or remove elements from an array.
allMarks.splice(2, 2, 60, 65);
console.log(allMarks, typeof(allMarks)); // Output: [70, 75, 60, 65, 85, null, "soham", 80, 90] object

// - indexOf(): Find the index of the first occurrence of a specified value in an array.
let indexOfSoham = allMarks.indexOf("soham");
console.log(indexOfSoham, typeof(indexOfSoham)); // Output: 6 number

// - lastIndexOf(): Find the index of the last occurrence of a specified value in an array.
let numbers = [1, 2, 3, 4, 2, 5];
let lastIndex = numbers.lastIndexOf(2);
console.log(lastIndex, typeof(lastIndex)); // Output: 4 number

// - includes(): Check if an array contains a certain element, returning true or false.
let fruits = ['apple', 'banana', 'orange', 'grape'];
let includesOrange = fruits.includes('orange');
console.log(includesOrange, typeof(includesOrange)); // Output: true boolean

// - forEach(): Execute a provided function once for each array element.
numbers = [1, 2, 3, 4];
numbers.forEach((num) => {
    console.log(num * 2, typeof(num * 2)); // Output: 2 number, 4 number, 6 number, 8 number
});

// - map(): Create a new array by applying a function to each element of an existing array.
let doubledNumbers = numbers.map((num) => {
    return num * 2;
});
console.log(doubledNumbers, typeof(doubledNumbers)); // Output: [2, 4, 6, 8] object

// - filter(): Create a new array with elements that pass a certain condition.
let evenNumbers = numbers.filter((num) => {
    return num % 2 === 0;
});
console.log(evenNumbers, typeof(evenNumbers)); // Output: [2, 4] object

// - reduce(): Reduce the array to a single value (from left-to-right).
let sum = numbers.reduce((accumulator, currentValue) => {
    return accumulator + currentValue;
}, 0);
console.log(sum, typeof(sum)); // Output: 10 number

// - every(): Check if all elements in an array pass a certain condition.
let allGreaterThanZero = numbers.every((num) => {
    return num > 0;
});
console.log(allGreaterThanZero, typeof(allGreaterThanZero)); // Output: true boolean

// - some(): Check if at least one element in an array passes a certain condition.
let hasNegativeNumber = numbers.some((num) => {
    return num < 0;
});
console.log(hasNegativeNumber, typeof(hasNegativeNumber)); // Output: false boolean

// - find(): Return the first element in an array that satisfies a provided testing function.
let foundNumber = numbers.find((num) => {
    return num % 2 === 0;
});
console.log(foundNumber, typeof(foundNumber)); // Output: 2 number

// - findIndex(): Return the index of the first element in an array that satisfies a provided testing function.
let foundIndex = numbers.findIndex((num) => {
    return num % 2 === 0;
});
console.log(foundIndex, typeof(foundIndex)); // Output: 1 number

// - sort(): Sort the elements of an array in place and return the sorted array.
let sortedNumbers = numbers.sort((a, b) => {
    return a - b;
});
console.log(sortedNumbers, typeof(sortedNumbers)); // Output: [1, 2, 3, 4] object


// - reverse(): Reverse the order of the elements in an array.
let reversedNumbers = numbers.reverse();
console.log(reversedNumbers, typeof(reversedNumbers)); // Output: [4, 3, 2, 1] object

// - fill(): Fill all the elements of an array from a start index to an end index with a static value.
let emptyArray = new Array(5);
emptyArray.fill(0);
console.log(emptyArray, typeof(emptyArray)); // Output: [0, 0, 0, 0, 0] object

// - join(): Combine all elements of an array into a single string.
fruits = ['apple', 'banana', 'orange'];
let joinedString = fruits.join(', ');
console.log(joinedString, typeof(joinedString)); // Output: "apple, banana, orange" string

// - toString(): Convert an array to a string.
let stringifiedArray = fruits.toString();
console.log(stringifiedArray, typeof(stringifiedArray)); // Output: "apple,banana,orange" string

// - isArray(): Check if a value is an array.
console.log(Array.isArray(fruits), typeof(Array.isArray(fruits))); // Output: true boolean



// Example 1: Convert a string to an array of characters

// Define a string
let str = "Hello, world!";

// Use Array.from to convert the string to an array of characters
let charArray = Array.from(str);

// Print the resulting array of characters
console.log("Array of characters:", charArray);


// Define an array
let colors = ['red', 'green', 'blue', 'yellow'];

// Using for loop to iterate over the array
console.log("Using for loop:");
for (let i = 0; i < colors.length; i++) {
    console.log(colors[i]);
}

// Using for...in loop to iterate over the array
console.log("\nUsing for...in loop:");
for (let index in colors) {
    console.log(colors[index]);
}

// Using for...of loop to iterate over the array
console.log("\nUsing for...of loop:");
for (let color of colors) {
    console.log(color);
}
