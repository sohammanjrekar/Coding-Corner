package main

import "fmt"

// -------------------------------------------
// 1. Basic Direct Recursion: Factorial
// -------------------------------------------
// A function calling itself directly.
func factorial(n int) int {
	if n == 0 {
		return 1 // base case
	}
	return n * factorial(n-1) // recursive case
}

// -------------------------------------------
// 2. Fibonacci Series using Recursion
// -------------------------------------------
// Shows overlapping subproblems (not efficient).
func fibonacci(n int) int {
	if n <= 1 {
		return n
	}
	return fibonacci(n-1) + fibonacci(n-2)
}

// -------------------------------------------
// 3. Tail Recursion: More efficient style
// -------------------------------------------
// Tail call can be optimized by compilers (though Go does not optimize it).
func tailFactorial(n, acc int) int {
	if n == 0 {
		return acc
	}
	return tailFactorial(n-1, n*acc) // accumulator keeps intermediate result
}

// Wrapper for tail recursion
func tailFactorialWrapper(n int) int {
	return tailFactorial(n, 1)
}

// -------------------------------------------
// 4. Indirect Recursion: Function A calls B, and B calls A
// -------------------------------------------
func even(n int) bool {
	if n == 0 {
		return true
	}
	return odd(n - 1)
}

func odd(n int) bool {
	if n == 0 {
		return false
	}
	return even(n - 1)
}

// -------------------------------------------
// 5. Recursion with side effect (e.g., printing numbers)
// -------------------------------------------
func printCountdown(n int) {
	if n == 0 {
		fmt.Println("Lift off!")
		return
	}
	fmt.Println(n)
	printCountdown(n - 1)
}

// -------------------------------------------
// 6. Recursion vs Iteration: Sum of N natural numbers
// -------------------------------------------

// Using recursion
func recursiveSum(n int) int {
	if n == 0 {
		return 0
	}
	return n + recursiveSum(n-1)
}

// Using loop
func iterativeSum(n int) int {
	sum := 0
	for i := 1; i <= n; i++ {
		sum += i
	}
	return sum
}

// -------------------------------------------
// 7. Infinite Recursion (Incorrect case)
// -------------------------------------------
func infiniteRecursion() {
	// Uncommenting this will crash with stack overflow
	// fmt.Println("Recursing infinitely...")
	// infiniteRecursion()
}

// -------------------------------------------
// main function to test all the above
// -------------------------------------------
func recrsionex() {
	// 1. Factorial
	fmt.Println("Factorial of 5 (recursion):", factorial(5)) // 120

	// 2. Fibonacci
	fmt.Println("Fibonacci(6):", fibonacci(6)) // 8

	// 3. Tail Recursion
	fmt.Println("Tail Factorial of 5:", tailFactorialWrapper(5)) // 120

	// 4. Indirect Recursion
	fmt.Println("Is 4 even?", even(4)) // true
	fmt.Println("Is 3 even?", even(3)) // false

	// 5. Printing countdown
	fmt.Println("Countdown from 3:")
	printCountdown(3)

	// 6. Recursion vs Iteration
	fmt.Println("Sum of first 10 numbers (recursive):", recursiveSum(10)) // 55
	fmt.Println("Sum of first 10 numbers (iterative):", iterativeSum(10)) // 55
}
