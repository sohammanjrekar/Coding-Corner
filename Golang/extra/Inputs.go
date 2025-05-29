package main

import (
	"bufio"
	"fmt"
	"os"
)

func inputExamples() {
	// -----------------------------------------
	// 1. Command-line Arguments
	// -----------------------------------------
	args := os.Args
	if len(args) > 1 {
		fmt.Printf("Command-line argument received: %s\n", args[1])
	} else {
		fmt.Println("No command-line argument provided.")
	}

	// -----------------------------------------
	// 2. Using fmt.Scan to Read Space-Separated Input
	// -----------------------------------------
	var name string
	var age int
	fmt.Print("Enter your name and age (using fmt.Scan): ")
	_, err := fmt.Scan(&name, &age)
	if err != nil {
		fmt.Println("Error reading input using fmt.Scan:", err)
	} else {
		fmt.Printf("Hello, %s! You are %d years old (fmt.Scan).\n", name, age)
	}

	// -----------------------------------------
	// 3. Using fmt.Scanln to Read Input Until Newline
	// -----------------------------------------
	fmt.Print("Enter your name and age (using fmt.Scanln): ")
	_, err = fmt.Scanln(&name, &age)
	if err != nil {
		fmt.Println("Error reading input using fmt.Scanln:", err)
	} else {
		fmt.Printf("Hello, %s! You are %d years old (fmt.Scanln).\n", name, age)
	}

	// -----------------------------------------
	// 4. Using fmt.Scanf for Formatted Input
	// -----------------------------------------
	fmt.Print("Enter your name and age (using fmt.Scanf): ")
	_, err = fmt.Scanf("%s %d", &name, &age)
	if err != nil {
		fmt.Println("Error reading input using fmt.Scanf:", err)
	} else {
		fmt.Printf("Hello, %s! You are %d years old (fmt.Scanf).\n", name, age)
	}

	// -----------------------------------------
	// 5. Using bufio.Scanner for Full Line Input
	// -----------------------------------------
	fmt.Print("Enter a line of text (using bufio.Scanner): ")
	scanner := bufio.NewScanner(os.Stdin)
	if scanner.Scan() {
		line := scanner.Text()
		fmt.Printf("You entered: %s (bufio.Scanner).\n", line)
	}
	if err := scanner.Err(); err != nil {
		fmt.Println("Error reading line using bufio.Scanner:", err)
	}

	// -----------------------------------------
	// 6. Input with Error Handling Example
	// -----------------------------------------
	fmt.Print("Enter a number: ")
	var num int
	_, err = fmt.Scan(&num)
	if err != nil {
		fmt.Println("Invalid number input, please try again.")
	} else {
		fmt.Printf("You entered the number: %d\n", num)
	}

	// -----------------------------------------
	// 7. File-Based Input (Optional)
	// -----------------------------------------
	file, err := os.Open("input.txt") // Ensure this file exists with content like "Ravi 22"
	if err != nil {
		fmt.Println("Error opening file: input.txt:", err)
	} else {
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
}
