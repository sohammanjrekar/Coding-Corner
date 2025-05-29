package main

import "fmt"

// Variadic functions allow you to pass a any number of arguments to a function.
func sums(nums ...int) int {
	total := 0
	for ok, n := range nums {
		fmt.Printf("Index: %d, Value: %d\n", ok, n)
		total += n
	}
	return total
}
func variadicFuncEx() {
	fmt.Println(sums(1, 2, 3))
}
