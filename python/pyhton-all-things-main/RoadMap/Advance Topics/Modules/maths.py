import math

# Constants
print("Value of Pi:", math.pi)
print("Value of Euler's number:", math.e)

# Basic math functions
x = 5
y = 7
print("Sum of", x, "and", y, "is", sum([x, y]))  # Using built-in sum function
print("Difference between", x, "and", y, "is", y - x)  # Difference calculation
print("Product of", x, "and", y, "is", x * y)  # Product calculation
print("Quotient of", x, "and", y, "is", y / x)  # Quotient calculation
print("Remainder when", x, "is divided by", y, "is", y % x)  # Remainder calculation
print("Absolute value of", y - x, "is", abs(y - x))  # Absolute value calculation

# Exponential and logarithmic functions
print("e^2 (Exponential):", math.exp(2))
print("log(10) (Natural logarithm):", math.log(10))
print("log10(100) (Base-10 logarithm):", math.log10(100))

# Trigonometric functions
angle_rad = math.pi / 4
print("sin(pi/4):", math.sin(angle_rad))
print("cos(pi/4):", math.cos(angle_rad))
print("tan(pi/4):", math.tan(angle_rad))
print("arcsin(1/sqrt(2)):", math.asin(1 / math.sqrt(2)))
print("arccos(1/sqrt(2)):", math.acos(1 / math.sqrt(2)))
print("arctan(1):", math.atan(1))

# Angular conversion
degrees = 45
radians = math.radians(degrees)
print(degrees, "degrees in radians:", radians)
print(radians, "radians in degrees:", math.degrees(radians))

# Power and square root
base = 2
exponent = 3
print(base, "raised to the power of", exponent, ":", math.pow(base, exponent))
print("Square root of", base, ":", math.sqrt(base))

# Hyperbolic functions
print("sinh(0):", math.sinh(0))
print("cosh(0):", math.cosh(0))
print("tanh(0):", math.tanh(0))

# Special functions
print("Factorial of 5:", math.factorial(5))
print("Gamma function of 5:", math.gamma(5))
print("Error function of 0:", math.erf(0))
