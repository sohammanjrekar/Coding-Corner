# dictionary comprehension
mydict = {x: x * x for x in range(1, 6)}
print(mydict)
# This will print the dictionary with keys as numbers from 1 to 5 and values as their squares
# dictionary comprehension with condition
mydict2 = {x: x * x for x in range(1, 6) if x % 2 == 0}
print(mydict2)  # This will print the dictionary with keys as even numbers from 1 to 5 and values as their squares
# dictionary comprehension with nested loops
mydict3 = {(x, y): x + y for x in range(1, 4) for y in range(1, 4)}
print(mydict3)  # This will print the dictionary with keys as tuples (x, y) and values as their sum
# dictionary comprehension with nested loops and condition
mydict4 = {(x, y): x + y for x in range(1, 4) for y in range(1, 4) if x != y}
print(mydict4)  # This will print the dictionary with keys as tuples (x, y) and values as their sum, excluding pairs where x == y       
# dictionary comprehension with function call
mydict5 = {x: x.upper() for x in ["hello", "world"]}
print(mydict5)  # This will print the dictionary with keys as strings and values as their uppercase versions
# dictionary comprehension with function call and condition
mydict6 = {x: x.upper() for x in ["hello", "world"] if len(x) > 4}
print(mydict6)  # This will print the dictionary with keys as strings with length greater than 4 and values as their uppercase versions
# dictionary comprehension with multiple conditions
mydict7 = {x: x.upper() for x in ["hello", "world"] if len(x) > 4 and x.startswith("h")}
print(mydict7)  # This will print the dictionary with keys as strings with length greater than 4 and starting with 'h'
# dictionary comprehension with multiple conditions and nested loops
mydict8 = {(x, y): x + y for x in ["hello", "world"] for y in ["python", "java"] if len(x) > 4 and len(y) > 4}
print(mydict8)  # This will print the dictionary with keys as tuples (x, y) and values as their sum, where both x and y have length greater than 4
# dictionary comprehension with multiple conditions and nested loops, filtering out duplicates
mydict8 = {(x, y): x + y for x in ["hello", "world"] for y in ["python", "java"] if len(x) > 4 and len(y) > 4}
print(mydict8)  # This will print the dictionary with keys as tuples (x, y) and values as their sum, where both x and y have length greater than 4 
# Convert to set to remove duplicates, then back to dictionary
mydict8 = dict.fromkeys(mydict8)  # Convert to set to remove duplicates, then back to dictionary
print(mydict8)  # This will print the dictionary with keys as tuples (x, y) and values as their sum, where both x and y have length greater than 4 without duplicates
# Note: Dictionary comprehensions are a powerful way to create dictionaries in Python, allowing for concise and readable code. They can be used with conditions, nested loops, and function calls to create complex dictionaries in a single line of code.