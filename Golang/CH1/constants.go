package main

import "fmt"

// constants demonstrates various ways to declare and use constants in Go
func constants() {
	// 1. Untyped constant
	const pi = 3.14
	// pi = 3.14159 // ❌ Error: Cannot assign to constant

	// 2. Typed constants
	const gravity float64 = 9.8
	const status string = "active"

	// 3. Grouped constants
	const (
		day   = "Monday"
		month = "January"
		year  = 2023
	)

	// 4. Constants in expressions
	const radius = 2.0
	const area = pi * radius * radius // constants can be used in compile-time expressions

	// 5. Enumerated constants using iota
	// iota starts at 0 and increments by 1 automatically
	const (
		Sunday    = iota // 0
		Monday           // 1
		Tuesday          // 2
		Wednesday        // 3
	)

	// 6. Skipping iota values using _
	const (
		_  = iota             // skip 0
		KB = 1 << (10 * iota) // 1 << 10 = 1024
		MB                    // 1 << 20
		GB                    // 1 << 30
	)

	// Output section
	fmt.Println("== Basic Constants ==")
	fmt.Println("Pi:", pi)
	fmt.Println("Gravity:", gravity)
	fmt.Println("Status:", status)
	fmt.Println("Day:", day, "Month:", month, "Year:", year)
	fmt.Println("Circle Area (r=2):", area)

	fmt.Println("\n== Enumerated Constants with iota ==")
	fmt.Println("Sunday =", Sunday)
	fmt.Println("Monday =", Monday)
	fmt.Println("Tuesday =", Tuesday)
	fmt.Println("Wednesday =", Wednesday)

	fmt.Println("\n== iota with Bit Shifts ==")
	fmt.Println("KB =", KB)
	fmt.Println("MB =", MB)
	fmt.Println("GB =", GB)
}
