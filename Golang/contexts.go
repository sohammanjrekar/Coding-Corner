package main

import (
	"context"
	"fmt"
	"time"
)

// contexts demonstrates how to use context for:
// - Passing values
// - Cancelling operations
// - Handling deadlines
func contexts() {
	fmt.Println("== Contexts in Go ==")

	// Base context: the root context that should be used when no other context is available
	ctx := context.Background()

	// 1. Add a value to the context
	ctx = context.WithValue(ctx, "key", "value")

	// Retrieve the value
	if val := ctx.Value("key"); val != nil {
		fmt.Println("Context Value for 'key':", val.(string))
	} else {
		fmt.Println("No value found for key")
	}

	// 2. Create a cancellable context derived from the original
	ctx, cancel := context.WithCancel(ctx)
	defer cancel() // Always cancel to release resources

	// Simulate a long-running operation in a goroutine
	go func(ctx context.Context) {
		fmt.Println("Worker started...")
		select {
		case <-ctx.Done(): // Listen for cancellation
			fmt.Println("Worker received cancellation signal.")
			return
		case <-time.After(5 * time.Second): // Simulate work
			fmt.Println("Worker finished work.")
		}
	}(ctx)

	// Simulate some delay before deciding to cancel
	time.Sleep(2 * time.Second)
	fmt.Println("Main: Cancelling context...")
	cancel()

	// Wait for the goroutine to respond
	time.Sleep(1 * time.Second)
	fmt.Println("Main: Context cancelled.")
}
