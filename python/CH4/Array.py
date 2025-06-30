myArray = [1, 2, 3, 4, 5]
print(myArray)
# Accessing elements
print(myArray[0])  # First element
# slicing
print(myArray[1:3])  # Elements from index 1 to 2 (excluding index 3)
# length
print(len(myArray))  # Length of the array
# Adding elements
myArray.append(6)  # Adding an element to the end
print(myArray)
# Inserting elements
myArray.insert(0, 0)  # Inserting an element at index 0
print(myArray)
# Removing elements
myArray.remove(3)  # Removing the first occurrence of 3
print(myArray)
# Popping elements
popped_element = myArray.pop()  # Removing and returning the last element
print(popped_element)
print(myArray)
# Popping an element at a specific index
popped_element_at_index = myArray.pop(0)  # Removing and returning the element at index 0
print(popped_element_at_index)
print(myArray)
# Checking membership
print(0 in myArray)  # Checking if 0 is in the array
print(3 in myArray)  # Checking if 3 is in the array
# Iterating through the array
for element in myArray:
    print(element)  # Printing each element in the array
# Sorting the array
myArray.sort()  # Sorting the array in ascending order
print(myArray)
# Reversing the array
myArray.reverse()
print(myArray)
# Copying the array
myArrayCopy = myArray.copy()  # Creating a shallow copy of the array
print(myArrayCopy)
# Clearing the array
myArray.clear()  # Removing all elements from the array
print(myArray)  # Should print an empty array
# Concatenating arrays
myArray1 = [1, 2, 3]
myArray2 = [4, 5, 6]
myArray3 = myArray1 + myArray2  # Concatenating two arrays
print(myArray3)
# Repeating arrays
myArray4 = myArray1 * 2  # Repeating the array twice
print(myArray4)
# Finding the index of an element
index_of_2 = myArray1.index(2)  # Finding the index of the element 2
print(index_of_2)  # Should print 1
# Counting occurrences of an element
count_of_1 = myArray1.count(1)  # Counting how many times 1 appears in the array
print(count_of_1)  # Should print 1

# import array module
import array    
# Creating an array of integers
int_array = array.array('i', [1, 2, 3, 4, 5])
print(int_array)
# Accessing elements
print(int_array[0])  # First element
# Slicing
print(int_array[1:3])  # Elements from index 1 to 2 (excluding index 3)
# Length
print(len(int_array))  # Length of the array
# Adding elements
int_array.append(6)  # Adding an element to the end
print(int_array)    
# Inserting elements
int_array.insert(0, 0)  # Inserting an element at index 0
print(int_array)
# Removing elements
int_array.remove(3)  # Removing the first occurrence of 3
print(int_array)
# Popping elements
popped_element = int_array.pop()  # Removing and returning the last element
print("Popped Element:", popped_element)
print(int_array)
# Popping an element at a specific index
popped_element_at_index = int_array.pop(0)  # Removing and returning the element at index 0
print("Popped Element at Index 0:", popped_element_at_index)
print(int_array)
# Checking membership
print(0 in int_array)  # Checking if 0 is in the array
print(3 in int_array)  # Checking if 3 is in the array
# Iterating through the array
for element in int_array:
    print("Element:", element)  # Printing each element in the array
# Sorting the array
int_array = array.array('i', sorted(int_array))  # Sorting the array in ascending           
# order
print("Sorted Array:", int_array)
# Reversing the array
int_array.reverse()
print("Reversed Array:", int_array)
# Copying the array
int_array_copy = int_array.copy()  # Creating a shallow copy of the array
print("Copied Array:", int_array_copy)
# Clearing the array
int_array.clear()  # Removing all elements from the array
print("Cleared Array:", int_array)
# Concatenating arrays
int_array1 = array.array('i', [1, 2, 3])
int_array2 = array.array('i', [4, 5, 6])
int_array3 = int_array1 + int_array2  # Concatenating two arrays
print("Concatenated Array:", int_array3)
# Repeating arrays
int_array4 = int_array1 * 2  # Repeating the array twice
print("Repeated Array:", int_array4)
# Finding the index of an element
index_of_2 = int_array1.index(2)  # Finding the index of the
