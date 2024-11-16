# String concatenation
str1 = "Hello"
str2 = "World"
concatenated_str = str1 + ", " + str2
print("Concatenated string:", concatenated_str)

# String interpolation (using f-strings)
name = "Alice"
age = 30
interpolated_str = f"My name is {name} and I am {age} years old."
print("Interpolated string:", interpolated_str)

# String formatting (using format method)
formatted_str = "My name is {} and I am {} years old.".format(name, age)
print("Formatted string:", formatted_str)

# Accessing characters in a string
first_char = concatenated_str[0]
last_char = concatenated_str[-1]
print("First character:", first_char)
print("Last character:", last_char)

# String slicing
substring = concatenated_str[6:11]
print("Substring:", substring)

# String length
str_length = len(concatenated_str)
print("String length:", str_length)

# String splitting
split_str = concatenated_str.split(", ")
print("Split string:", split_str)

# String stripping (removing leading and trailing whitespace)
whitespace_str = "   Example String   "
stripped_str = whitespace_str.strip()
print("Stripped string:", stripped_str)

# String case conversion
upper_str = concatenated_str.upper()
lower_str = concatenated_str.lower()
print("Uppercase string:", upper_str)
print("Lowercase string:", lower_str)

# String replacement
replaced_str = concatenated_str.replace("Hello", "Bonjour")
print("Replaced string:", replaced_str)

# String searching
search_str = "lo"
index = concatenated_str.find(search_str)
print("Index of '{}' in '{}':".format(search_str, concatenated_str), index)

# String counting
count = concatenated_str.count("l")
print("Count of 'l' in '{}':".format(concatenated_str), count)

original_str = "Hello, world!"
# String character classification
isalnum_result = original_str.isalnum()  # Returns True if all characters are alphanumeric
isalpha_result = original_str.isalpha()  # Returns True if all characters are alphabetic
isdecimal_result = original_str.isdecimal()  # Returns True if all characters are decimals
isdigit_result = original_str.isdigit()  # Returns True if all characters are digits
isspace_result = original_str.isspace()  # Returns True if all characters are whitespace
islower_result = original_str.islower()  # Returns True if all characters are lowercase
isupper_result = original_str.isupper()  # Returns True if all characters are uppercase

print("isalnum:", isalnum_result)
print("isalpha:", isalpha_result)
print("isdecimal:", isdecimal_result)
print("isdigit:", isdigit_result)
print("isspace:", isspace_result)
print("islower:", islower_result)
print("isupper:", isupper_result)
