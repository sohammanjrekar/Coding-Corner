greet = lambda name: print(f"Hello, {name}!")
# Using the lambda function
greet("Alice")
# lambda function with a list comprehension
squared_numbers = [x**2 for x in range(10)]
# Using the lambda function in a list comprehension
squared_numbers_lambda = list(map(lambda x: x**2, range(10)))
# Printing the results
print("Squared numbers:", squared_numbers)
print("Squared numbers using lambda:", squared_numbers_lambda)
# lambda function with a filter
even_numbers = list(filter(lambda x: x % 2 == 0, range(20)))
# Printing the results
print("Even numbers:", even_numbers)
# lambda function with a reduce
from functools import reduce    
# Using reduce to sum a list of numbers
sum_numbers = reduce(lambda x, y: x + y, range(10))
# Printing the result
print("Sum of numbers from 0 to 9:", sum_numbers)   
# lambda function with a map
cubed_numbers = list(map(lambda x: x**3, range(10)))
# Printing the results
print("Cubed numbers:", cubed_numbers)  
# lambda function with a sort
names = ["Alice", "Bob", "Charlie", "David"]
sorted_names = sorted(names, key=lambda x: len(x))
print("Names sorted by length:", sorted_names)