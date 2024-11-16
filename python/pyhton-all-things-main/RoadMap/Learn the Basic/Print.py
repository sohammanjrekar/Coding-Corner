# Printing "Hii guys" on the console with newline character at the end
print("Hii guys")

# Printing "lorem hi jiaj" and "wqdiuiu udaiu qd uydqyuq iuiui" with a "-" separator and ending with a newline character
print("lorem hi jiaj", "wqdiuiu udaiu qd uydqyuq iuiui", sep="-", end="\n")

# Assigning values to variables x and y
x = 45
y = "soham"

# Printing a formatted string with the value of y and x
print('the marks of {} is {}'.format(y, x))

# Opening a file named "output.txt" in write mode
with open("output.txt", "w") as f:
    # Redirecting output to the file "output.txt"
    print("This is redirected to a file.", file=f, flush=True)







print("lorem hi jiaj", "wqdiuiu udaiu qd uydqyuq\r iuiui", sep="-", end="\n")

