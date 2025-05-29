package main

import (
	"fmt"
)

// Define a struct to demonstrate struct variables
type MyStruct struct {
	Name string
	Age  int
}

func variables() {
	// -----------------------------
	// Variable Declarations
	// -----------------------------
	var name string = "John" // With type
	var name2 = "Doe"        // Type inferred
	name3 := "Mike"          // Short declaration (only inside functions)
	fmt.Println(name, name2, name3)

	// -----------------------------
	// Data Types
	// -----------------------------
	var a int = 42
	var b float64 = 7.8
	var c complex64 = 2 + 3i
	var d string = "Hello, World!"
	var e bool = true
	var f byte = 'A'
	var g rune = 'α'

	fmt.Println("Basic types:", a, b, c, d, e, f, g)

	// -----------------------------
	// Numeric Variants
	// -----------------------------
	var i int = 42
	var u uint = 100
	var i8 int8 = -128
	var u8 uint8 = 255
	fmt.Println("Integers:", i, u, i8, u8)

	// -----------------------------
	// Floating Point & Complex Numbers
	// -----------------------------
	var f32 float32 = 3.14
	var f64 float64 = 3.14159
	var c64 complex64 = 1 + 2i
	var c128 complex128 = 1 + 2i
	fmt.Println("Floats & Complex:", f32, f64, c64, c128)

	// -----------------------------
	// Pointer
	// -----------------------------
	var ptr *int = &i
	fmt.Printf("Pointer to i: Value = %v, Type = %T\n", ptr, ptr)

	// -----------------------------
	// Slice
	// -----------------------------
	var slice []int = []int{1, 2, 3, 4}
	fmt.Println("Slice:", slice)

	// -----------------------------
	// Map
	// -----------------------------
	var m map[string]int = map[string]int{"one": 1, "two": 2}
	fmt.Println("Map:", m)

	// -----------------------------
	// Struct
	// -----------------------------
	var p = MyStruct{Name: "John", Age: 30}
	fmt.Println("Struct:", p)

	// -----------------------------
	// Channel
	// -----------------------------
	var ch chan int = make(chan int)
	fmt.Printf("Channel: %v, Type: %T\n", ch, ch)

	// -----------------------------
	// Function as variable
	// -----------------------------
	var square func(x int) int = func(x int) int {
		return x * x
	}
	fmt.Println("Function result (square 4):", square(4))

	// -----------------------------
	// Short Declaration with :=
	// -----------------------------
	k := 52
	fmt.Println("Short declaration k:", k)

	// -----------------------------
	// Multiple variable declaration
	// -----------------------------
	var a1, b1, c1, d1 int = 1, 3, 5, 7
	fmt.Println("Multiple variables:", a1, b1, c1, d1)

	// -----------------------------
	// Constants
	// -----------------------------
	const pi = 3.14        // Untyped constant
	const ConstInt int = 1 // Typed constant
	fmt.Println("Constants:", pi, ConstInt)

	const (
		A1 int    = 1
		B2        = 3.14
		C3 string = "Hi!"
	)
	fmt.Println("Grouped constants:", A1, B2, C3)

	// -----------------------------
	// User Input (optional for interactive programs)
	// -----------------------------
	/*
		var inputName string
		fmt.Print("Enter your name: ")
		fmt.Scanln(&inputName)
		fmt.Printf("Hello, %s!\n", inputName)
	*/

	// Note: The input part above is commented out for non-interactive usage.
}
