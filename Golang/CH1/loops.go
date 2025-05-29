package main

import "fmt"

func loops() {
	// For loop
	for j := 0; j < 5; j++ {
		fmt.Println("For loop iteration:", j)
	}

	// While loop (using for)
	i := 0
	for i < 5 {
		// break
		if i == 3 {
			fmt.Println("Breaking out of the loop at i =", i)
			break
		}
		// continue
		if i == 2 {
			fmt.Println("Skipping iteration at i =", i)
			i++ // ✅ Important: increment before continue to avoid infinite loop
			continue
		}
		fmt.Println("While loop iteration:", i)
		i++
	}

	// Do-while loop (using for)
	i = 0
	for {
		fmt.Println("Do-while loop iteration:", i)
		i++
		if i >= 5 {
			fmt.Println("Breaking out of the do-while loop at i =", i)
			break
		}
	}
}
