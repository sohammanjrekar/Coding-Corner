package main

import "fmt"

func ranges() {
	for i := range 5 {
		println("Range loop iteration:", i)
	}

	arr := [3]int{10, 20, 30}
	for s, v := range arr {
		fmt.Println("Array index:", s, "Value:", v)
	}
}
