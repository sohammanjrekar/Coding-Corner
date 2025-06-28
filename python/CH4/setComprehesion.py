# set comprehension
myset5 = {x * x for x in range(1, 6)}
print(myset5)  # This will print the set of squares from 1 to 5
# set comprehension with condition
myset6 = {x * x for x in range(1, 6) if x % 2 == 0}
print(myset6)  # This will print the set of squares of even numbers from 1 to 5

# set comprehension with nested loops
myset7 = {(x, y) for x in range(1, 4) for y in range(1, 4)}
print(myset7)  # This will print the set of tuples (x, y) 
# set comprehension with nested loops and condition
myset8 = {(x, y) for x in range(1, 4) for y in range(1, 4) if x != y}
print(myset8)  # This will print the set of tuples (x, y)
# set comprehension with function call
myset9 = {x.upper() for x in ["hello", "world"]}
print(myset9)  # This will print the set of uppercase strings
# set comprehension with function call and condition
myset10 = {x.upper() for x in ["hello", "world"] if len(x) > 4}
print(myset10)  # This will print the set of uppercase strings with length greater than 4
# set comprehension with multiple conditions
myset11 = {x.upper() for x in ["hello", "world"] if len(x) > 4 and x.startswith("h")}
print(myset11)  # This will print the set of uppercase strings with length greater than 4 and starting with 'h'
# set comprehension with multiple conditions and nested loops
myset12 = {(x, y) for x in ["hello", "world"] for y in ["python", "java"] if len(x) > 4 and len(y) > 4}
print(myset12)  # This will print the set of tuples (x, y)
# set comprehension with multiple conditions and nested loops, filtering out duplicates
myset13 = {(x, y) for x in ["hello", "world"] for y in ["python", "java"] if len(x) > 4 and len(y) > 4}
print(myset13)  # This will print the set of tuples (x, y) without duplicates
# Convert to set to remove duplicates, then back to set
myset13 = set(myset13)  # Convert to set to remove duplicates                   
print(myset13)  # This will print the set of tuples (x, y) without duplicates