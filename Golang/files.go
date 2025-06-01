package main

import (
	"fmt"
	"os"
)

func files() {
	f, err := os.Open("f.txt")
	if err != nil {
		panic(err)
	}
	defer f.Close()
	mf, merr := os.Stat("f.txt")
	if merr != nil {
		panic(merr)
	}
	fmt.Println("File Name:", mf.Name())
	fmt.Println("File Size:", mf.Size())
	fmt.Println("File Mode:", mf.Mode())
	fmt.Println("Is Directory:", mf.IsDir())
	fmt.Println("Last Modified:", mf.ModTime())
	fmt.Println("File System:", mf.Sys())
	defer f.Close()

	// read the file
	buffer := make([]byte, mf.Size())
	_, err = f.Read(buffer)
	if err != nil {
		panic(err)
	}
	fmt.Println("File Content:", string(buffer))
	fmt.Println("File Content Length:", len(buffer))

	// read folder
	files, err := os.ReadDir(".")
	if err != nil {
		panic(err)
	}
	for _, file := range files {
		fmt.Println("File Name:", file.Name())
	}
	// create a new file
	newFile, err := os.Create("newfile.txt")
	if err != nil {
		panic(err)
	}
	defer newFile.Close()
	fmt.Println("Created new file:", newFile.Name())
	// write to the new file
	_, err = newFile.WriteString("Hello, World!")
	if err != nil {
		panic(err)
	}

	// delete the new file
	err = os.Remove("newfile.txt")
	if err != nil {
		panic(err)
	}

	// rename the original file
	err = os.Rename("f.txt", "renamed_f.txt")
	if err != nil {
		panic(err)
	}
}
