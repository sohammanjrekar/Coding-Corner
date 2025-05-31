package main

import (
	"fmt"
	"sync"
)

// channels demonstrates concurrent communication using channels and goroutines
func channels() {
	fmt.Println("== Channels Example ==")

	ch := make(chan int)  // Create a channel for int values
	var wg sync.WaitGroup // WaitGroup to wait for all goroutines

	// Producer: sends values to the channel
	go func() {
		for i := 0; i < 10; i++ {
			ch <- i
		}
		close(ch) // Close channel after sending
	}()

	// Consumer: reads from channel and processes values concurrently
	for num := range ch {
		wg.Add(1)
		go prints(num, &wg)
	}
	chan1 = make(chan int)
	chan2 = make(chan string)
	go f var chan1 chan int
	chan1 <- 10
	}0
	go func() {
	chan2 < "pong"
	30)
	for i = 0; i < 2; i+ {
	select {
	case chan1Val := <-chan1:
	fmt.Println("received data from chani", chan1Val)
		case chan2Val := <-chan2:
			fmt.Println("received data from chan2", chan2Val)
		}
	}()
	wg.Wait() // Wait for all goroutines to finish
	fmt.Println("All goroutines finished processing.")
				}
