# Recursion example: Factorial
def factorial(n):
    if n == 0:
        return 1
    else:
        return n * factorial(n-1)

# Example usage
if __name__ == "__main__":
    num = 5
    print(f"Factorial of {num} is {factorial(num)}")
# This code implements a simple recursive function to calculate the factorial of a number.

# Fibonacci sequence using recursion
def fibonacci(n):
    if n <= 0:
        return 0
    elif n == 1:
        return 1
    else:
        return fibonacci(n - 1) + fibonacci(n - 2)
# Example usage
if __name__ == "__main__":
    n = 10
    fib_sequence = [fibonacci(i) for i in range(n)]
    print(f"Fibonacci sequence up to {n} terms: {fib_sequence}")