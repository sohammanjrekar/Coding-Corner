# Creating a dictionary
my_dict = {'a': 1, 'b': 2, 'c': 3}

# Accessing elements
print("Accessing elements:")
print(my_dict['a'])  # Output: 1 (Accessing value associated with key 'a')

# Adding or updating elements
print("\nAdding or updating elements:")
my_dict['d'] = 4
print(my_dict)  # Output: {'a': 1, 'b': 2, 'c': 3, 'd': 4} (Adding element with key 'd')
my_dict['a'] = 10
print(my_dict)  # Output: {'a': 10, 'b': 2, 'c': 3, 'd': 4} (Updating value associated with key 'a')

# Removing elements
print("\nRemoving elements:")
removed_value = my_dict.pop('b')
print(my_dict)  # Output: {'a': 10, 'c': 3, 'd': 4} (Removing element with key 'b')
print("Removed value:", removed_value)  # Output: 2 (Value associated with removed key 'b')

# Clearing the dictionary
print("\nClearing the dictionary:")
my_dict.clear()
print(my_dict)  # Output: {} (Clearing all elements from the dictionary)

# Creating another dictionary
another_dict = {'c': 30, 'd': 40, 'e': 50}

# Copying dictionary
print("\nCopying dictionary:")
copied_dict = another_dict.copy()
print(copied_dict)  # Output: {'c': 30, 'd': 40, 'e': 50} (Creating a shallow copy of the dictionary)

# Merging dictionaries
print("\nMerging dictionaries:")
my_dict.update(another_dict)
print(my_dict)  # Output: {'c': 30, 'd': 40, 'e': 50} (Merging 'another_dict' into 'my_dict')

# Getting keys and values
print("\nGetting keys and values:")
print(my_dict.keys())  # Output: dict_keys(['c', 'd', 'e']) (Getting keys)
print(my_dict.values())  # Output: dict_values([30, 40, 50]) (Getting values)
print(my_dict.items())  # Output: dict_items([('c', 30), ('d', 40), ('e', 50)]) (Getting key-value pairs)
