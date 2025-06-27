# function with recursion
def factorial(n):
    if n == 0 or n == 1:
        return 1
    else:
        return n * factorial(n - 1)
result_factorial = factorial(5)
print("Factorial result:", result_factorial)
# function with recursion and memoization
def factorial_memo(n, memo={}):
    if n in memo:
        return memo[n]
    if n == 0 or n == 1:
        return 1
    else:
        memo[n] = n * factorial_memo(n - 1, memo)
        return memo[n]
result_factorial_memo = factorial_memo(5)
print("Factorial result with memoization:", result_factorial_memo)