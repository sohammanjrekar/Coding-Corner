package main

import (
	"encoding/json"
	"fmt"
)

// Person defines a custom struct with JSON tags.
// The tags help control how the struct fields map to/from JSON.
type Person struct {
	Name    string `json:"name"`     // JSON key: "name"
	Age     int    `json:"age"`      // JSON key: "age"
	IsAdult bool   `json:"is_adult"` // JSON key: "is_adult"
}

func jsons() {
	// Step 1: Define a Person struct
	p := Person{
		Name:    "Alice",
		Age:     30,
		IsAdult: true,
	}
	fmt.Println("📦 Original Person struct:", p)

	// Step 2: Marshal (encode) the struct into JSON
	jsonData, err := json.Marshal(p)
	if err != nil {
		fmt.Println("❌ Error marshalling JSON:", err)
		return
	}
	fmt.Println("✅ JSON (compact):", string(jsonData))

	// Step 3: Marshal with indentation for readability
	jsonPretty, err := json.MarshalIndent(p, "", "  ")
	if err != nil {
		fmt.Println("❌ Error marshalling (indented):", err)
		return
	}
	fmt.Println("📝 JSON (pretty format):\n", string(jsonPretty))

	// Step 4: Unmarshal (decode) JSON back into a struct
	var p2 Person
	err = json.Unmarshal(jsonData, &p2)
	if err != nil {
		fmt.Println("❌ Error unmarshalling JSON:", err)
		return
	}
	fmt.Println("🔁 Unmarshalled Person struct:", p2)

	// Step 5: Decode JSON into a generic map (raw JSON handling)
	var raw map[string]interface{}
	err = json.Unmarshal(jsonData, &raw)
	if err != nil {
		fmt.Println("❌ Error unmarshalling into map:", err)
		return
	}
	fmt.Println("📂 Raw JSON map (map[string]interface{}):", raw)

	// Accessing individual fields from the map
	fmt.Printf("🔍 Name from map: %v\n", raw["name"])
	fmt.Printf("🔍 Age from map: %v\n", raw["age"])
	fmt.Printf("🔍 IsAdult from map: %v\n", raw["is_adult"])

	// Optional: Encoding from a generic map to JSON
	jsonFromMap, err := json.MarshalIndent(raw, "", "  ")
	if err != nil {
		fmt.Println("❌ Error marshalling map to JSON:", err)
		return
	}
	fmt.Println("🔁 Re-encoded JSON from map:\n", string(jsonFromMap))
}
