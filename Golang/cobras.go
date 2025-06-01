package main

import (
	"fmt"

	"github.com/spf13/cobra"
)

func cobras() {
	var rootCmd = &cobra.Command{
		Use:   "app",
		Short: "A brief description of your app",
		Run: func(cmd *cobra.Command, args []string) {
			fmt.Println("Welcome to Cobra CLI App!")
		},
	}

	rootCmd.Execute()
}
