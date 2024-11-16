# Mode	Description	Use Cases
# 'r'	Read-only mode.	Reading from an existing file.
# 'r+'	Read and write mode.	Reading from and writing to an existing file.
# 'w'	Write-only mode. Creates a new file if needed.	Writing to a new file.
# 'w+'	Read and write mode. Creates a new file if needed.	Reading from and writing to a new file.
# 'a'	Append mode.	Appending data to an existing file.
# 'a+'	Append and read mode.	Appending data to and reading from an existing file.


# Writing to a file
with open("example.txt", "w") as file:
    file.write("Hello, world!\n")
    file.write("This is a sample text file.\n")

# Appending to a file
with open("example.txt", "a") as file:
    file.write("Appending additional content.\n")

# Reading from a file
with open("example.txt", "r") as file:
    content = file.read()
    print("File content:")
    print(content)

# Reading file line by line
with open("example.txt", "r") as file:
    print("File content line by line:")
    for line in file:
        print(line.strip())  # Remove trailing newline character

# Reading file into a list of lines
with open("example.txt", "r") as file:
    lines = file.readlines()
    print("File content as list of lines:")
    print(lines)

# Checking if a file exists
import os
if os.path.exists("example.txt"):
    print("File exists.")
else:
    print("File does not exist.")

# Getting file information
file_info = os.stat("example.txt")
print("File size:", file_info.st_size, "bytes")
print("Last modified:", file_info.st_mtime)

# Renaming a file
os.rename("example.txt", "new_example.txt")
print("File renamed.")

# Deleting a file
os.remove("new_example.txt")
print("File deleted.")
