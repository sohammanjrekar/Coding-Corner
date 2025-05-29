package main

import (
	"encoding/json"
	"fmt"
)

// Person struct with JSON tags
type Person struct {
	Name   string `json:"name"`
	Age    int    `json:"age"`
	Job    string `json:"job"`
	Salary int    `json:"-"`
}

// Method with value receiver
func (p Person) Greet() {
	fmt.Printf("Hello, my name is %s.\n", p.Name)
}

// Method with pointer receiver modifies the struct
func (p *Person) HaveBirthday() {
	p.Age++
}

// Embedded Address struct
type Address struct {
	City, Country string
}

// Employee embeds Person and Address
type Employee struct {
	Person
	Address
	EmployeeID string
}

func main() {
	p := Person{Name: "Alice", Age: 30, Job: "Engineer", Salary: 9000}
	p.Greet()
	p.HaveBirthday()
	fmt.Printf("After birthday, age: %d\n\n", p.Age)

	e := Employee{
		Person:     Person{Name: "Bob", Age: 40, Job: "Manager"},
		Address:    Address{City: "New York", Country: "USA"},
		EmployeeID: "EMP1234",
	}
	fmt.Println("Employee info:")
	fmt.Println("Name:", e.Name)
	fmt.Println("Age:", e.Age)
	fmt.Println("Job:", e.Job)
	fmt.Println("City:", e.City)
	fmt.Println("Employee ID:", e.EmployeeID)

	// Marshal to JSON (salary excluded due to `json:"-"` tag)
	jsonData, _ := json.MarshalIndent(p, "", "  ")
	fmt.Println("\nPerson as JSON:")
	fmt.Println(string(jsonData))

	// Anonymous struct example
	anon := struct {
		Title string
		Year  int
	}{"Go Structs", 2025}
	fmt.Printf("\nAnonymous struct: %+v\n", anon)
}
