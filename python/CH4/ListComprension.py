# syntax of list comprehension: [expression for item in iterable if condition]
mylist=[x*x for x in range(1,5)]
print(mylist)
# List comprehension with condition
mylist2=[x*x for x in range(1,10) if x%2==0]
print(mylist2)
# List comprehension with nested loops
mylist3=[(x,y) for x in range(1,4) for y in range(1,4)]
print(mylist3)
# List comprehension with nested loops and condition
mylist4=[(x,y) for x in range(1,4) for y in range(1,4) if x!=y]
print(mylist4)
# List comprehension with function call
mylist5=[x.upper() for x in ["hello", "world"]]
print(mylist5)
# List comprehension with function call and condition
mylist6=[x.upper() for x in ["hello", "world"] if len(x) > 4]  
print(mylist6)
# List comprehension with multiple conditions
mylist7=[x.upper() for x in ["hello", "world"] if len(x) > 4 and x.startswith("h")]
print(mylist7)
# List comprehension with multiple conditions and nested loops
mylist8=[(x,y) for x in ["hello", "world"] for y in ["python", "java"] if len(x) > 4 and len(y) > 4]
print(mylist8)
# List comprehension with multiple conditions and nested loops, filtering out duplicates
mylist9=[(x,y) for x in ["hello", "world"] for y in ["python", "java"] if len(x) > 4 and len(y) > 4]    
mylist9 = list(set(mylist9))  # Convert to set to remove duplicates, then back to list
print(mylist9)
