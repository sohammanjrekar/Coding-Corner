package main

import (
	"fmt"
	"sync"
)

// post represents a struct with a view counter and a mutex for synchronization
type post struct {
	views int
	mu    sync.Mutex // Mutex protects access to the views field
}

// inc safely increments the views counter using a mutex
func (p *post) inc(wg *sync.WaitGroup) {
	defer wg.Done() // Mark this goroutine as done when it returns
	p.mu.Lock()     // Acquire the lock (entering critical section)
	p.views++       // Safe increment (only one goroutine at a time)
	p.mu.Unlock()   // Release the lock
}

// mutex demonstrates safe concurrent access to shared data using sync.Mutex
func mutex() {
	fmt.Println("== Mutex Example ==")

	var wg sync.WaitGroup    // WaitGroup to wait for all goroutines to finish
	mypost := post{views: 0} // Initialize post with 0 views

	// Launch 100 goroutines to increment the views counter
	for i := 0; i < 100; i++ {
		wg.Add(1)          // Tell WaitGroup we are adding one more goroutine
		go mypost.inc(&wg) // Launch the goroutine
	}

	wg.Wait()                                       // Wait for all goroutines to finish
	fmt.Println("Final views count:", mypost.views) // Safe to read now
}
