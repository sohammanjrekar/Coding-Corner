# Matrix (2D array) 
# A matrix is a 2D array, and we can perform various operations on it similar to a 2D array.
matrix = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]
# Accessing elements
print(matrix[0][0])  # Output: 1
print(matrix[1][1])  # Output: 5
print(matrix[2][2])  # Output: 9
# Slicing
print(matrix[0][1:3])  # Output: [2, 3]
# Length
print(len(matrix))  # Output: 3
print(len(matrix[0]))  # Output: 3
# Adding elements
matrix[0].append(4)  # Adding an element to the first row
print(matrix)  # Output: [[1, 2, 3, 4], [4, 5, 6], [7, 8, 9]]
# Inserting elements
matrix[1].insert(0, 0)  # Inserting an element at the beginning of the second row
print(matrix)  # Output: [[1, 2, 3, 4], [0, 4, 5, 6], [7, 8, 9]]
# Removing elements
matrix[2].remove(8)  # Removing the first occurrence of 8 from the third row
print(matrix)  # Output: [[1, 2, 3, 4], [0, 4, 5, 6], [7, 9]]
# Popping elements
popped_element = matrix[0].pop()  # Removing and returning the last element of the first row
print("Popped Element:", popped_element)  # Output: 4
print(matrix)  # Output: [[1, 2, 3], [0, 4, 5, 6], [7, 9]]
# Popping an element at a specific index
popped_element = matrix[1].pop(1)  # Removing and returning the element at index 1 of the second row
print("Popped Element:", popped_element)  # Output: 4
print(matrix)  # Output: [[1, 2, 3], [0, 5, 6], [7, 9]]
# Checking membership
print(2 in matrix[0])  # Checking if 2 is in the first row
print(5 in matrix[1])  # Checking if 5 is in the second row
# Iterating through the 2D array
for row in matrix:
    for elem in row:
        print(elem, end=" ")
    print()  # Output: 1 2 3
# Output: 0 5 6
# Output: 7 9
# Sorting the rows of the 2D array
for row in matrix:
    row.sort()
print(matrix)  # Output: [[1, 2, 3], [0, 5, 6], [7, 9]]