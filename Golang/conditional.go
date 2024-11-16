package main

import (
	"fmt"
)

func main() {
	a := 14
	if a > 15 {
		fmt.Println("a is greater than 15")
	} else if a == 14 {
		fmt.Println("a is equal to 14")
	} else {
		fmt.Println("a is less than 15")
	}

	b := 'a'
	switch b {
	case 'a':
		fmt.Println("Letter a")
	case 'b':
		fmt.Println("Letter b")
	default:
		fmt.Println("Unknown letter")
	}

	day := 5

	switch day {
	case 1, 3, 5:
		fmt.Println("Odd weekday")
	case 2, 4:
		fmt.Println("Even weekday")
	case 6, 7:
		fmt.Println("Weekend")
	default:
		fmt.Println("Invalid day of day number")
	}
}
