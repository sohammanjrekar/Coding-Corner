# Creating a list
my_list = [1, 2, 3, 4, 5]

# Accessing elements
print("Accessing elements:")
print(my_list[0])  # Output: 1 (Accessing element at index 0)
print(my_list[-1])  # Output: 5 (Accessing last element)

# Slicing
print("\nSlicing:")
print(my_list[1:3])  # Output: [2, 3] (Slicing from index 1 to 2)
print(my_list[:3])  # Output: [1, 2, 3] (Slicing from the beginning to index 2)
print(my_list[3:])  # Output: [4, 5] (Slicing from index 3 to the end)
print(my_list[:])  # Output: [1, 2, 3, 4, 5] (Slicing the entire list)

# Appending
print("\nAppending:")
my_list.append(6)
print(my_list)  # Output: [1, 2, 3, 4, 5, 6] (Appending 6 to the end)

# Extending
print("\nExtending:")
my_list.extend([7, 8, 9])
print(my_list)  # Output: [1, 2, 3, 4, 5, 6, 7, 8, 9] (Extending with [7, 8, 9])

# Inserting
print("\nInserting:")
my_list.insert(3, 10)
print(my_list)  # Output: [1, 2, 3, 10, 4, 5, 6, 7, 8, 9] (Inserting 10 at index 3)

# Removing
print("\nRemoving:")
my_list.remove(5)
print(my_list)  # Output: [1, 2, 3, 10, 4, 6, 7, 8, 9] (Removing the first occurrence of 5)

# Popping
print("\nPopping:")
popped_element = my_list.pop()
print(my_list)  # Output: [1, 2, 3, 10, 4, 6, 7, 8] (Popping the last element)
print("Popped element:", popped_element)  # Output: 9

# Clearing
print("\nClearing:")
my_list.clear()
print(my_list)  # Output: [] (Clearing the list)

# Count
print("\nCount:")
my_list = [1, 2, 3, 4, 1, 2, 1]
print(my_list.count(1))  # Output: 3 (Counting occurrences of 1)

# Index
print("\nIndex:")
print(my_list.index(3))  # Output: 2 (Index of the first occurrence of 3)

# Sorting
my_list.sort()
print("\nSorting:",my_list)

# Reversing
print("\nReversing:")
my_list.reverse()
print(my_list)  # Output: [4, 3, 2, 2, 1, 1, 1] (Reversing the list)
