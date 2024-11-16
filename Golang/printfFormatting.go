package main

import "fmt"

func main() {
	// ------------------------------
	// General Formatting Verbs
	// ------------------------------
	var i = 15.5

	// %v: Prints the value in the default format
	fmt.Printf("%v\n", i) // Output: 15.5

	// %#v: Prints the value in Go-syntax format
	fmt.Printf("%#v\n", i) // Output: 15.5

	// %%: Prints the % sign
	fmt.Printf("%v%%\n", i) // Output: 15.5%

	// %T: Prints the type of the value
	fmt.Printf("%T\n", i) // Output: float64

	// ------------------------------
	// Integer Formatting Verbs
	// ------------------------------
	var num = 15

	// %b: Base 2 (binary)
	fmt.Printf("%b\n", num) // Output: 1111

	// %d: Base 10 (decimal)
	fmt.Printf("%d\n", num) // Output: 15

	// %+d: Base 10 and always show sign
	fmt.Printf("%+d\n", num) // Output: +15

	// %o: Base 8 (octal)
	fmt.Printf("%o\n", num) // Output: 17

	// %O: Base 8 with leading 0o
	fmt.Printf("%O\n", num) // Output: 0o17

	// %x: Base 16 (hexadecimal, lowercase)
	fmt.Printf("%x\n", num) // Output: f

	// %X: Base 16 (hexadecimal, uppercase)
	fmt.Printf("%X\n", num) // Output: F

	// %#x: Base 16 with leading 0x
	fmt.Printf("%#x\n", num) // Output: 0xf

	// %4d: Pad with spaces (width 4, right justified)
	fmt.Printf("%4d\n", num) // Output: "  15" (2 spaces before 15)

	// %-4d: Pad with spaces (width 4, left justified)
	fmt.Printf("%-4d\n", num) // Output: "15  " (2 spaces after 15)

	// %04d: Pad with zeros (width 4)
	fmt.Printf("%04d\n", num) // Output: "0015" (zero-padded to 4 digits)

	// ------------------------------
	// String Formatting Verbs
	// ------------------------------
	var str = "Hello"

	// %s: Print as plain string
	fmt.Printf("%s\n", str) // Output: Hello

	// %q: Print as a double-quoted string
	fmt.Printf("%q\n", str) // Output: "Hello"

	// %8s: Print with width 8, right justified
	fmt.Printf("%8s\n", str) // Output: "   Hello" (3 spaces before "Hello")

	// %-8s: Print with width 8, left justified
	fmt.Printf("%-8s\n", str) // Output: "Hello   " (3 spaces after "Hello")

	// %x: Print as hex dump of byte values (one byte per hex character)
	fmt.Printf("%x\n", str) // Output: 48656c6c6f

	// % x: Print as hex dump with spaces between bytes
	fmt.Printf("% x\n", str) // Output: 48 65 6c 6c 6f

	// ------------------------------
	// Boolean Formatting Verbs
	// ------------------------------
	var boolVal1 = true
	var boolVal2 = false

	// %t: Print the boolean value as true or false
	fmt.Printf("%t\n", boolVal1) // Output: true
	fmt.Printf("%t\n", boolVal2) // Output: false

	// ------------------------------
	// Float Formatting Verbs
	// ------------------------------
	var floatNum = 3.141

	// %e: Scientific notation with 'e' as the exponent
	fmt.Printf("%e\n", floatNum) // Output: 3.141000e+00

	// %f: Decimal point, no exponent
	fmt.Printf("%f\n", floatNum) // Output: 3.141000

	// %.2f: Default width, precision 2 (rounds to 2 decimal places)
	fmt.Printf("%.2f\n", floatNum) // Output: 3.14

	// %6.2f: Width 6, precision 2 (pads with spaces to width 6, and rounds to 2 decimal places)
	fmt.Printf("%6.2f\n", floatNum) // Output: "  3.14" (2 spaces before 3.14)

	// %g: Exponent as needed, only necessary digits
	fmt.Printf("%g\n", floatNum) // Output: 3.141 (No trailing zeros)
}
