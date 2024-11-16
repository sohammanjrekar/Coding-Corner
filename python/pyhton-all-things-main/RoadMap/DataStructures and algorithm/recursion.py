# Factorial using recursion
def factorial(n):
    """Calculate the factorial of a number."""
    if n == 0:
        return 1
    else:
        return n * factorial(n - 1)

print("Factorial of 5:", factorial(5))  # Output: 120


# Fibonacci sequence using recursion
def fibonacci(n):
    """Calculate the nth Fibonacci number."""
    if n <= 1:
        return n
    else:
        return fibonacci(n - 1) + fibonacci(n - 2)

print("Fibonacci sequence up to 5:", [fibonacci(i) for i in range(5)])  # Output: [0, 1, 1, 2, 3]


# Sum of digits of a number using recursion
def sum_of_digits(n):
    """Calculate the sum of digits of a number."""
    if n < 10:
        return n
    else:
        return n % 10 + sum_of_digits(n // 10)

print("Sum of digits of 123:", sum_of_digits(123))  # Output: 6


# Power of a number using recursion
def power(base, exponent):
    """Calculate the power of a number."""
    if exponent == 0:
        return 1
    else:
        return base * power(base, exponent - 1)

print("2 raised to the power of 3:", power(2, 3))  # Output: 8


# Binary search using recursion (assuming sorted array)
def binary_search(arr, low, high, target):
    """Search for a target value in a sorted array."""
    if high >= low:
        mid = (low + high) // 2
        if arr[mid] == target:
            return mid
        elif arr[mid] > target:
            return binary_search(arr, low, mid - 1, target)
        else:
            return binary_search(arr, mid + 1, high, target)
    else:
        return -1

arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
target = 5
print("Index of 5 in array:", binary_search(arr, 0, len(arr) - 1, target))  # Output: 4
