package main

func closureEx() func() int {
	// A closure is a function value that references variables from outside its body.
	// The function may access and assign to the referenced variables; in this sense the function is "closed over" its environment.
	// The function can be used to encapsulate state.
	// Closures are often used in functional programming languages.
	// In Go, closures are created by defining a function inside another function.

	counter := 0
	return func() int {
		counter++
		return counter
	}

}
