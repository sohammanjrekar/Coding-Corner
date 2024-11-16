// 1. Basic Example (ASI works fine)

// 1.1. Variables assignment without semicolons (ASI inserts them automatically)
let x = 10
let y = 20
console.log(x + y)  // Output: 30

// 2. Return Statement Problem (ASI can cause issues with `return` statement)

// 2.1. This will return `undefined` due to ASI inserting a semicolon after `return`
function getValue() {
    return
    {
        value: 42
    }
}

console.log(getValue());  // Output: undefined

// 2.2. To avoid ASI problems with return, always place the return value on the same line
function getFixedValue() {
    return {
        value: 42
    };
}

console.log(getFixedValue());  // Output: { value: 42 }

// 3. Block Statements (ASI works fine but be cautious with line breaks)

// 3.1. Function without semicolons; ASI works fine
function doSomething() {
    let a = 10
    let b = 20
    console.log(a + b)  // Output: 30
}

doSomething();  // Function works without issues because of ASI

// 4. Return Statement with One-Liner Function (ASI may cause unexpected results)

// 4.1. The following one-liner function has an ASI issue
const addNumbers = (a, b) => 
    a + b

console.log(addNumbers(2, 3));  // Output: NaN (unexpected)

// 4.2. Fixed version: Put `return` explicitly or use braces to avoid ASI issue
const addNumbersFixed = (a, b) => {
    return a + b;
}

console.log(addNumbersFixed(2, 3));  // Output: 5

// 5. ASI and if/else Statements (ASI can cause issues when a block is missing)

// 5.1. ASI problem: Missing braces around `if` and `else` can lead to bugs
function checkCondition() {
    let isValid = true;

    if (isValid) 
        console.log("Valid");
    else 
        console.log("Invalid");
}

checkCondition();  // Output: Valid (unexpected - ASI inserted semicolon after `if`)

// 5.2. Fixed version: Always use braces for `if` and `else`
function checkConditionFixed() {
    let isValid = true;

    if (isValid) {
        console.log("Valid");
    } else {
        console.log("Invalid");
    }
}

checkConditionFixed();  // Output: Valid

// 6. ASI Works Fine with Loops (But be cautious with block-less loops)

// 6.1. Loop works fine with ASI
let i = 0;
for (i = 0; i < 5; i++)
    console.log(i)  // Output: 0, 1, 2, 3, 4

console.log("Loop finished");  // Output: "Loop finished"

// 7. ASI with Function Expressions (Works fine but still requires care)

// 7.1. Function expression without semicolons - ASI inserts them automatically
const foo = function() {
    console.log("Hello, World!");
}
foo();  // Output: Hello, World!

// 7.2. Using a function expression in an assignment
const greet = function(name) {
    console.log(`Hello, ${name}!`);
}

greet("Alice");  // Output: Hello, Alice!

// 8. General Rule to Avoid ASI Problems

// 8.1. Always be cautious when using `return`, `throw`, or `break`
// 8.2. Never break the line immediately after `return`, `throw`, or `break`

function testReturnIssue() {
    return  // ASI will insert a semicolon here and return `undefined`
    {
        name: "John"
    };
}

console.log(testReturnIssue());  // Output: undefined

// Correct way:
function testReturnFixed() {
    return { name: "John" };  // No line break after `return`
}

console.log(testReturnFixed());  // Output: { name: "John" }
