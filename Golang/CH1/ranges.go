package main

import "fmt"

// ranges demonstrates how to use 'range' with slices, arrays, maps, and strings in Go.
func ranges() {
	// 1. Using range with a custom loop counter (incorrect way)
	// for i := range 5 {} ❌ — This is invalid in Go (range must be over iterable types like array, slice, string, map, or channel)
	// Use this instead:
	fmt.Println("== Range with artificial loop using slice ==")
	for i := range make([]int, 5) {
		fmt.Println("Range loop iteration:", i)
	}

	// 2. Range with an array
	fmt.Println("\n== Range over Array ==")
	arr := [3]int{10, 20, 30}
	for index, value := range arr {
		fmt.Printf("Array index: %d, Value: %d\n", index, value)
	}

	// 3. Range with a slice (same as array)
	fmt.Println("\n== Range over Slice ==")
	slice := []string{"Go", "is", "fun"}
	for idx, val := range slice {
		fmt.Printf("Slice index: %d, Value: %s\n", idx, val)
	}

	// 4. Range with a map (order is not guaranteed)
	fmt.Println("\n== Range over Map ==")
	m := map[string]int{"one": 1, "two": 2, "three": 3}
	for key, value := range m {
		fmt.Printf("Map key: %s, Value: %d\n", key, value)
	}

	// 5. Range with a string (iterates over runes, not bytes)
	fmt.Println("\n== Range over String (runes) ==")
	str := "hello"
	for i, c := range str {
		fmt.Printf("String index: %d, Character: %c\n", i, c)
	}

	// 6. Range over string with Unicode characters
	fmt.Println("\n== Range over Unicode String ==")
	unicodeStr := "gophér 🐹"
	for i, r := range unicodeStr {
		fmt.Printf("Index: %d, Rune: %c, Unicode: %U\n", i, r, r)
	}
}
