package main

import (
	"fmt"
	"time"
)

// conditionals demonstrates all conditional logic in Go:
// if-else, switch (value-based and time-based), and type switches
func conditionals() {
	// 1. Simple if-else statement
	num := 5
	fmt.Println("== Basic if-else ==")
	if num < 5 {
		fmt.Println("num is less than 5")
	} else if num > 5 {
		fmt.Println("num is greater than 5")
	} else {
		fmt.Println("num is equal to 5")
	}

	// 2. Switch based on value
	fmt.Println("\n== Value-based switch ==")
	switch num {
	case 1:
		fmt.Println("num is 1")
	case 2:
		fmt.Println("num is 2")
	case 5:
		fmt.Println("num is 5")
	default:
		fmt.Println("num is something else")
	}

	// 3. Switch based on current weekday
	fmt.Println("\n== Time-based switch ==")
	switch time.Now().Weekday() {
	case time.Saturday, time.Sunday:
		fmt.Println("It's the weekend!")
	default:
		fmt.Println("It's a weekday")
	}

	// 4. Type switch (interface{} type inspection)
	fmt.Println("\n== Type switch ==")
	typing := func(i interface{}) {
		switch n := i.(type) {
		case int:
			fmt.Println("n is an int:", n)
		case string:
			fmt.Println("n is a string:", n)
		case bool:
			fmt.Println("n is a bool:", n)
		default:
			fmt.Println("n is of a different type:", n)
		}
	}
	typing(42)
	typing("hello")
	typing(true)

	// 5. Nested if-else with different variable
	fmt.Println("\n== Another if-else example ==")
	a := 14
	if a > 15 {
		fmt.Println("a is greater than 15")
	} else if a == 14 {
		fmt.Println("a is equal to 14")
	} else {
		fmt.Println("a is less than 15")
	}

	// 6. Switch with character (rune)
	fmt.Println("\n== Switch with rune ==")
	b := 'a'
	switch b {
	case 'a':
		fmt.Println("Letter a")
	case 'b':
		fmt.Println("Letter b")
	default:
		fmt.Println("Unknown letter")
	}

	// 7. Switch with multiple matching cases
	fmt.Println("\n== Switch with multiple matching cases ==")
	day := 5
	switch day {
	case 1, 3, 5:
		fmt.Println("Odd weekday")
	case 2, 4:
		fmt.Println("Even weekday")
	case 6, 7:
		fmt.Println("Weekend")
	default:
		fmt.Println("Invalid day number")
	}
}
