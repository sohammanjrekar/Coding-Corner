// JavaScript Array Basics: Creation, Manipulation, and Methods

// 1. Creating Arrays
let numbers = [1, 2, 3, 4, 5];  // An array of numbers
let fruits = ['apple', 'banana', 'cherry'];  // An array of strings
let mixedArray = [1, 'apple', true, null];  // An array with mixed data types

// 2. Accessing Array Elements
console.log(numbers[0]);  // Access the first element (1)
console.log(fruits[1]);   // Access the second element ('banana')
console.log(mixedArray[2]); // Access the third element (true)

// 3. Modifying Array Elements
numbers[2] = 10;  // Change the third element (index 2) from 3 to 10
console.log(numbers);  // Output: [1, 2, 10, 4, 5]

// 4. Array Methods

// 4.1. push() - Adds one or more elements to the end of the array
fruits.push('date');  // Add 'date' to the end of the fruits array
console.log(fruits);  // Output: ['apple', 'banana', 'cherry', 'date']

// 4.2. pop() - Removes the last element from the array
let lastFruit = fruits.pop();  // Removes 'date' from the array
console.log(fruits);  // Output: ['apple', 'banana', 'cherry']
console.log(lastFruit);  // Output: 'date'

// 4.3. unshift() - Adds one or more elements to the beginning of the array
numbers.unshift(0);  // Adds 0 at the beginning of the numbers array
console.log(numbers);  // Output: [0, 1, 2, 10, 4, 5]

// 4.4. shift() - Removes the first element from the array
let firstNumber = numbers.shift();  // Removes 0 from the array
console.log(numbers);  // Output: [1, 2, 10, 4, 5]
console.log(firstNumber);  // Output: 0

// 4.5. concat() - Merges two or more arrays
let moreFruits = ['elderberry', 'fig'];
let allFruits = fruits.concat(moreFruits);  // Combine 'fruits' and 'moreFruits'
console.log(allFruits);  // Output: ['apple', 'banana', 'cherry', 'elderberry', 'fig']

// 4.6. slice() - Returns a shallow copy of a portion of the array
let slicedFruits = fruits.slice(1, 3);  // Extracts from index 1 to index 2 (not including index 3)
console.log(slicedFruits);  // Output: ['banana', 'cherry']

// 4.7. splice() - Adds or removes elements from an array
fruits.splice(1, 1, 'blueberry');  // Removes 1 element at index 1 and adds 'blueberry'
console.log(fruits);  // Output: ['apple', 'blueberry', 'cherry']

// 4.8. indexOf() - Finds the first occurrence of an element in the array
let indexOfBanana = fruits.indexOf('banana');  // Find the index of 'banana'
console.log(indexOfBanana);  // Output: -1 (because 'banana' was replaced with 'blueberry')

// 4.9. includes() - Checks if an array contains a certain element
let hasCherry = fruits.includes('cherry');  // Check if 'cherry' is in the array
console.log(hasCherry);  // Output: true

// 4.10. forEach() - Executes a provided function once for each array element
fruits.forEach((fruit, index) => {
  console.log(`Index ${index}: ${fruit}`);
});
// Output:
// Index 0: apple
// Index 1: blueberry
// Index 2: cherry

// 4.11. map() - Creates a new array with the results of calling a provided function on every element
let upperCaseFruits = fruits.map(fruit => fruit.toUpperCase());
console.log(upperCaseFruits);  // Output: ['APPLE', 'BLUEBERRY', 'CHERRY']

// 4.12. filter() - Creates a new array with all elements that pass the test implemented by the provided function
let numbersGreaterThanFive = numbers.filter(num => num > 5);
console.log(numbersGreaterThanFive);  // Output: [10]

// 4.13. reduce() - Applies a function against an accumulator and each element to reduce it to a single value
let sum = numbers.reduce((acc, num) => acc + num, 0);
console.log(sum);  // Output: 22 (1 + 2 + 10 + 4 + 5)

// 4.14. sort() - Sorts the array in place (by default, sorts as strings)
let sortedFruits = fruits.sort();
console.log(sortedFruits);  // Output: ['apple', 'blueberry', 'cherry']

// 4.15. reverse() - Reverses the order of the elements in the array
let reversedFruits = fruits.reverse();
console.log(reversedFruits);  // Output: ['cherry', 'blueberry', 'apple']

// 4.16. find() - Returns the first element that satisfies the provided testing function
let foundFruit = fruits.find(fruit => fruit.startsWith('b'));
console.log(foundFruit);  // Output: 'blueberry'

// 4.17. every() - Tests whether all elements in the array pass the provided function
let allFruitsStartWithB = fruits.every(fruit => fruit.startsWith('b'));
console.log(allFruitsStartWithB);  // Output: false (because not all start with 'b')

// 4.18. some() - Tests whether at least one element in the array passes the provided function
let someFruitsStartWithB = fruits.some(fruit => fruit.startsWith('b'));
console.log(someFruitsStartWithB);  // Output: true

// 4.19. join() - Joins all elements of the array into a string
let fruitString = fruits.join(', ');
console.log(fruitString);  // Output: 'cherry, blueberry, apple'

// 4.20. length - Gets the number of elements in the array
console.log(fruits.length);  // Output: 3 (because there are 3 fruits)

// 4.21. flat() - Flattens a nested array into a single array
let nestedArray = [1, [2, 3], [4, 5]];
let flattenedArray = nestedArray.flat();
console.log(flattenedArray);  // Output: [1, 2, 3, 4, 5]

// 4.22. fill() - Changes all elements in an array to a static value
let filledArray = new Array(5).fill(0);  // Creates an array of length 5, filled with 0s
console.log(filledArray);  // Output: [0, 0, 0, 0, 0]

// 4.23. findIndex() - Returns the index of the first element that satisfies the provided testing function
let indexOfApple = fruits.findIndex(fruit => fruit === 'apple');
console.log(indexOfApple);  // Output: 2 (index of 'apple' in the reversed array)
// 4.24. copyWithin() - Shallow copies a portion of an array to another position within the same array
let arr = [1, 2, 3, 4, 5];
arr.copyWithin(0, 3);  // Copies elements from index 3 to the end and pastes it starting from index 0
console.log(arr);  // Output: [4, 5, 3, 4, 5]

// 4.25. from() - Creates a new array from an iterable or array-like object
let stringToArray = Array.from("hello");  // Converts a string to an array of characters
console.log(stringToArray);  // Output: ['h', 'e', 'l', 'l', 'o']

// 4.26. keys() - Returns a new Array Iterator object that contains the keys (indexes) of the array
let keysIterator = fruits.keys();
for (let key of keysIterator) {
  console.log(key);  // Output: 0, 1, 2 (indexes of the array)
}

// 4.27. values() - Returns a new Array Iterator object that contains the values of the array
let valuesIterator = fruits.values();
for (let value of valuesIterator) {
  console.log(value);  // Output: 'cherry', 'blueberry', 'apple'
}

// 4.28. entries() - Returns a new Array Iterator object that contains key/value pairs (index and value)
let entriesIterator = fruits.entries();
for (let entry of entriesIterator) {
  console.log(entry);  // Output: [0, 'cherry'], [1, 'blueberry'], [2, 'apple']
}

// 4.29. flatMap() - First maps each element using a mapping function, then flattens the result into a new array
let nestedArrayMap = [[1, 2], [3, 4], [5, 6]];
let flattenedMap = nestedArrayMap.flatMap(arr => arr);
console.log(flattenedMap);  // Output: [1, 2, 3, 4, 5, 6]

// 4.30. at() - Accesses an element at a given index (works with negative indices)
let negativeIndexAccess = fruits.at(-1);  // Accesses the last element of the array ('apple')
console.log(negativeIndexAccess);  // Output: 'apple'

// 4.31. sort() with custom comparator - Sorts the array with a custom comparison function
let unsortedNumbers = [10, 1, 21, 3];
unsortedNumbers.sort((a, b) => a - b);  // Sorts in ascending order
console.log(unsortedNumbers);  // Output: [1, 3, 10, 21]

// 4.32. fill() with start, end, and value - Fills a section of the array with a specific value
let arrayToFill = [1, 2, 3, 4, 5];
arrayToFill.fill(0, 1, 4);  // Fills the portion from index 1 to 3 with 0s
console.log(arrayToFill);  // Output: [1, 0, 0, 0, 5]

// 4.33. toString() - Returns a string representation of the array
let arrayToString = fruits.toString();
console.log(arrayToString);  // Output: 'cherry,blueberry,apple'

// 4.34. slice() for Shallow Copy - Creates a shallow copy of an array
let shallowCopy = fruits.slice();
console.log(shallowCopy);  // Output: ['cherry', 'blueberry', 'apple']
