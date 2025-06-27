def sumOfNum(num1, num2):
    return num1 + num2

sum = sumOfNum(10, 20)
print("Sum of numbers:", sum)

# function with default parameter
def greet(name="Guest"):
    return f"Hello, {name}!"

greeting = greet("Alice")
print(greeting)

# function with variable number of arguments
def addNumbers(*args):
    return sum(args)

total = addNumbers(1, 2, 3, 4, 5)
print("Total:", total)
# function with keyword arguments
def printDetails(**kwargs):
    for key, value in kwargs.items():
        print(f"{key}: {value}")    
printDetails(name="Alice", age=30, city="New York")
# function with return statement
def multiply(a, b):
    return a * b
result = multiply(5, 10)
print("Multiplication result:", result)
# function with lambda expression
multiply_lambda = lambda x, y: x * y
result_lambda = multiply_lambda(5, 10)
print("Multiplication result using lambda:", result_lambda)

# function with nested functions
def outer_function(x):
    def inner_function(y):
        return x + y
    return inner_function
result_nested = outer_function(10)(5)
print("Result from nested function:", result_nested)
# function with decorators
def decorator_function(func):
    def wrapper(*args, **kwargs):
        print("Before calling the function")
        result = func(*args, **kwargs)
        print("After calling the function")
        return result
    return wrapper

@decorator_function
def sample_function(x, y):
    return x + y
result_decorated = sample_function(5, 10)
print("Result from decorated function:", result_decorated)
# function with generator
def number_generator(n):
    for i in range(n):
        yield i * i
for num in number_generator(5): 
    print("Generated number:", num)
# function with list comprehension
def square_numbers(numbers):
    return [x * x for x in numbers]
numbers_list = [1, 2, 3, 4, 5]
squared_numbers = square_numbers(numbers_list)
print("Squared numbers:", squared_numbers)  
# function with map
def square(x):
    return x * x
def apply_map(numbers):
    return list(map(square, numbers))
numbers_list = [1, 2, 3, 4, 5]
squared_numbers_map = apply_map(numbers_list)
print("Squared numbers using map:", squared_numbers_map)
# function with filter
def is_even(x):
    return x % 2 == 0
def apply_filter(numbers):
    return list(filter(is_even, numbers))
numbers_list = [1, 2, 3, 4, 5]
filtered_numbers = apply_filter(numbers_list)
print("Filtered numbers (even):", filtered_numbers)
# function with reduce
from functools import reduce
def multiply(x, y):
    return x * y
def apply_reduce(numbers):
    return reduce(multiply, numbers)
numbers_list = [1, 2, 3, 4, 5]
reduced_result = apply_reduce(numbers_list)
print("Reduced result (product):", reduced_result)
# function with itertools
import itertools
def permutations_example(iterable):
    return list(itertools.permutations(iterable))
iterable = [1, 2, 3]    
permuted_result = permutations_example(iterable)
print("Permutations of [1, 2, 3]:", permuted_result)
# function with functools
import functools
@functools.lru_cache(maxsize=None)  
def cached_function(x):
    return x * x
cached_result_1 = cached_function(5)
cached_result_2 = cached_function(5)  # This will use the cached result 
print("Cached result for 5:", cached_result_1)
print("Cached result for 5 again:", cached_result_2)  # Should be the same as cached_result_1