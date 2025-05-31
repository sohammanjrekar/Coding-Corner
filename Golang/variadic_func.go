package main

import "fmt"

// sums is a variadic function that takes any number of int arguments.
// The 'nums ...int' syntax allows the caller to pass multiple integers.
func sums(nums ...int) int {
	total := 0
	for idx, n := range nums {
		fmt.Printf("Index: %d, Value: %d\n", idx, n)
		total += n
	}
	return total
}

// variadicFuncEx demonstrates usage of variadic functions in Go
func variadicFuncEx() {
	fmt.Println("== Variadic Function Example ==")

	// Calling variadic function with individual integers
	result1 := sums(1, 2, 3)
	fmt.Println("Sum of 1, 2, 3:", result1)

	// Calling variadic function with more arguments
	result2 := sums(10, 20, 30, 40)
	fmt.Println("Sum of 10, 20, 30, 40:", result2)

	// Passing a slice to a variadic function using '...'
	numSlice := []int{100, 200, 300}
	result3 := sums(numSlice...) // '...' unpacks the slice into individual arguments
	fmt.Println("Sum of slice elements [100, 200, 300]:", result3)
}
