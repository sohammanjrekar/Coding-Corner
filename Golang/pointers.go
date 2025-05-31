package main

import "fmt"

// changeNum takes a pointer to an int and modifies the value it points to
func changeNum(num *int) {
	*num = 5 // Dereferencing the pointer to change the actual value
	fmt.Println("Inside changeNum: Value changed to", *num)
}

// pointers demonstrates basic pointer usage in Go
func pointers() {
	// 1. Declare a normal integer variable
	num := 52
	fmt.Println("Before calling changeNum - Value:", num)

	// 2. Pass the address of num to the function
	changeNum(&num) // &num gives the memory address (pointer) of num

	// 3. The value of num is modified via pointer dereferencing inside the function
	fmt.Println("After calling changeNum - Value:", num)

	// 4. Manual pointer creation and usage (optional extension)
	var ptr *int = &num                       // ptr holds the address of num
	fmt.Println("\nPointer Address:", ptr)    // address
	fmt.Println("Pointer Dereference:", *ptr) // value at address

	// 5. Nil pointer (zero value of a pointer is nil)
	var nilPtr *int
	fmt.Println("\nNil Pointer Example:")
	fmt.Println("nilPtr:", nilPtr) // Will print: nil
	// Dereferencing nil pointer will panic, so always check:
	if nilPtr == nil {
		fmt.Println("nilPtr is nil, cannot dereference.")
	}
}
