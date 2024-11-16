package main

import "fmt"

type MyStruct struct {
	Name string
	Age  int
}

func main() {
	// Integer types
	var i int = 42
	var u uint = 100
	var i8 int8 = -128
	var u8 uint8 = 255

	// Floating point types
	var f32 float32 = 3.14
	var f64 float64 = 3.14159

	// Complex types
	var c64 complex64 = 1 + 2i
	var c128 complex128 = 1 + 2i

	// Boolean type
	var b bool = true

	// String type
	var s string = "Hello, Go!"

	// Slice type
	var slice []int = []int{1, 2, 3, 4}

	// Struct type
	var p = MyStruct{Name: "John", Age: 30}

	// Map type
	var m map[string]int = map[string]int{"one": 1, "two": 2}

	// Channel type
	var ch chan int = make(chan int)

	// Pointer type
	var ptr *int = &i

	// Function type
	var f func(x int) int = func(x int) int {
		return x * x
	}

	// Printing the values and types
	fmt.Printf("i: %v, type: %T\n", i, i)
	fmt.Printf("u: %v, type: %T\n", u, u)
	fmt.Printf("i8: %v, type: %T\n", i8, i8)
	fmt.Printf("u8: %v, type: %T\n", u8, u8)
	fmt.Printf("f32: %v, type: %T\n", f32, f32)
	fmt.Printf("f64: %v, type: %T\n", f64, f64)
	fmt.Printf("c64: %v, type: %T\n", c64, c64)
	fmt.Printf("c128: %v, type: %T\n", c128, c128)
	fmt.Printf("b: %v, type: %T\n", b, b)
	fmt.Printf("s: %v, type: %T\n", s, s)
	fmt.Printf("slice: %v, type: %T\n", slice, slice)
	fmt.Printf("p: %v, type: %T\n", p, p)
	fmt.Printf("m: %v, type: %T\n", m, m)
	fmt.Printf("ch: %v, type: %T\n", ch, ch)
	fmt.Printf("ptr: %v, type: %T\n", ptr, ptr)
	fmt.Printf("f: %v, type: %T\n", f, f)

	// With the := sign
	k := 52
	fmt.Println(k)
	// In this case, the type of the variable is inferred from the value (means that the compiler decides the type of the variable, based on the value).

	// multiple variables in one line
	var a1, b1, c1, d1 int = 1, 3, 5, 7
	fmt.Println(a1, b1, c1, d1)

	// Constants
	const pi = 3.14 /// untyped constant
	const A int = 1 // type constant
	fmt.Println(pi)
	// Multiple Constants Declaration
	const (
		A1 int = 1
		B2     = 3.14
		C3     = "Hi!"
	)
	fmt.Println(A1, B2, C3)
}
