package main

import (
	"fmt"
	"os"

	"github.com/urfave/cli/v2"
)

func main() {
	app := &cli.App{
		Name:  "app",
		Usage: "An example CLI",
		Action: func(c *cli.Context) error {
			fmt.Println("Hello from urfave/cli!")
			return nil
		},
	}

	err := app.Run(os.Args)
	if err != nil {
		fmt.Println(err)
	}
}
