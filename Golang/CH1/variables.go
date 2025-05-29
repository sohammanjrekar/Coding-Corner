package main

import "fmt"

func variables() {

	var name string = "John"
	// var name = "John" // This is also valid
	// name := "John" // This is also valid, but only inside a function
	// name = "Doe" // You can change the value of a variable
	// name = 123 // This will cause an error because the type is not string
	// name = "123" // This is valid because "123" is a string


	// var name string
	// name = "John" // This is valid, but you need to declare the variable first
	fmt.Println("Hello, " + name + "!")

}