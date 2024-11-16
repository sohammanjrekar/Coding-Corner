// Arrays are used to store multiple values of the same type in a single variable, instead of declaring separate variables for each value.
package main

import "fmt"

// Function that accepts an array and prints it
func printArray(arr [5]int) {
	fmt.Println("Array in function:", arr)
}

const arraySize = 5 // Using a constant for array size

func main() {
	// 1. Declaring an array using var with explicit size and initialization
	var arr [5]int = [5]int{1, 2, 3, 4, 5}
	fmt.Println("Array arr (declared with var):", arr)

	// 2. Using short declaration (:=) to declare and initialize an array
	arr1 := [5]int{1, 2, 3, 4, 5}
	fmt.Println("Array arr1 (short declaration):", arr1)

	// 3. Declaring an array without initializing it (defaults to zero values)
	var arr2 [5]int
	fmt.Println("Array arr2 (declared without initialization):", arr2)

	// 4. Partially initializing an array (other elements are zero)
	var arr3 = [5]int{1, 2, 3}
	fmt.Println("Array arr3 (partially initialized):", arr3)

	// 5. Using ellipsis `...` to let Go infer the array size
	arr4 := [...]int{1, 2, 3, 4, 5}
	fmt.Println("Array arr4 (using ellipsis):", arr4)

	// 6. Declaring and initializing a 2D array
	var arr5 = [2][3]int{
		{1, 2, 3},
		{4, 5, 6},
	}
	fmt.Println("Array arr5 (2D array):", arr5)

	// 7. Array of arrays (simulating jagged arrays using slices)
	var arr6 = [2][]int{
		{1, 2, 3}, // First array has 3 elements
		{4, 5},    // Second array has 2 elements
	}
	fmt.Println("Array arr6 (array of arrays):", arr6)

	// 8. Iterating over arrays using range
	fmt.Println("Iterating over arr7 using range:")
	arr7 := [5]int{1, 2, 3, 4, 5}
	for index, value := range arr7 {
		fmt.Printf("arr7[%d] = %d\n", index, value)
	}

	// 9. Passing arrays to functions
	arr8 := [5]int{1, 2, 3, 4, 5}
	printArray(arr8)

	// 10. Using a constant for array size
	var arr9 [arraySize]int = [arraySize]int{1, 2, 3, 4, 5}
	fmt.Println("Array arr9 (using constant for size):", arr9)
}
