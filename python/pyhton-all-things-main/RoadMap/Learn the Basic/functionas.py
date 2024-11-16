# Function definition with positional arguments
def greet(name, message):
    print(f"Hello, {name}! {message}")

# Function with default parameter values
def greet_default(name="Guest", message="Welcome!"):
    print(f"Hello, {name}! {message}")

# Function with keyword arguments
def greet_keyword(name, message):
    print(f"Hello, {name}! {message}")

# Function with variable-length argument list
def greet_varargs(*args):
    for name in args:
        print(f"Hello, {name}!")

# Function with variable-length keyword argument list
def greet_kwargs(**kwargs):
    for name, message in kwargs.items():
        print(f"Hello, {name}! {message}")

# Calling functions with positional arguments
greet("Alice", "Good morning!")  # Output: Hello, Alice! Good morning!
greet_default()                   # Output: Hello, Guest! Welcome!

# Calling functions with keyword arguments
greet_keyword(name="Bob", message="How are you?")  # Output: Hello, Bob! How are you?

# Calling functions with variable-length argument list
greet_varargs("Charlie", "David", "Eve")  # Output: Hello, Charlie! Hello, David! Hello, Eve!

# Calling functions with variable-length keyword argument list
greet_kwargs(Alice="Good morning!", Bob="How are you?")  
# Output: Hello, Alice! Good morning! Hello, Bob! How are you?
