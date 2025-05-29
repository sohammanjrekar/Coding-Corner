package main

import (
	"fmt"
)

func functions() {
	// ---------------------------------------------
	// Basic Function Call
	// ---------------------------------------------
	greet()

	// ---------------------------------------------
	// Function with Parameters and Return Value
	// ---------------------------------------------
	sum := add(10, 20)
	fmt.Println("Sum:", sum)

	// ---------------------------------------------
	// Function with Multiple Return Values
	// ---------------------------------------------
	res, err := divide(10, 2)
	if err != "" {
		fmt.Println("Error:", err)
	} else {
		fmt.Println("Division Result:", res)
	}

	// ---------------------------------------------
	// Variadic Function Call
	// ---------------------------------------------
	fmt.Println("Sum of numbers:", sumNumbers(1, 2, 3, 4, 5))

	// ---------------------------------------------
	// Function as Parameter
	// ---------------------------------------------
	multiply := func(a, b int) int { return a * b }
	fmt.Println("Operation Result (Multiplication):", operate(3, 4, multiply))

	// ---------------------------------------------
	// Closure Example
	// ---------------------------------------------
	nextCount := counter()
	fmt.Println("Counter:", nextCount())
	fmt.Println("Counter:", nextCount())
	fmt.Println("Counter:", nextCount())

	// ---------------------------------------------
	// Variadic Function for Default-like Behavior
	// ---------------------------------------------
	greetWithDefault("Alice")
	greetWithDefault("Bob", "Hi there")

	// ---------------------------------------------
	// Defer, Panic, Recover
	// ---------------------------------------------
	fmt.Println("Starting risky operation...")
	riskyOperation()
	fmt.Println("Program continues after recover.")
}

// ---------------------------------------------
// Function Definitions Below
// ---------------------------------------------

// Basic Function
func greet() {
	fmt.Println("Hello, World!")
}

// Function with Parameters and Return
func add(a int, b int) int {
	return a + b
}

// Function with Multiple Return Values
func divide(a, b float64) (float64, string) {
	if b == 0 {
		return 0, "Division by zero is not allowed."
	}
	return a / b, ""
}

// Variadic Function
func sumNumbers(nums ...int) int {
	total := 0
	for _, num := range nums {
		total += num
	}
	return total
}

// Function as Parameter
func operate(a, b int, op func(int, int) int) int {
	return op(a, b)
}

// Closure Example
func counter() func() int {
	count := 0
	return func() int {
		count++
		return count
	}
}

// Default-like Behavior using Variadic
func greetWithDefault(name string, greeting ...string) {
	defaultGreeting := "Hello"
	if len(greeting) > 0 {
		defaultGreeting = greeting[0]
	}
	fmt.Printf("%s, %s!\n", defaultGreeting, name)
}

// Defer, Panic, Recover
func riskyOperation() {
	defer func() {
		if r := recover(); r != nil {
			fmt.Println("Recovered from panic:", r)
		}
	}()
	panic("Something went wrong!")
}
