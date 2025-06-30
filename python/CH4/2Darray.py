# 2D Array
my2Darray= [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
# Accessing elements
print(my2Darray[0][0])  # Output: 1
print(my2Darray[1][1])  # Output: 5
print(my2Darray[2][2])  # Output: 9
# Slicing
print(my2Darray[0][1:3])  # Output: [2, 3]
# Length
print(len(my2Darray))  # Output: 3
print(len(my2Darray[0]))  # Output: 3
# Adding elements
my2Darray[0].append(4)  # Adding an element to the first row
print(my2Darray)  # Output: [[1, 2, 3, 4], [4, 5, 6], [7, 8, 9]]
# Inserting elements
my2Darray[1].insert(0, 0)  # Inserting an element at the beginning of the second row
print(my2Darray)  # Output: [[1, 2, 3, 4], [0, 4, 5, 6], [7, 8, 9]]     
# Removing elements
my2Darray[2].remove(8)  # Removing the first occurrence of 8 from the third row     
print(my2Darray)  # Output: [[1, 2, 3, 4], [0, 4, 5, 6], [7, 9]]
# Popping elements
popped_element = my2Darray[0].pop()  # Removing and returning the last element of the first row
print("Popped Element:", popped_element)  # Output: 4
print(my2Darray)  # Output: [[1, 2, 3], [0, 4, 5, 6], [7, 9]]
# Popping an element at a specific index
popped_element = my2Darray[1].pop(1)  # Removing and returning the element at index 1 of the second row
print("Popped Element:", popped_element)  # Output: 4
print(my2Darray)  # Output: [[1, 2, 3], [0, 5, 6], [7, 9]]
# Checking membership
print(2 in my2Darray[0])  # Checking if 2 is in the first row
print(5 in my2Darray[1])  # Checking if 5 is in the second row
# Iterating through the 2D array
for row in my2Darray:
    for elem in row:
        print(elem, end=" ")
    print()# Output: 1 2 3
# Output: 0 5 6
# Output: 7 9
# Sorting the rows of the 2D array
for row in my2Darray:
    row.sort()
print(my2Darray)  # Output: [[1, 2, 3], [0, 5, 6], [7, 9]]      