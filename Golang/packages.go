package main

import (
	"fmt"     // Standard library for input/output
	"math"    // Standard library for mathematical operations
	"strings" // Standard library for string operations

	"github.com/fatih/color" // External library for colored terminal output
)

// =============================
// 📘 Package Concepts in Go
// =============================
//
// ✅ Identifiers:
// - Exported (Public): Start with a capital letter (e.g., `Println`, `Sqrt`)
// - Unexported (Private): Start with a lowercase letter
//
// ✅ Dependency Management (using Go modules):
// - Initialize module:     `go mod init <modulename>`
// - Add dependency:        `go get <package>`
// - Clean up deps:         `go mod tidy`
// - Vendor deps locally:   `go mod vendor`
// - View docs:             `go doc fmt.Println` or `godoc fmt Println`
//
// ✅ Custom Packages:
// - Create folders like: `helper/utils.go`
// - Declare `package helper` in that file
// - Use in `main.go`: `import "yourmodule/helper"`
// - Call function: `helper.YourFunction()`
//
// ============================================

func packages() {
	fmt.Println("== Packages in Go ==")

	// ========================
	// 🎨 Color Package (3rd-Party)
	// ========================
	fmt.Println("\nColor Package:")
	color.Red("🔴 This text is red")
	color.Green("🟢 This text is green")
	color.Cyan("🔵 This text is cyan")

	// ========================
	// 🔢 Math Package
	// ========================
	fmt.Println("\nMath Package:")
	sqrtVal := math.Sqrt(16)    // Square root of 16
	ceilVal := math.Ceil(4.3)   // Rounds up to 5
	floorVal := math.Floor(4.7) // Rounds down to 4
	fmt.Println("√16 =", sqrtVal)
	fmt.Println("Ceil(4.3) =", ceilVal)
	fmt.Println("Floor(4.7) =", floorVal)

	// ========================
	// 🔤 Strings Package
	// ========================
	fmt.Println("\nStrings Package:")
	str := "hello world"
	fmt.Println("Original:", str)
	fmt.Println("ToUpper:", strings.ToUpper(str))
	fmt.Println("ToLower:", strings.ToLower(str))
	fmt.Println("Contains 'world'? ->", strings.Contains(str, "world"))
	fmt.Println("Replace 'world' with 'Go':", strings.Replace(str, "world", "Go", 1))

	// ========================
	// 🔒 Export Rules Recap
	// ========================
	fmt.Println("\nExport Rules:")
	fmt.Println("- Capitalized identifiers (e.g., Println, ToUpper) are exported (public).")
	fmt.Println("- Lowercase identifiers (e.g., internalFunc) are unexported (private to the package).")

	// ========================
	// 🧰 Notes on Custom Packages
	// ========================
	fmt.Println("\nCustom Packages:")
	fmt.Println("- You can organize reusable code in folders.")
	fmt.Println("- Folder acts as a package (with its own `package name`).")
	fmt.Println("- Then import and use like any other package.")
}
