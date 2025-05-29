package main

import (
	"fmt"

	"github.com/spf13/cobra"
)

func main() {
	var rootCmd = &cobra.Command{
		Use:   "app",
		Short: "An example CLI",
		Run: func(cmd *cobra.Command, args []string) {
			fmt.Println("Hello from Cobra!")
		},
	}

	rootCmd.Execute()
}
