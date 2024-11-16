console.log('hello world'); // Simple string log

let name = "soham";
let message = "hello world";

// String interpolation using %s for variables
console.log("%s ,! %s", name, message);

// Logging an object with various key-value pairs
console.log({
    'Email': '',
    'Group': {},
    'ID': 98,
    'IsActive': false,
});

// Logging a DOM element (e.g., body of the document)
console.log(document.body);

// Logging different data types to see how console.log handles them
console.log("A simple string log: 'Hello!'");
console.log(42); // Log a number
console.log([1, 2, 3, 4]); // Log an array
console.log(true); // Log a boolean value
console.log(null); // Log a null value
console.log(undefined); // Log an undefined value
console.log({ name: "Soham", age: 25 }); // Log an object

// Logging a function
console.log(function greet() { return "Hello from a function!"; });

// Logging an error message
console.error("An error occurred: Something went wrong!");

// Logging a warning message
console.warn("This is a warning!");

// Logging grouped messages (console.group)
console.group('User Information');
console.log('Name: Soham');
console.log('Age: 25');
console.groupEnd();

// Logging a table format
console.table([
    { name: "Soham", age: 25 },
    { name: "Alex", age: 30 },
    { name: "Maria", age: 28 }
]);

// Logging a timestamp (useful for measuring performance)
console.time('loading');
setTimeout(() => {
    console.timeEnd('loading'); // This will print the time elapsed
}, 2000);
