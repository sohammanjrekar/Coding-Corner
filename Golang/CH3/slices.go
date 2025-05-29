func main() {
	// Create a slice with length 3 and capacity 5
	myslice := make([]int, 3, 5)
	myslice[0] = 10
	myslice[1] = 20
	myslice[2] = 30

	fmt.Println("Initial myslice:", myslice)
	fmt.Println("Length:", len(myslice), "Capacity:", cap(myslice))

	// Append within capacity
	myslice = append(myslice, 40, 50)
	fmt.Println("After appending 40, 50:", myslice)
	fmt.Println("Length:", len(myslice), "Capacity:", cap(myslice))

	// Append beyond capacity triggers growth
	myslice = append(myslice, 60)
	fmt.Println("After appending 60:", myslice)
	fmt.Println("Length:", len(myslice), "Capacity:", cap(myslice))

	// Change elements
	myslice[2] = 35
	fmt.Println("After changing element at index 2:", myslice)

	// Append one slice to another
	myslice2 := []int{70, 80}
	myslice3 := append(myslice, myslice2...)
	fmt.Println("After appending myslice2:", myslice3)

	// Slice an array and re-slice with capacity considerations
	arr := [6]int{1, 2, 3, 4, 5, 6}
	sub := arr[1:5]
	fmt.Println("Initial sub slice:", sub, "len:", len(sub), "cap:", cap(sub))

	sub = sub[0:3] // re-slicing, shrinking length
	fmt.Println("Re-sliced sub:", sub, "len:", len(sub), "cap:", cap(sub))

	sub = append(sub, 99) // can append since capacity allows
	fmt.Println("After append to sub:", sub, "len:", len(sub), "cap:", cap(sub))
}
