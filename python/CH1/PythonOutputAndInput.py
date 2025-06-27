print("helloworld",sep=" ",end="!",flush=True,file=None)
# Notes:
# - sep: specifies the separator between multiple values (default is a space)
# - end: specifies what to print at the end (default is a newline)
# - flush: whether to forcibly flush the output buffer (default is False)
# - file: specifies the file to write to (default is sys.stdout)

#output formating
print("the value x is {} and y is {}".format(10, 20))

# f-string formatting (Python 3.6+)
x = 10
y = 20
print(f"the value x is {x} and y is {y}")

# string modulo
print("the value x is %dand y is %d" % (x, y))
# %2d means the value will be printed with a width of 2 characters, right-aligned by default
# %2.2f means the value will be printed with a width of 2 characters, right-aligned by default, and 2 decimal places
# %s means the value will be printed as a string
# %c means the value will be printed as a character
# %b means the value will be printed as a binary number
# %o means the value will be printed as an octal number 
# %x means the value will be printed as a hexadecimal number
# %e means the value will be printed in scientific notation
# %g means the value will be printed in the most compact form (either scientific or decimal notation)
# example:
print("the value x is %2d and y is %2.2f" % (x, 20.123456))

# input from user
name = input("Enter your name: ")
age = input("Enter your age: ") 
print(f"Hello {name}, you are {age} years old.")
# input with type conversion
age = int(input("Enter your age: "))  # convert input to integer
print(f"Hello {name}, you are {age} years old.")
