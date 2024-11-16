package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	// Handling command-line arguments using os.Args
	args := os.Args
	if len(args) > 1 {
		fmt.Printf("Command-line argument received: %s\n", args[1])
	} else {
		fmt.Println("No command-line argument provided.")
	}

	// Using fmt.Scan() to read space-separated values
	var name string
	var age int
	fmt.Print("Enter your name and age (separated by space): ")
	_, err := fmt.Scan(&name, &age)
	if err != nil {
		fmt.Println("Error reading input:", err)
	} else {
		fmt.Printf("Hello, %s! You are %d years old (using fmt.Scan).\n", name, age)
	}

	// Using fmt.Scanln() to read input with a newline
	fmt.Print("Enter your name and age (separated by space, using fmt.Scanln): ")
	_, err = fmt.Scanln(&name, &age)
	if err != nil {
		fmt.Println("Error reading input:", err)
	} else {
		fmt.Printf("Hello, %s! You are %d years old (using fmt.Scanln).\n", name, age)
	}

	// Using fmt.Scanf() for formatted input
	fmt.Print("Enter your name and age (using fmt.Scanf): ")
	_, err = fmt.Scanf("%s %d", &name, &age)
	if err != nil {
		fmt.Println("Error reading input:", err)
	} else {
		fmt.Printf("Hello, %s! You are %d years old (using fmt.Scanf).\n", name, age)
	}

	// Using bufio.Scanner to read a full line of input
	fmt.Print("Enter a line of text (using bufio.Scanner): ")
	scanner := bufio.NewScanner(os.Stdin)
	scanner.Scan() // Read the next line of input
	line := scanner.Text()
	if err := scanner.Err(); err != nil {
		fmt.Println("Error reading line:", err)
	} else {
		fmt.Printf("You entered: %s (using bufio.Scanner).\n", line)
	}

	// Error handling with fmt.Scan()
	fmt.Print("Enter a number: ")
	var num int
	_, err = fmt.Scan(&num)
	if err != nil {
		fmt.Println("Invalid number input, please try again.")
	} else {
		fmt.Printf("You entered the number: %d\n", num)
	}

	// Demonstrating file-based input (optional)
	// Uncomment the following section to read from a file (ensure 'input.txt' exists)
	file, err := os.Open("input.txt")
	if err != nil {
		fmt.Println("Error opening file:", err)
		return
	}
	defer file.Close()
	var fileName string
	var fileAge int
	_, err = fmt.Fscanf(file, "%s %d", &fileName, &fileAge)
	if err != nil {
		fmt.Println("Error reading from file:", err)
	} else {
		fmt.Printf("File input - Name: %s, Age: %d\n", fileName, fileAge)
	}
}
