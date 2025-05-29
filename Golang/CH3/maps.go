package main

import (
	"fmt"
	"maps"
)

// Demonstrates all major operations and concepts related to maps in Go
func mapsExample() {
	// ---------------------------------------------
	// 1. Creating a Map
	// ---------------------------------------------
	m := make(map[string]int)
	m["one"] = 1

	// Accessing values
	fmt.Println("Value of 'one':", m["one"])              // 1
	fmt.Println("Value of non-existing 'two':", m["two"]) // 0 (default int)

	// Deleting a key
	delete(m, "one")
	fmt.Println("After deletion, 'one':", m["one"]) // 0

	// Clearing a map
	clear(m)
	fmt.Println("Length after clearing:", len(m)) // 0

	// ---------------------------------------------
	// 2. Initializing a Map with Values
	// ---------------------------------------------
	m2 := map[string]int{"one": 1}
	m2["two"] = 2
	m2["three"] = 3

	// Iterating over a map
	fmt.Println("Iterating over m2:")
	for key, value := range m2 {
		fmt.Println("Key:", key, "Value:", value)
	}

	// Checking if a key exists
	if val, exists := m2["two"]; exists {
		fmt.Println("Key 'two' exists with value:", val)
	} else {
		fmt.Println("Key 'two' does not exist.")
	}

	// Key that does not exist
	if val, exists := m2["twol"]; exists {
		fmt.Println("Key 'twol' exists with value:", val)
	} else {
		fmt.Println("Key 'twol' does not exist.")
	}

	// ---------------------------------------------
	// 3. Maps Equality (requires Go 1.21+)
	// ---------------------------------------------
	empty := map[string]int{}
	fmt.Println("Maps equal (m vs m2)?", maps.Equal(m, m2))       // false
	fmt.Println("Maps equal (m vs empty)?", maps.Equal(m, empty)) // true

	// ---------------------------------------------
	// 4. Another Example with int keys
	// ---------------------------------------------
	mymap := map[int]string{
		1: "Apple",
		2: "Banana",
		3: "Cherry",
	}

	// Access and check existence
	if val, ok := mymap[2]; ok {
		fmt.Println("Key 2 exists with value:", val)
	}

	if val, ok := mymap[5]; !ok {
		fmt.Println("Key 5 does not exist")
	}

	// ---------------------------------------------
	// 5. Adding/Updating Values
	// ---------------------------------------------
	car := map[string]string{}
	car["brand"] = "Ford"
	car["model"] = "Mustang"
	car["year"] = "1964"

	cities := map[string]int{
		"Oslo":      1,
		"Bergen":    2,
		"Trondheim": 3,
	}
	cities["Oslo"] = 10 // update value
	delete(cities, "Bergen")

	// ---------------------------------------------
	// 6. Nested Maps
	// ---------------------------------------------
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

	// Accessing nested values
	fmt.Println("Nested 'Car' Map:", nestedMap["Car"])
	fmt.Println("Car Brand:", nestedMap["Car"]["Brand"])

	// ---------------------------------------------
	// 7. Printing Final Maps
	// ---------------------------------------------
	fmt.Println("Map `car`:", car)
	fmt.Println("Map `cities`:", cities)
	fmt.Println("Nested Map:", nestedMap)
}
