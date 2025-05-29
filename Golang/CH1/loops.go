package main

import "fmt"

// loops demonstrates all loop types in Go
func loops() {
	// 1. Standard for loop
	fmt.Println("Standard For Loop:")
	for j := 0; j < 5; j++ {
		fmt.Println("Iteration:", j)
	}

	// 2. While-style loop using 'for'
	fmt.Println("\nWhile-style Loop with break and continue:")
	i := 0
	for i < 5 {
		if i == 3 {
			fmt.Println("Breaking out of the loop at i =", i)
			break
		}
		if i == 2 {
			fmt.Println("Skipping iteration at i =", i)
			i++ // Important: increment before continue to avoid infinite loop
			continue
		}
		fmt.Println("Iteration:", i)
		i++
	}

	// 3. Do-while-style loop using 'for true'
	fmt.Println("\nDo-While-style Loop:")
	i = 0
	for {
		fmt.Println("Iteration:", i)
		i++
		if i >= 5 {
			fmt.Println("Breaking out of the do-while-style loop at i =", i)
			break
		}
	}

	// 4. Basic for loop to print 1 to 5 with continue
	fmt.Println("\nCounting Loop (1 to 5) with continue:")
	for i := 1; i <= 5; i++ {
		fmt.Println(i)
		if i == 3 {
			continue // continue demonstration
		}
	}

	// 5. Nested for loop
	fmt.Println("\nNested For Loop:")
	for i := 1; i <= 3; i++ {
		for j := 1; j <= 2; j++ {
			fmt.Printf("Outer Loop %d, Inner Loop %d\n", i, j)
		}
	}

}
