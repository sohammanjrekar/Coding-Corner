package main

import "time"

func conditionals() {

	num := 5
	if num < 5 {
		println("num is less than 5")

	} else if num > 5 {
		println("num is greater than 5")
	} else {
		println("num is equal to 5")
	}

	// Switch statement
	switch num {
	case 1:
		println("num is 1")
	case 2:
		println("num is 2")
	case 5:
		println("num is 5")
	default:
		println("num is something else")
	}

	switch time.Now().Weekday() {
	case time.Saturday, time.Sunday:
		println("It's the weekend!")
	default:
		println("It's a weekday")
	}

	// type switch
	typing := func(i interface{}) {
		switch n := i.(type) {
		case int:
			println("n is an int:", n)
		case string:
			println("n is a string:", n)
		case bool:
			println("n is a bool:", n)
		default:
			println("n is of a different type:", n)
		}
	}
	typing(42)
	typing("hello")
}
