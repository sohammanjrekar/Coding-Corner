from functools import reduce

# Initial list
numbers = [1, 2, 3, 4]

# Use map to double each number in the list
doubled = list(map(lambda x: x * 2, numbers))

# Use filter to keep only even numbers
evens = list(filter(lambda x: x % 2 == 0, numbers))

# Use reduce to find the sum of the numbers
sum_of_numbers = reduce(lambda x, y: x + y, numbers)

# Print results
print("Doubled:", doubled)
print("Evens:", evens)
print("Sum:", sum_of_numbers)
