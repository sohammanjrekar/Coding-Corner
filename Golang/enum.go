package main

import "fmt"

// OrderStatus is a custom type for enum-like behavior
type OrderStatus int

// Enum values using iota
const (
	Pending    OrderStatus = iota // 0
	Processing                    // 1
	Prepared                      // 2
	_                             // skip 3
	_                             // skip 4
	Delivered                     // 5
)

// String provides a human-readable name for each OrderStatus
func (os OrderStatus) String() string {
	switch os {
	case Pending:
		return "Pending"
	case Processing:
		return "Processing"
	case Prepared:
		return "Prepared"
	case Delivered:
		return "Delivered"
	default:
		return "Unknown Status"
	}
}

// ChangeOrderStatus simulates a status update and prints it
func ChangeOrderStatus(status OrderStatus) {
	fmt.Printf("Order status changed to: %s (%d)\n", status.String(), status)
}

// enums demonstrates usage of enum-style constants with custom types
func enums() {
	fmt.Println("== Enum Example with iota ==")
	ChangeOrderStatus(Pending)
	ChangeOrderStatus(Processing)
	ChangeOrderStatus(Prepared)
	ChangeOrderStatus(Delivered)

	// Example of unknown value
	var unknown OrderStatus = 10
	fmt.Println("Unknown status:", unknown.String())
}
