# Creating a tuple
my_tuple = (1, 2, 3, 4, 5)

# Accessing elements
print("Accessing elements:")
print(my_tuple[0])  # Output: 1 (Accessing element at index 0)
print(my_tuple[-1])  # Output: 5 (Accessing last element)

# Slicing
print("\nSlicing:")
print(my_tuple[1:3])  # Output: (2, 3) (Slicing from index 1 to 2)
print(my_tuple[:3])  # Output: (1, 2, 3) (Slicing from the beginning to index 2)
print(my_tuple[3:])  # Output: (4, 5) (Slicing from index 3 to the end)
print(my_tuple[:])  # Output: (1, 2, 3, 4, 5) (Slicing the entire tuple)

# Length
print("\nLength:")
print(len(my_tuple))  # Output: 5 (Length of the tuple)

# Concatenation
print("\nConcatenation:")
another_tuple = (6, 7, 8)
concatenated_tuple = my_tuple + another_tuple
print(concatenated_tuple)  # Output: (1, 2, 3, 4, 5, 6, 7, 8) (Concatenation of tuples)

# Repetition
print("\nRepetition:")
repeated_tuple = my_tuple * 2
print(repeated_tuple)  # Output: (1, 2, 3, 4, 5, 1, 2, 3, 4, 5) (Repetition of the tuple)

# Membership
print("\nMembership:")
print(3 in my_tuple)  # Output: True (Checking if 3 is in the tuple)
print(6 in my_tuple)  # Output: False (Checking if 6 is in the tuple)

# Count
print("\nCount:")
my_tuple = (1, 2, 3, 4, 1, 2, 1)
print(my_tuple.count(1))  # Output: 3 (Counting occurrences of 1)

# Index
print("\nIndex:")
print(my_tuple.index(3))  # Output: 2 (Index of the first occurrence of 3)
