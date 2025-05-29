package main

func constants() {
	const pi = 3.14
	// pi = 3.14159 // ❌ Error: Cannot assign to constant

	const (
		day   = "Monday"
		month = "January"
		year  = 2023
	)
	// day = "Tuesday" // ❌ Error: Cannot assign to constant

	println("Pi:", pi)
	println("Day:", day)
	println("Month:", month)
	println("Year:", year)
}
