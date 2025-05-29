package main

import "fmt"

func main() {
	// variadicFuncEx()
	closure := closureEx()
	fmt.Println(closure())
	fmt.Println(closure())
	fmt.Println(closure())
}
