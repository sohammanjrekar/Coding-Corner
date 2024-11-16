package main

import "fmt"

func main() {
	// Example of Print()
	// Print() prints values without a newline and without adding spaces between them
	var i, j string = "Hello", "World"
	fmt.Print(i) // Outputs: Hello
	fmt.Print(j) // Outputs: World
	// Output: HelloWorld (no spaces or newlines)

	// Example of Print() with newline
	// We manually add "\n" to print each argument on a new line
	fmt.Print(i, "\n") // Outputs: Hello
	fmt.Print(j, "\n") // Outputs: World
	// Output:
	// Hello
	// World

	// Example of Print() with space between arguments
	// Print() will automatically insert a space if the arguments are not strings.
	fmt.Print(i, " ", j) // Outputs: Hello World
	// Output: Hello World

	// Example of Println()
	// Println() automatically adds a space between arguments and ends with a newline.
	fmt.Println(i, j) // Outputs: Hello World (with a space between them and a newline at the end)
	// Output:
	// Hello World

	// Example of Printf()
	// Printf() allows you to format the output using format verbs.
	// The format verb %v prints the value, and %T prints the type of the variable.
	fmt.Printf("i has value: %v and type: %T\n", i, i)
	// Output: i has value: Hello and type: string

	fmt.Printf("j has value: %v and type: %T", j, j)
	// Output: j has value: World and type: string
}
