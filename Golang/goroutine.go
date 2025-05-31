package main

import (
	"fmt"
	"sync"
)

// prints is the function executed by each goroutine.
// It prints the given number and signals that it is done using WaitGroup.
func prints(num int, wg *sync.WaitGroup) {
	defer wg.Done() // Mark this goroutine as done
	fmt.Println("Number:", num)
}

// goroutine demonstrates the creation of multiple goroutines
// and waits for all of them to complete using sync.WaitGroup.
func goroutine() {
	fmt.Println("== Goroutine Example with sync.WaitGroup ==")

	var wg sync.WaitGroup

	for i := 0; i < 10; i++ {
		wg.Add(1)         // Register a new goroutine
		go prints(i, &wg) // Launch goroutine
	}

	wg.Wait() // Wait until all goroutines finish
	fmt.Println("All goroutines completed.")
}

// The goroutine function demonstrates how to use goroutines and sync.WaitGroup
// to run concurrent tasks in Go. Each goroutine prints a number from 0 to 9.
// The main function waits for all goroutines to finish before exiting.
// This is a simple example of concurrency in Go, showcasing how to manage multiple
// tasks running in parallel without blocking the main thread.
