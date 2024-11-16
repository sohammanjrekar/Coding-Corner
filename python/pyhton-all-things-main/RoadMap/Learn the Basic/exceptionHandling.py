# Exception: The base class for all built-in exceptions.
# AttributeError: Raised when an attribute reference or assignment fails.
# FileNotFoundError: Raised when a file or directory is requested but cannot be found.
# ImportError: Raised when an import statement fails to find the module.
# IndentationError: Raised when the indentation is incorrect.
# IndexError: Raised when a sequence subscript is out of range.
# KeyError: Raised when a dictionary key is not found.
# NameError: Raised when a local or global name is not found.
# TypeError: Raised when an operation or function is applied to an object of an inappropriate type.
# ValueError: Raised when an operation or function receives an argument of the correct type but an inappropriate value.
# ZeroDivisionError: Raised when division or modulo by zero occurs.
# KeyboardInterrupt: Raised when the user interrupts program execution (usually by pressing Ctrl+C).
# MemoryError: Raised when an operation runs out of memory.
# OverflowError: Raised when a calculation exceeds the maximum limit for a numeric type.
# SyntaxError: Raised when the syntax of a statement is incorrect.
# TypeError: Raised when an operation or function is applied to an object of an inappropriate type.
# UnboundLocalError: Raised when trying to access a local variable before it is assigned a value.
# UnicodeError: Raised when a Unicode-related encoding or decoding error occurs.
# FileExistsError: Raised when trying to create a file or directory that already exists.
# PermissionError: Raised when trying to perform an operation without the required permissions.



# Handling specific exception using try-except block
try:
    result = 10 / 0  # Division by zero
except ZeroDivisionError:
    print("Error: Division by zero")

# Handling multiple exceptions
try:
    result = int("abc")  # Invalid conversion
except (ValueError, TypeError):
    print("Error: Invalid input")

# Handling any exception
try:
    result = int("abc")  # Invalid conversion
except:
    print("An error occurred")

# Handling specific exception and accessing exception object
try:
    result = int("abc")  # Invalid conversion
except ValueError as e:
    print("Error:", e)

# Handling exception with else block
try:
    result = int(input("Enter a number: "))
except ValueError:
    print("Error: Invalid input")
else:
    print("Input was valid")

# Handling exception with finally block for cleanup
try:
    file = open("example.txt", "r")
    data = file.read()
except FileNotFoundError:
    print("Error: File not found")
finally:
    file.close()  # Cleanup code

# Raising exceptions explicitly
def validate_age(age):
    if age < 0:
        raise ValueError("Age cannot be negative")

# Test the function
try:
    validate_age(-5)
except ValueError as e:
    print("Validation Error:", e)
