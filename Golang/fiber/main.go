package main

import "github.com/gofiber/fiber/v2"

func main() {
	app := fiber.New()

	// app.Get("/:value", func(c *fiber.Ctx) error {
	// 	return c.SendString("Hello, World!" + c.Params("value"))
	// })
	// app.Get("/:name?", func(c *fiber.Ctx) error {
	// 	if c.Params("name") == "" {
	// 		return c.SendString("Hello, World!")
	// 	}
	// 	return c.SendString("Hello, " + c.Params("name") + "!")
	// })
	// route grouping
	api1 := app.Group("/api/v1")
	api1.Get("/users", func(c *fiber.Ctx) error {
		return c.SendString("User List")
	})
	api1.Get("/users/:id", func(c *fiber.Ctx) error {
		return c.SendString("User " + c.Params("id"))
	})
	api2 := app.Group("/api/v2")
	api2.Get("/users", func(c *fiber.Ctx) error {
		return c.SendString("User List v2")
	})
	api2.Get("/users/:id", func(c *fiber.Ctx) error {
		return c.SendString("User " + c.Params("id") + " v2")
	})
	// Static file serving
	// app.Get("/static/*", func(c *fiber.Ctx) error {
	// 	return c.SendFile("./public" + c.Params("*"))
	// })
	app.Static("/", "./public")

	app.Listen(":3000")
}
