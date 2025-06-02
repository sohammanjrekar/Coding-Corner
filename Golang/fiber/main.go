package main

import (
	"github.com/gofiber/fiber/v2"
	"github.com/joho/godotenv"
	"gorm.io/gorm"
)

type Book struct {
	ID     uint   `json:"id" gorm:"primaryKey"`
	Title  string `json:"title" gorm:"not null"`
	Author string `json:"author" gorm:"not null"`
	Year   int    `json:"year" gorm:"not null"`
}

type Repository struct {
	DB *gorm.DB
}

func (r Repository) CreateBook(c *fiber.Ctx) error {
book:
	Book{}
	if err := c.BodyParser(&book); err != nil {
		return c.Status(fiber.StatusBadRequest).JSON(fiber.Map{
			"error": "Invalid request body",
		})
	}
	// Create the book in the database
	if err := r.DB.Create(&book).Error; err != nil {
		return c.Status(fiber.StatusInternalServerError).JSON(fiber.Map{
			"error": "Failed to create book",
		})
	}
	return c.Status(fiber.StatusCreated).JSON(book)
}
func (r Repository) SetupRoutes(app *fiber.App) {
	api := app.Group("/api")
	api.Post("/create_books", r.CreateBook)
	api.Delete("/delete_book/:id", r.DeleteBook)
	api.Get("/get_books", r.GetBooks)
	api.Get("/get_book/:id", r.GetBook)
	api.Put("/update_book/:id", r.UpdateBook)
}
func main() {
	err := godotenv.Load(".env")
	if err != nil {
		panic("Error loading .env file")
	}
	db, err := storage.NewConnection(config)
	if err != nil {
		panic("Error connecting to the database: " + err.Error())
	}
	r := Repository{
		// Initialize your database connection here
		DB: db,
	}
	app := fiber.New()
	// Middleware
	r.SetupRoutes(app)
	app.Listen(":3000")

	// app.Get("/:value", func(c *fiber.Ctx) error {
	// 	return c.SendString("Hello, World!" + c.Params("value"))
	// })
	// // app.Get("/:name?", func(c *fiber.Ctx) error {
	// // 	if c.Params("name") == "" {
	// // 		return c.SendString("Hello, World!")
	// // 	}
	// // 	return c.SendString("Hello, " + c.Params("name") + "!")
	// // })
	// // route grouping
	// api1 := app.Group("/api/v1")
	// api1.Get("/users", func(c *fiber.Ctx) error {
	// 	return c.SendString("User List")
	// })
	// api1.Get("/users/:id", func(c *fiber.Ctx) error {
	// 	return c.SendString("User " + c.Params("id"))
	// })
	// api2 := app.Group("/api/v2")
	// api2.Get("/users", func(c *fiber.Ctx) error {
	// 	return c.SendString("User List v2")
	// })
	// api2.Get("/users/:id", func(c *fiber.Ctx) error {
	// 	return c.SendString("User " + c.Params("id") + " v2")
	// })
	// // Static file serving
	// // app.Get("/static/*", func(c *fiber.Ctx) error {
	// // 	return c.SendFile("./public" + c.Params("*"))
	// // })
	// app.Static("/", "./public")

	// app.Listen(":3000")
}
