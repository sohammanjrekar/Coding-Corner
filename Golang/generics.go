package main

import "fmt"

// Generic function with any type
func Prints[T any](items []T) {
	for _, item := range items {
		fmt.Println(item)
	}
}

// Constrained generic function: only int, string, bool, float32
func printSlice[T int | string | bool | float32](items []T) {
	for _, item := range items {
		fmt.Println(item)
	}
}

// comparable types: int, string, bool, float32
func printSlice2[T comparable](items []T) {
	for _, item := range items {
		fmt.Println(item)
	}
}
func generics() {
	fmt.Println("== Generics Example ==")

	intSlice := []int{1, 2, 3}
	stringSlice := []string{"Go", "Generics"}
	boolSlice := []bool{true, false}
	floatSlice := []float32{1.1, 2.2, 3.3}

	fmt.Println("-- Prints (any type) --")
	Prints(intSlice)
	Prints(stringSlice)

	fmt.Println("-- printSlice (specific types) --")
	printSlice(intSlice)
	printSlice(stringSlice)
	printSlice(boolSlice)
	printSlice(floatSlice)

	fmt.Println("-- printSlice2 (comparable types) --")
	printSlice2(intSlice)
	printSlice2(stringSlice)

	printSlice2(boolSlice)
	printSlice2(floatSlice)
}
