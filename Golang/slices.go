package main

import (
	"fmt"
)

func main() {
	// Create a slice with an initial capacity
	myslice := make([]int, 3, 5) // Length = 3, Capacity = 5
	myslice[0] = 10
	myslice[1] = 20
	myslice[2] = 30

	fmt.Println("Initial Slice:")
	fmt.Println("myslice:", myslice)
	fmt.Println("Length (len):", len(myslice))   // 3
	fmt.Println("Capacity (cap):", cap(myslice)) // 5

	// Append elements to the slice
	myslice = append(myslice, 40, 50)
	fmt.Println("\nAfter appending two elements:")
	fmt.Println("myslice:", myslice)
	fmt.Println("Length (len):", len(myslice))   // 5
	fmt.Println("Capacity (cap):", cap(myslice)) // 5

	// Append another element, exceeding the capacity
	myslice = append(myslice, 60)
	fmt.Println("\nAfter appending one more element:")
	fmt.Println("myslice:", myslice)
	fmt.Println("Length (len):", len(myslice))   // 6
	fmt.Println("Capacity (cap):", cap(myslice)) // Capacity increases (usually doubles)
	// Access elements of a slice
	fmt.Println("Access Elements of a Slice:")
	prices := []int{10, 20, 30}
	fmt.Println("First element:", prices[0])
	fmt.Println("Third element:", prices[2])

	// Change elements of a slice
	fmt.Println("\nChange Elements of a Slice:")
	prices[2] = 50
	fmt.Println("Updated Slice:", prices)

	// Append elements to a slice
	fmt.Println("\nAppend Elements to a Slice:")
	myslice1 := []int{1, 2, 3, 4, 5, 6}
	fmt.Printf("myslice1 = %v\n", myslice1)
	fmt.Printf("length = %d, capacity = %d\n", len(myslice1), cap(myslice1))

	myslice1 = append(myslice1, 20, 21)
	fmt.Printf("After append, myslice1 = %v\n", myslice1)
	fmt.Printf("length = %d, capacity = %d\n", len(myslice1), cap(myslice1))

	// Append one slice to another slice
	fmt.Println("\nAppend One Slice to Another Slice:")
	myslice2 := []int{4, 5, 6}
	myslice3 := append(myslice1, myslice2...)
	fmt.Printf("myslice3 = %v\n", myslice3)
	fmt.Printf("length = %d, capacity = %d\n", len(myslice3), cap(myslice3))

	// Change length of a slice
	fmt.Println("\nChange Length of a Slice:")
	arr1 := [6]int{9, 10, 11, 12, 13, 14}
	myslice4 := arr1[1:5]
	fmt.Printf("Initial myslice4 = %v, length = %d, capacity = %d\n", myslice4, len(myslice4), cap(myslice4))

	myslice4 = arr1[1:3]
	fmt.Printf("After re-slicing, myslice4 = %v, length = %d, capacity = %d\n", myslice4, len(myslice4), cap(myslice4))

	myslice4 = append(myslice4, 20, 21, 22, 23)
	fmt.Printf("After appending, myslice4 = %v, length = %d, capacity = %d\n", myslice4, len(myslice4), cap(myslice4))

	// Copy a slice to reduce memory usage
	fmt.Println("\nCopy Slice to Reduce Memory:")
	numbers := []int{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}
	fmt.Printf("Original slice: numbers = %v, length = %d, capacity = %d\n", numbers, len(numbers), cap(numbers))

	neededNumbers := numbers[:len(numbers)-10]
	numbersCopy := make([]int, len(neededNumbers))
	copy(numbersCopy, neededNumbers)

	fmt.Printf("Copied slice: numbersCopy = %v, length = %d, capacity = %d\n", numbersCopy, len(numbersCopy), cap(numbersCopy))

}
