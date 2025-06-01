package main

import (
	"fmt"
	"sync"
)

// prints receives a number and prints it, then signals completion
func prints(num int, wg *sync.WaitGroup) {
	defer wg.Done()
	fmt.Println("Processed:", num)
}

// channels demonstrates using unbuffered channels, goroutines, and select
func channels() {
	fmt.Println("== Channels and Select Example ==")

	ch := make(chan int)
	chan1 := make(chan int)
	chan2 := make(chan string)
	var wg sync.WaitGroup

	// Producer: send numbers to 'ch'
	go func() {
		for i := 0; i < 5; i++ {
			ch <- i
		}
		close(ch)
	}()

	// Consumer: reads from 'ch' and processes concurrently
	for num := range ch {
		wg.Add(1)
		go prints(num, &wg)
	}

	// Send data to chan1 and chan2 concurrently
	go func() {
		chan1 <- 10
	}()

	go func() {
		chan2 <- "pong"
	}()

	// Use select to receive from either chan1 or chan2
	for i := 0; i < 2; i++ {
		select {
		case val1 := <-chan1:
			fmt.Println("Received from chan1:", val1)
		case val2 := <-chan2:
			fmt.Println("Received from chan2:", val2)
		}
	}

	wg.Wait()
	fmt.Println("All goroutines finished processing.")
}
