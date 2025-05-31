package main

// import "fmt"

// // Animal interface defines a contract: any type that has a Speak() method returns a string
// type Animal interface {
// 	Speak() string
// }

// // Dog implements the Animal interface
// type Dog struct{}

// func (d Dog) Speak() string {
// 	return "Woof!"
// }

// // Cat implements the Animal interface
// type Cat struct{}

// func (c Cat) Speak() string {
// 	return "Meow!"
// }

// // Cow also implements the Animal interface
// type Cow struct{}

// func (c Cow) Speak() string {
// 	return "Moo!"
// }

// // interfaces demonstrates how interfaces work in Go
// func interfaces() {
// 	fmt.Println("== Interface Example ==")

// 	// Polymorphism: a single variable of interface type can hold any type that implements it
// 	var animal Animal

// 	animal = Dog{}
// 	fmt.Println("Dog says:", animal.Speak())

// 	animal = Cat{}
// 	fmt.Println("Cat says:", animal.Speak())

// 	animal = Cow{}
// 	fmt.Println("Cow says:", animal.Speak())

// 	// Array of interfaces
// 	animals := []Animal{Dog{}, Cat{}, Cow{}}
// 	fmt.Println("\n== Polymorphic Array of Interface ==")
// 	for _, a := range animals {
// 		fmt.Println(a.Speak())
// 	}

// 	// Interface satisfaction is implicit — no need for 'implements' keyword

// 	// Interface with multiple methods (optional)
// 	type Shape interface {
// 		Area() float64
// 		Perimeter() float64
// 	}

// 	type Rectangle struct {
// 		Width, Height float64
// 	}

// 	func (r Rectangle) Area() float64 {
// 		return r.Width * r.Height
// 	}

// 	func (r Rectangle) Perimeter() float64 {
// 		return 2 * (r.Width + r.Height)
// 	}

// 	var shape Shape = Rectangle{Width: 10, Height: 5}
// 	fmt.Println("\n== Interface with Multiple Methods ==")
// 	fmt.Println("Area:", shape.Area())
// 	fmt.Println("Perimeter:", shape.Perimeter())

// 	// Empty interface — can hold any type (like `any`)
// 	var val interface{}
// 	val = "hello"
// 	fmt.Println("\n== Empty Interface (interface{}) ==")
// 	fmt.Println("Value (string):", val)

// 	val = 42
// 	fmt.Println("Value (int):", val)

// 	val = Dog{}
// 	fmt.Println("Value (Dog):", val)

// 	// Type assertion from interface{}
// 	fmt.Println("\n== Type Assertion ==")
// 	if d, ok := val.(Dog); ok {
// 		fmt.Println("Asserted Dog speaks:", d.Speak())
// 	}
// }
