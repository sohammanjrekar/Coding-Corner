package main

import "fmt"

func count(i int) int {
	if i == 4 {
		return 0
	}
	return count(i + 1)
}

func main() {
	fmt.Println(count(1))
}
