package main

import "fmt"

func main() {
	// --------------------------------------------------
	// 1. Print(), Println(), and Printf() Basics
	// --------------------------------------------------
	var i, j string = "Hello", "World"

	// Print: no newline or automatic spacing
	fmt.Print(i)
	fmt.Print(j)
	fmt.Print("\n") // Output: HelloWorld

	// Print with newline manually
	fmt.Print(i, "\n") // Hello
	fmt.Print(j, "\n") // World

	// Print with space between
	fmt.Print(i, " ", j, "\n") // Hello World

	// Println: adds space and newline automatically
	fmt.Println(i, j) // Hello World

	// Printf: format with verbs
	fmt.Printf("i has value: %v and type: %T\n", i, i)
	fmt.Printf("j has value: %v and type: %T\n\n", j, j)

	// --------------------------------------------------
	// 2. General Formatting Verbs
	// --------------------------------------------------
	var f = 15.5
	fmt.Printf("%%v: %v\n", f)     // 15.5
	fmt.Printf("%%#v: %#v\n", f)   // 15.5 (Go syntax)
	fmt.Printf("%%v%%: %v%%\n", f) // 15.5%
	fmt.Printf("%%T: %T\n\n", f)   // float64

	// --------------------------------------------------
	// 3. Integer Formatting Verbs
	// --------------------------------------------------
	var num = 15
	fmt.Printf("%%b (binary): %b\n", num)         // 1111
	fmt.Printf("%%d (decimal): %d\n", num)        // 15
	fmt.Printf("%%+d (with sign): %+d\n", num)    // +15
	fmt.Printf("%%o (octal): %o\n", num)          // 17
	fmt.Printf("%%O (octal prefix): %O\n", num)   // 0o17
	fmt.Printf("%%x (hex lower): %x\n", num)      // f
	fmt.Printf("%%X (hex upper): %X\n", num)      // F
	fmt.Printf("%%#x (hex with 0x): %#x\n", num)  // 0xf
	fmt.Printf("%%4d (pad right): %4d\n", num)    //   15
	fmt.Printf("%%-4d (pad left): %-4d\n", num)   // 15
	fmt.Printf("%%04d (zero pad): %04d\n\n", num) // 0015

	// --------------------------------------------------
	// 4. String Formatting Verbs
	// --------------------------------------------------
	str := "Hello"
	fmt.Printf("%%s (plain): %s\n", str)              // Hello
	fmt.Printf("%%q (quoted): %q\n", str)             // "Hello"
	fmt.Printf("%%8s (right justified): %8s\n", str)  // "   Hello"
	fmt.Printf("%%-8s (left justified): %-8s\n", str) // "Hello   "
	fmt.Printf("%%x (hex bytes): %x\n", str)          // 48656c6c6f
	fmt.Printf("%% x (hex spaced): % x\n\n", str)     // 48 65 6c 6c 6f

	// --------------------------------------------------
	// 5. Boolean Formatting Verbs
	// --------------------------------------------------
	boolVal1 := true
	boolVal2 := false
	fmt.Printf("%%t true: %t\n", boolVal1)    // true
	fmt.Printf("%%t false: %t\n\n", boolVal2) // false

	// --------------------------------------------------
	// 6. Float Formatting Verbs
	// --------------------------------------------------
	floatNum := 3.141
	fmt.Printf("%%e (scientific): %e\n", floatNum)                // 3.141000e+00
	fmt.Printf("%%f (decimal): %f\n", floatNum)                   // 3.141000
	fmt.Printf("%%.2f (2 decimal places): %.2f\n", floatNum)      // 3.14
	fmt.Printf("%%6.2f (width 6, 2 decimals): %6.2f\n", floatNum) //   3.14
	fmt.Printf("%%g (compact): %g\n", floatNum)                   // 3.141
}
