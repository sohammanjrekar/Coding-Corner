mytuple = (x * x for x in range(1, 6))
print(mytuple)  # This will print the tuple of squares from 1 to 5
# tuple comprehension with condition
mytuple2 = (x * x for x in range(1, 6) if x % 2 == 0)
print(mytuple2)  # This will print the tuple of squares of even numbers from 1 to 5
# tuple comprehension with nested loops
mytuple3 = ((x, y) for x in range(1, 4) for y in range(1, 4))
print(mytuple3)  # This will print the tuple of pairs (x, y)
# tuple comprehension with nested loops and condition
mytuple4 = ((x, y) for x in range(1, 4) for y in range(1, 4) if x != y)
print(mytuple4)  # This will print the tuple of pairs (x, y
# tuple comprehension with function call
mytuple5 = (x.upper() for x in ["hello", "world"])
print(mytuple5)  # This will print the tuple of uppercase strings
# tuple comprehension with function call and condition
mytuple6 = (x.upper() for x in ["hello", "world"] if len(x) > 4)
print(mytuple6)  # This will print the tuple of uppercase strings with length greater than 4
# tuple comprehension with multiple conditions
mytuple7 = (x.upper() for x in ["hello", "world"] if len(x) > 4 and x.startswith("h"))
print(mytuple7)  # This will print the tuple of uppercase strings with length greaterthan 4 and starting with 'h'
# tuple comprehension with multiple conditions and nested loops             
mytuple8 = ((x, y) for x in ["hello", "world"] for y in ["python", "java"] if len(x) > 4 and len(y) > 4)
print(mytuple8)  # This will print the tuple of pairs (x, y)
# tuple comprehension with multiple conditions and nested loops, filtering out duplicates
mytuple8 = set(mytuple8)
print(mytuple8)  # This will print the tuple of pairs (x, y) without duplicates
# Convert to set to remove duplicates, then back to tuple
mytuple8 = tuple(mytuple8)  # Convert to set to remove duplicates, then back to tuple
print(mytuple8)  # This will print the tuple of pairs (x, y) without duplicates
# Note: Tuple comprehensions are not a built-in feature in Python, but you can use  # generator expressions to achieve similar functionality.