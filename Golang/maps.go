package main

import "fmt"

func main() {
	// 1. Create and initialize a map
	mymap := map[int]string{
		1: "Apple",
		2: "Banana",
		3: "Cherry",
	}

	// 2. Accessing values
	value, ok := mymap[2] // Check if key exists
	if ok {
		fmt.Println("Key 2 exists with value:", value)
	} else {
		fmt.Println("Key 2 does not exist")
	}

	// Accessing a non-existent key
	value, ok = mymap[5]
	if ok {
		fmt.Println("Key 5 exists with value:", value)
	} else {
		fmt.Println("Key 5 does not exist")
	}

	// 3. Adding elements to a map
	a := make(map[string]string) // Empty map
	a["brand"] = "Ford"
	a["model"] = "Mustang"
	a["year"] = "1964"

	// Adding integer keys to another map
	b := make(map[string]int)
	b["Oslo"] = 1
	b["Bergen"] = 2
	b["Trondheim"] = 3

	// 4. Modifying values
	b["Oslo"] = 10 // Update the value for the key "Oslo"

	// 5. Deleting elements
	delete(b, "Bergen") // Removes the key "Bergen"

	// 6. Iterating over a map using `range`
	fmt.Println("Iterating over map `mymap`:")
	for key, value := range mymap {
		fmt.Printf("Key: %d, Value: %s\n", key, value)
	}

	// 7. Checking map length
	fmt.Println("Length of map `a`:", len(a))

	// 8. Nested maps
	nestedMap := map[string]map[string]string{
		"Car": {
			"Brand": "Tesla",
			"Model": "Model X",
		},
		"Phone": {
			"Brand": "Apple",
			"Model": "iPhone 14",
		},
	}

	// Accessing nested map
	fmt.Println("Nested map `Car`:", nestedMap["Car"])
	fmt.Println("Car brand:", nestedMap["Car"]["Brand"])

	// Printing all maps
	fmt.Println("Map `a`:", a)
	fmt.Println("Map `b`:", b)
	fmt.Println("Nested Map:", nestedMap)
}
