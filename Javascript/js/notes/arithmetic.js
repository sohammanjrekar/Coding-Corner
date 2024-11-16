// ==========================
// 1. Addition (+)
// ==========================
var a = 9,
    b = 3,
    c = a + b;
console.log('Addition:', c); // 12

var d = a + b + c;  // Using multiple additions in a single statement
console.log('Multiple Addition:', d); // 20

// Edge cases with addition
console.log(null + null); // 0
console.log(null + undefined); // NaN
console.log(null + {}); // "null[object Object]"
console.log(null + ''); // "null"
console.log("123" + 1); // "1231"
console.log(true + 1); // 2
console.log(false + 5); // 5
console.log(null + 1); // 1
console.log(undefined + 1); // NaN
console.log(true + "1"); // "true1"
console.log(false + "bar"); // "falsebar"

// ==========================
// 2. Subtraction (-)
// ==========================
var e = a - b;
console.log('Subtraction:', e); // 6

console.log("5" - 1); // 4
console.log(7 - "3"); // 4
console.log("5" - true); // 4
console.log("foo" - 1); // NaN
console.log(100 - "bar"); // NaN

// ==========================
// 3. Multiplication (*)
// ==========================
console.log(3 * 5); // 15
console.log(-3 * 5); // -15
console.log(3 * -5); // -15
console.log(-3 * -5); // 15

// ==========================
// 4. Division (/)
// ==========================
console.log(15 / 3); // 5
console.log(15 / 4); // 3.75

// ==========================
// 5. Modulus (%)
// ==========================
console.log(42 % 10); // 2
console.log(42 % -10); // 2
console.log(-42 % 10); // -2
console.log(-42 % -10); // -2
console.log(-40 % 10); // -0
console.log(40 % 10); // 0

// Modulus with cyclical increment/decrement
var n = 10;
var i = 0;
function inc() {
    i = (i + 1) % n;
}
function delta(d) {
    i = (i + d + n) % n;
}
inc(); // i becomes 1
console.log(i); // 1
delta(5); // i becomes 6 (from 1)
console.log(i); // 6
delta(-2); // i becomes 4 (from 6)
console.log(i); // 4

// Using modulus to obtain fractional part
var myNum = 10 / 4; // 2.5
var fraction = myNum % 1; // 0.5
console.log('Fraction of myNum:', fraction); // 0.5

myNum = -20 / 7; // -2.857
fraction = myNum % 1; // -0.857
console.log('Fraction of myNum:', fraction); // -0.857

// ==========================
// 6. Increment (++)
// ==========================
var f = 5;
var g = f++;  // Postfix increment (f is incremented after assignment)
var h = f;
console.log('Postfix Increment:', g, h); // 5, 6

var i = 5;
var j = ++i;  // Prefix increment (i is incremented before assignment)
var k = i;
console.log('Prefix Increment:', j, k); // 6, 6

// ==========================
// 7. Decrement (--)
// ==========================
var l = 5;
var m = l--;  // Postfix decrement (l is decremented after assignment)
var n = l;
console.log('Postfix Decrement:', m, n); // 5, 4

var o = 5;
var p = --o;  // Prefix decrement (o is decremented before assignment)
var q = o;
console.log('Prefix Decrement:', p, q); // 4, 4

// ==========================
// 8. Using clz32 Method (browser support note)
// ==========================
if (Math.clz32) {
    console.log(Math.clz32(8)); // Count leading zeros in binary form (example)
} else {
    console.log('clz32 method is not supported in this browser');
}
