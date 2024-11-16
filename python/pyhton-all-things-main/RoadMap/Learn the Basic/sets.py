# Creating a set
my_set = {1, 2, 3, 4, 5}

# Adding elements
print("Adding elements:")
my_set.add(6)
print(my_set)  # Output: {1, 2, 3, 4, 5, 6} (Adding element 6 to the set)

# Removing elements
print("\nRemoving elements:")
my_set.remove(3)
print(my_set)  # Output: {1, 2, 4, 5, 6} (Removing element 3 from the set)

# Discarding elements
my_set.discard(2)
print(my_set)  # Output: {1, 4, 5, 6} (Discarding element 2 from the set)

# Pop an element
popped_element = my_set.pop()
print("\nPopped element:", popped_element)  # Output: Popped element: 1 (Pop an arbitrary element from the set)

# Clearing the set
print("\nClearing the set:")
my_set.clear()
print(my_set)  # Output: set() (Clearing all elements from the set)

# Creating another set
another_set = {4, 5, 6, 7, 8}

# Union
print("\nUnion:")
union_set = my_set.union(another_set)
print(union_set)  # Output: {4, 5, 6, 7, 8} (Union of two sets)

# Intersection
print("\nIntersection:")
intersection_set = my_set.intersection(another_set)
print(intersection_set)  # Output: set() (Intersection of two sets)

# Difference
print("\nDifference:")
difference_set = my_set.difference(another_set)
print(difference_set)  # Output: set() (Difference of two sets)

# Symmetric difference
print("\nSymmetric difference:")
symmetric_difference_set = my_set.symmetric_difference(another_set)
print(symmetric_difference_set)  # Output: {4, 5, 6, 7, 8} (Symmetric difference of two sets)
