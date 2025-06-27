# strings and therir operation and slicing
# strings are immutable sequences of characters in Python.
# Strings in Python are immutable sequences of characters, meaning they cannot be changed after creation.
# String declaration
s = "Hello World"
# String length
print("Length of string:", len(s)) # 11 
# String iteration
for char in s:
    print(char, end=' ')  # H e l l o   W o r l d
# String indexing
print("First character:", s[0])  # H
print("Last character:", s[-1])  # d        
# String slicing
print("First five characters:", s[:5])  # Hello
print("Last five characters:", s[-5:])  # World
# String concatenation
s2 = " Welcome!"
s3 = s + s2
print("Concatenated string:", s3)   # Hello World Welcome!
# String repetition
s4 = s * 2
print("Repeated string:", s4)  # Hello WorldHello World
# String methods
print("Uppercase:", s.upper())  # HELLO WORLD
print("Lowercase:", s.lower())  # hello world
print("Title case:", s.title())  # Hello World
print("Count of 'o':", s.count('o'))  # 2
print("Find 'World':", s.find('World'))  # 6    
# String replacement
print("Replace 'World' with 'Python':", s.replace('World', 'Python'))  # Hello Python
# String splitting
print("Split string:", s.split())  # ['Hello', 'World']
# String joining
print("Join with '-':", '-'.join(s.split()))  # Hello-World
# String formatting
name = "Alice"
age = 30
print(f"My name is {name} and I am {age} years old.")

# String comparison
str1 = "apple"
str2 = "banana"
print("String 1 is less than String 2:", str1 < str2)  # True   
# String membership
print("Is 'Hello' in string?", 'Hello' in s)  # True
# String immutability
try:
    s[0] = 'h'  # This will raise an error because strings are immutable
except TypeError as e:
    print("Error:", e)
# String escape characters
print("String with escape characters:", "Hello\nWorld\t!")
# String formatting with escape characters
print("Formatted string with escape characters: %s\n%s" % ("Hello", "World"))
precedence_b = 5
# Precedence example
print("Expression:", 10 + 20 * 30)  # 610
# Output: 610
print("Expression with parentheses:", (10 + 20) * 30)  # 900
# Output: 900   
# String comparison
print("String comparison:", "apple" < "banana")  # True
# Output: True
# String membership
print("Is 'Hello' in string?", 'Hello' in s)  # True    

# Output: True

# string formatting
txt="For only {price:.2f} dollars!"
price = 49.99
print("Formatted string: {}".format(txt))  # For only 49.99 dollars!

# docstring
def example_function():
    """
    This is a docstring for the example_function.
    It explains what the function does.
    """
    pass

# Accessing the docstring
print("Docstring of example_function:", example_function.__doc__)