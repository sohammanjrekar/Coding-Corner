# Example 1: Generating numbers from 0 up to, but not including, the stop value.
for i in range(5):
    print(i, end=' ')  # Output: 0 1 2 3 4

# Example 2: Generating numbers from the start value up to, but not including, the stop value.
print()
for i in range(2, 5):
    print(i, end=' ')  # Output: 2 3 4

# Example 3: Generating numbers from the start value up to, but not including, the stop value, incrementing by the step value.
print()
for i in range(0, 10, 2):
    print(i, end=' ')  # Output: 0 2 4 6 8

# Example 4: Using a negative step value to generate numbers in reverse order.
print()
for i in range(5, 0, -1):
    print(i, end=' ')  # Output: 5 4 3 2 1

# Example 5: Converting a range object to a list.
print()
numbers_list = list(range(5))
print(numbers_list)  # Output: [0, 1, 2, 3, 4]

# Example 6: Converting a range object to a tuple.
numbers_tuple = tuple(range(5))
print(numbers_tuple)  # Output: (0, 1, 2, 3, 4)


# syntax:
# range(stop)
# range(start, stop[, step])