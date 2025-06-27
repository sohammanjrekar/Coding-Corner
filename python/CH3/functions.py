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