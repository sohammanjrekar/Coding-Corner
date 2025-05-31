package main

import "fmt"

// closureExamples demonstrates various ways to use closures in Go.
func closureExamples() {
	fmt.Println("== Basic Closure ==")

	// A closure that captures and modifies outer variable `counter`
	counter := 0
	increment := func() int {
		counter++
		return counter
	}
	fmt.Println("First call:", increment())  // 1
	fmt.Println("Second call:", increment()) // 2

	fmt.Println("\n== Independent Closures ==")

	// Each closure has its own state
	newCounter := func() func() int {
		count := 0
		return func() int {
			count++
			return count
		}
	}

	counterA := newCounter()
	counterB := newCounter()

	fmt.Println("counterA:", counterA()) // 1
	fmt.Println("counterA:", counterA()) // 2
	fmt.Println("counterB:", counterB()) // 1

	fmt.Println("\n== Closure with Parameters ==")

	// A closure that multiplies by a fixed number
	multiplier := func(factor int) func(int) int {
		return func(n int) int {
			return factor * n
		}
	}

	double := multiplier(2)
	triple := multiplier(3)

	fmt.Println("Double 4:", double(4)) // 8
	fmt.Println("Triple 4:", triple(4)) // 12

	fmt.Println("\n== Closures in a Loop (Common Mistake) ==")

	// Be careful when using closures in loops (loop variable capture)
	funcs := []func(){}
	for i := 0; i < 3; i++ {
		val := i // capture loop value correctly
		funcs = append(funcs, func() {
			fmt.Println("Captured:", val)
		})
	}

	for _, f := range funcs {
		f()
	}

	fmt.Println("\n== Closure for Stateful Logic (Use Case) ==")

	// A function that returns a running total calculator (like a bank balance tracker)
	balanceTracker := func() func(int) int {
		balance := 0
		return func(amount int) int {
			balance += amount
			return balance
		}
	}

	account := balanceTracker()
	fmt.Println("Deposit 100:", account(100)) // 100
	fmt.Println("Withdraw 30:", account(-30)) // 70
	fmt.Println("Deposit 50:", account(50))   // 120
}
