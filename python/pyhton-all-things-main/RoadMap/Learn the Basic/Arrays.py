# Creating an array (list)
my_array = [1, 2, 3, 4, 5]

# Accessing elements
first_element = my_array[0]  # Access first element (indexing)
last_element = my_array[-1]  # Access last element (negative indexing)
print("First element:", first_element)
print("Last element:", last_element)

# Slicing
subset = my_array[1:4]  # Get a subset of elements
print("Subset:", subset)

# Appending an element
my_array.append(6)
print("Array after appending:", my_array)

# Inserting an element at a specific position
my_array.insert(2, 7)  # Insert 7 at index 2
print("Array after insertion:", my_array)

# Removing an element by value
my_array.remove(3)  # Remove the first occurrence of value 3
print("Array after removal:", my_array)

# Removing an element by index
removed_element = my_array.pop(1)  # Remove and return element at index 1
print("Removed element:", removed_element)
print("Array after pop:", my_array)

# Extending the array with elements from another iterable
my_array.extend([8, 9, 10])
print("Array after extension:", my_array)

# Reversing the elements
my_array.reverse()
print("Array after reversal:", my_array)

# Sorting the elements
my_array.sort()
print("Array after sorting:", my_array)

# Counting occurrences of a value
count = my_array.count(5)
print("Count of 5:", count)

# Finding the index of a value
index = my_array.index(4)
print("Index of 4:", index)

# Copying the array
copied_array = my_array.copy()
print("Copied array:", copied_array)

# Clearing the array
my_array.clear()
print("Array after clearing:", my_array)
