// ==========================
// Anti-pattern: Chaining Assignments in `var` Declaration
// ==========================
(function foo() {
    // This will cause 'b' to become a global variable unintentionally
    var a = b = 0;  // Chaining assignments in var declaration
})();

// Trying to access 'a' and 'b' outside the function
try {
    console.log('a: ' + a);  // Uncaught ReferenceError: a is not defined
} catch (e) {
    console.log('Error accessing a: ' + e.message);  // Expected error because 'a' is local
}

console.log('b: ' + b);  // 'b: 0' (b is global, so it's accessible outside)

// ==========================
// Corrected Version: Avoid Global Variables
// ==========================
(function foo() {
    // Correct way: Declare both 'a' and 'b' as local variables explicitly
    var a = 0, b = 0;  // Both 'a' and 'b' are local to the function
    console.log('a inside function: ' + a);  // 'a inside function: 0'
    console.log('b inside function: ' + b);  // 'b inside function: 0'
})();

// Trying to access 'a' and 'b' outside the function after correction
try {
    console.log('a outside function: ' + a);  // Uncaught ReferenceError: a is not defined
} catch (e) {
    console.log('Error accessing a: ' + e.message);  // Expected error because 'a' is local
}

try {
    console.log('b outside function: ' + b);  // Uncaught ReferenceError: b is not defined
} catch (e) {
    console.log('Error accessing b: ' + e.message);  // Expected error because 'b' is local
}
