package main

import "fmt"

// printArray accepts a fixed-size array and prints it
func printArray(arr [5]int) {
	fmt.Println("Array passed to function:", arr)
}

const arraySize = 5 // Constant for array size

func array() {
	// 1. Declare array with var and explicit size + init
	var arr [5]int = [5]int{1, 2, 3, 4, 5}
	fmt.Println("arr (declared with var):", arr)

	// 2. Short declaration with inferred type
	arr1 := [5]int{1, 2, 3, 4, 5}
	fmt.Println("arr1 (short declaration):", arr1)

	// 3. Declare without initialization (zero values)
	var arr2 [5]int
	fmt.Println("arr2 (zero-initialized):", arr2)

	// 4. Partial initialization (remaining elements zero)
	arr3 := [5]int{1, 2, 3}
	fmt.Println("arr3 (partial init):", arr3)

	// 5. Use ellipsis to let Go infer size
	arr4 := [...]int{1, 2, 3, 4, 5}
	fmt.Println("arr4 (ellipsis size):", arr4)

	// 6. 2D Array declaration and initialization
	arr5 := [2][3]int{
		{1, 2, 3},
		{4, 5, 6},
	}
	fmt.Println("arr5 (2D array):", arr5)

	// 7. Jagged array simulation using array of slices
	arr6 := [2][]int{
		{1, 2, 3}, // first slice length 3
		{4, 5},    // second slice length 2
	}
	fmt.Println("arr6 (array of slices):", arr6)

	// 8. Iteration with range
	fmt.Println("Iterating arr1 with range:")
	for idx, val := range arr1 {
		fmt.Printf("arr1[%d] = %d\n", idx, val)
	}

	// 9. Passing array to function
	printArray(arr1)

	// 10. Array length, capacity, and type info
	fmt.Println("Length of arr1:", len(arr1))   // Number of elements
	fmt.Println("Capacity of arr1:", cap(arr1)) // Same as length for arrays
	fmt.Printf("Type of arr1: %T\n", arr1)
	fmt.Printf("Type of arr1[0]: %T\n", arr1[0])

	// 11. Using constant for array size
	var arr9 [arraySize]int = [arraySize]int{1, 2, 3, 4, 5}
	fmt.Println("arr9 (using constant size):", arr9)
}
