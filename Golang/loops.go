package main

import "fmt"

func main() {
	// The for loop loops through a block of code a specified number of times.

	// The for loop is the only loop available in Go.
	count := 5
	for i := 1; i <= count; i++ {
		fmt.Println(i)
		if i == 3 {
			continue
		}
	}

	// range is better option
	// The range keyword is used to more easily iterate through the elements of an array, slice or map. It returns both the index and the value.

	// Using range with an array
	fruits := [3]string{"apple", "orange", "banana"}
	fmt.Println("Array Iteration:")
	for idx, val := range fruits {
		fmt.Printf("Index: %d, Value: %s\n", idx, val)
	}

	// Using range with a slice
	numbers := []int{10, 20, 30, 40, 50}
	fmt.Println("\nSlice Iteration:")
	for idx, val := range numbers {
		fmt.Printf("Index: %d, Value: %d\n", idx, val)
	}

	// Using range with a map
	personAge := map[string]int{"Alice": 25, "Bob": 30, "Charlie": 35}
	fmt.Println("\nMap Iteration:")
	for key, value := range personAge {
		fmt.Printf("Key: %s, Value: %d\n", key, value)
	}
}
