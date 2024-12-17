package main

import "fmt"

var myvar1 int = 10 // way 1
var myvar2 = 10     // way 2
func main() {
	myvar3 := 10 // way 3
	println(myvar1, myvar2, myvar3)

	const raghav = 4844
	println(raghav)

	//data types
	// int float complex string bool byte rune
	var a int = 42
	var b float64 = 7.8
	var c complex64 = 2 + 3i
	var d string = "Hello, World!"
	var e bool = true
	var f byte = 'A'
	var g rune = 'α'

	println(a, b, c, d, e, f, g)

	// input
	var name string
	fmt.Print("Enter your name: ")
	fmt.Scanln(&name)
	fmt.Printf("Hello, %s!\n", name)
}
