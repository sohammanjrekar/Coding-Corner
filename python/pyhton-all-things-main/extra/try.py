# None Type
x = None
print(type(x))  # Output: <class 'NoneType'>

s = "Hello, world!"
print(type(s))  # Output: <class 'str'>

# Integer
i = 5
print(type(i))  # Output: <class 'int'>

# Float
f = 3.14
print(type(f))  # Output: <class 'float'>

# Complex
c = 3 + 4j
print(type(c))  # Output: <class 'complex'>

# Set
set_var = {1, 2, 3, 4}
print(type(set_var))  # Output: <class 'set'>

# Tuple
t = (1, 2, 3)
print(type(t))  # Output: <class 'tuple'>

# List
lst = [1, 2, 3, 4]
print(type(lst))  # Output: <class 'list'>

# Dictionary
d = {'a': 1, 'b': 2}
print(type(d))  # Output: <class 'dict'>

# Type Conversion

# Convert integer to string
num = 123
num_str = str(num)
print(type(num_str))  # Output: <class 'str'>

# Convert string to integer
str_num = "456"
str_num_int = int(str_num)
print(type(str_num_int))  # Output: <class 'int'>

# Convert float to integer
flt = 3.14
flt_int = int(flt)
print(type(flt_int))  # Output: <class 'int'>

# Convert integer to float
int_flt = float(5)
print(type(int_flt))  # Output: <class 'float'>

# Convert string to float
str_flt = float("3.14")
print(type(str_flt))  # Output: <class 'float'>

# Convert string to complex
str_complex = complex("2+3j")
print(type(str_complex))  # Output: <class 'complex'>
# Assigning values to variables
x = 5
y = "Hello, world!"
z = [1, 2, 3, 4, 5]

# Printing variable values
print(x)  # Output: 5
print(y)  # Output: Hello, world!
print(z)  # Output: [1, 2, 3, 4, 5]

# Type and ID

# Getting the type of a variable
print(type(x))  # Output: <class 'int'>
print(type(y))  # Output: <class 'str'>
print(type(z))  # Output: <class 'list'>

# Getting the memory address (ID) of a variable
print(id(x))    # Output: <memory address>
print(id(y))    # Output: <memory address>
print(id(z))    # Output: <memory address>

# Length

# Getting the length of a string
string_length = len(y)
print(string_length)  # Output: 13

# Getting the length of a list
list_length = len(z)
print(list_length)  # Output: 5

# Conditionals
# If-else statement with else if (elif)
if x > 0:
    print("x is positive")
elif x == 0:
    print("x is zero")
else:
    print("x is negative")

# Loops

# For loop
for i in range(5):
    print(i)  # Output: 0 1 2 3 4

# While loop
count = 0
while count < 5:
    print(count)  # Output: 0 1 2 3 4
    count += 1
    
# Do-while loop simulation  not do while present in python
count = 0
while True:
    print(count)  # Output: 0 1 2 3 4
    count += 1
    if count >= 5:
        break





# Functions

# Function definition
def add_numbers(a, b):
    return a + b

# Function call
result = add_numbers(3, 4)
print(result)  # Output: 7