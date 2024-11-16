package main

import (
	"fmt"
)

// Basic function: A simple function with no parameters and no return value
func greet() {
	fmt.Println("Hello, World!") // Prints a greeting message
}

// Function with parameters and return value
// This function takes two integers as input and returns their sum
func add(a int, b int) int {
	return a + b // Returns the sum of a and b
}

// Function with multiple return values
// Divides two numbers and handles the case where the divisor is zero
func divide(a, b float64) (result float64, err string) {
	if b == 0 {
		err = "Division by zero is not allowed." // Error message for invalid operation
		return
	}
	result = a / b // Perform the division
	return
}

// Variadic function: Accepts a variable number of integer arguments
func sumNumbers(nums ...int) int {
	total := 0
	for _, num := range nums {
		total += num // Adds each number to the total
	}
	return total // Returns the sum of all numbers
}

// Function as a parameter
// Accepts two integers and a function that operates on them
func operate(a, b int, op func(int, int) int) int {
	return op(a, b) // Calls the provided function with a and b
}

// Closure example: A function that retains state
func counter() func() int {
	count := 0
	// Returns a function that increments and returns the count
	return func() int {
		count++
		return count
	}
}

// Default-like behavior using a variadic function
// If no greeting is provided, uses "Hello" as the default greeting
func greetWithDefault(name string, greeting ...string) {
	defaultGreeting := "Hello" // Default greeting
	if len(greeting) > 0 {
		defaultGreeting = greeting[0] // Use the provided greeting if available
	}
	fmt.Printf("%s, %s!\n", defaultGreeting, name) // Prints the greeting
}

// Demonstrating defer, panic, and recover
// Simulates a risky operation that might panic
func riskyOperation() {
	defer func() {
		if r := recover(); r != nil {
			// Recover from panic and print the error
			fmt.Println("Recovered from panic:", r)
		}
	}()
	// Simulate a panic
	panic("Something went wrong!")
}

func main() {
	// Call a basic function
	greet() // Output: Hello, World!

	// Call a function with parameters and return value
	sum := add(10, 20)       // Adds 10 and 20
	fmt.Println("Sum:", sum) // Output: Sum: 30

	// Call a function with multiple return values
	res, err := divide(10, 2) // Divides 10 by 2
	if err != "" {
		fmt.Println(err) // Handles division by zero error
	} else {
		fmt.Println("Division Result:", res) // Output: Division Result: 5
	}

	// Call a variadic function
	fmt.Println("Sum of numbers:", sumNumbers(1, 2, 3, 4, 5)) // Output: Sum of numbers: 15

	// Call a function with another function as a parameter
	multiply := func(a, b int) int { return a * b }                            // Define a multiplication function
	fmt.Println("Operation Result (Multiplication):", operate(3, 4, multiply)) // Output: 12

	// Use a closure to retain state
	nextCount := counter()               // Create a counter function
	fmt.Println("Counter:", nextCount()) // Output: Counter: 1
	fmt.Println("Counter:", nextCount()) // Output: Counter: 2
	fmt.Println("Counter:", nextCount()) // Output: Counter: 3

	// Use a variadic function for default-like behavior
	greetWithDefault("Alice")           // Output: Hello, Alice!
	greetWithDefault("Bob", "Hi there") // Output: Hi there, Bob!

	// Demonstrate defer, panic, and recover
	fmt.Println("Starting risky operation...")
	riskyOperation()                                // Recovers from panic
	fmt.Println("Program continues after recover.") // Program continues
}
