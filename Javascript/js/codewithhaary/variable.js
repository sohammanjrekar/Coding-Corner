let a = 5; // 'let' allows you to declare variables that can be reassigned a new value later
console.log(a); // Output: 5

{
    // Start of a block scope
    a = "soham"; // Assign the string "soham" to the variable 'a' (changing its type from number to string)
    console.log(a); // Output: "soham"
    // End of the block scope
}

const b = 54; // 'const' declares a variable that cannot be reassigned a new value after initialization
// b = 5; // This line will throw an error because you cannot reassign a value to a constant variable

// Variables:
// - 'a' is a mutable variable declared with the 'let' keyword. Its value can be changed.
// - 'b' is an immutable variable declared with the 'const' keyword. Its value cannot be changed after initialization.

/* Advantages and Disadvantages:
- 'let':
  - Advantages: Provides block-scoping, allowing for more predictable behavior and avoiding variable hoisting issues.
  - Disadvantages: Variables declared with 'let' can be reassigned, which might lead to unintended changes and harder debugging in complex programs.

- 'const':
  - Advantages: Ensures immutability for variables, making the code more robust and easier to reason about. It also helps catch accidental reassignments.
  - Disadvantages: Cannot be reassigned, so it's not suitable for variables whose values need to change over time. However, for objects and arrays declared with 'const', their properties or elements can still be modified.

- 'var':
  - 'var' has function-scoping instead of block-scoping, which can lead to unexpected behavior in certain situations. It also suffers from hoisting issues.
  - It's generally recommended to use 'let' and 'const' instead of 'var' in modern JavaScript, as 'var' has been largely replaced by 'let' and 'const' for variable declarations.
*/
