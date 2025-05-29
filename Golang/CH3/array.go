package main

import "fmt"

func array() {

	arr := [6]int{1, 2, 3, 4, 5}
	for _, v := range arr {
		fmt.Println(v)
	}
	fmt.Println("length :", len(arr))
	fmt.Println(arr)
}
