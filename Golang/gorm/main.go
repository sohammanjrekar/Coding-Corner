package main

import (
	"net/http"

	"github.com/gin-gonic/gin"
	"gorm.io/driver/sqlite" // GORM-compatible SQLite driver
	"gorm.io/gorm"
)

// Model definition
type Book struct {
	ID        uint   `json:"id" gorm:"primaryKey"`
	Title     string `json:"title"`
	Author    string `json:"author"`
	Publisher string `json:"publisher"`
	Year      int    `json:"year"`
}

// Database instance
var db *gorm.DB

func initDatabase() {
	var err error

	// Connect to SQLite database using modernc.org/sqlite
	db, err = gorm.Open(sqlite.Open("file:books.db?mode=rwc"), &gorm.Config{})
	if err != nil {
		panic("Failed to connect to database")
	}

	// Migrate the schema
	db.AutoMigrate(&Book{})
}

func main() {
	// Initialize database
	initDatabase()

	// Create Gin router
	router := gin.Default()

	// Routes
	router.POST("/books", createBook)        // Create a book
	router.GET("/books", getBooks)           // Read all books
	router.GET("/books/:id", getBookByID)    // Read one book
	router.PUT("/books/:id", updateBookByID) // Update a book
	router.DELETE("/books/:id", deleteBook)  // Delete a book

	// Start server
	router.Run(":8080")
}

////////////////////
// CRUD Handlers //
///////////////////

// Create a new book
func createBook(c *gin.Context) {
	var book Book

	// Bind JSON to the Book struct
	if err := c.ShouldBindJSON(&book); err != nil {
		c.JSON(http.StatusBadRequest, gin.H{"error": err.Error()})
		return
	}

	// Save the book in the database
	result := db.Create(&book)
	if result.Error != nil {
		c.JSON(http.StatusInternalServerError, gin.H{"error": "Failed to create book"})
		return
	}

	c.JSON(http.StatusOK, gin.H{"message": "Book created successfully", "book": book})
}

// Get all books
func getBooks(c *gin.Context) {
	var books []Book

	// Retrieve all books from the database
	result := db.Find(&books)
	if result.Error != nil {
		c.JSON(http.StatusInternalServerError, gin.H{"error": "Failed to retrieve books"})
		return
	}

	c.JSON(http.StatusOK, books)
}

// Get a single book by ID
func getBookByID(c *gin.Context) {
	var book Book
	id := c.Param("id")

	// Find the book with the given ID
	result := db.First(&book, id)
	if result.Error != nil {
		c.JSON(http.StatusNotFound, gin.H{"error": "Book not found"})
		return
	}

	c.JSON(http.StatusOK, book)
}

// Update a book by ID
func updateBookByID(c *gin.Context) {
	var book Book
	id := c.Param("id")

	// Check if the book exists
	result := db.First(&book, id)
	if result.Error != nil {
		c.JSON(http.StatusNotFound, gin.H{"error": "Book not found"})
		return
	}

	// Bind the updated data
	var updatedBook Book
	if err := c.ShouldBindJSON(&updatedBook); err != nil {
		c.JSON(http.StatusBadRequest, gin.H{"error": err.Error()})
		return
	}

	// Update the book
	book.Title = updatedBook.Title
	book.Author = updatedBook.Author
	book.Publisher = updatedBook.Publisher
	book.Year = updatedBook.Year

	db.Save(&book)
	c.JSON(http.StatusOK, gin.H{"message": "Book updated successfully", "book": book})
}

// Delete a book by ID
func deleteBook(c *gin.Context) {
	var book Book
	id := c.Param("id")

	// Find the book with the given ID
	result := db.First(&book, id)
	if result.Error != nil {
		c.JSON(http.StatusNotFound, gin.H{"error": "Book not found"})
		return
	}

	// Delete the book
	db.Delete(&book)
	c.JSON(http.StatusOK, gin.H{"message": "Book deleted successfully"})
}
