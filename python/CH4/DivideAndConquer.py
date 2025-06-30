# Divide and Conquer algorithm to find the maximum element in an array
def find_max(arr, left, right):
    if left == right:
        return arr[left]
    mid = (left + right) // 2
    max_left = find_max(arr, left, mid)
    max_right = find_max(arr, mid + 1, right)
    return max(max_left, max_right)
# Example usage
if __name__ == "__main__":
    arr = [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5]
    max_element = find_max(arr, 0, len(arr) - 1)
    print("Maximum element in the array:", max_element)
# This code implements a Divide and Conquer algorithm to find the maximum element in an array.

# Binary Search algorithm to find an element in a sorted array
def binary_search(arr, left, right, target):
    if left > right:
        return -1  # Element not found
    mid = (left + right) // 2
    if arr[mid] == target:
        return mid  # Element found
    elif arr[mid] < target:
        return binary_search(arr, mid + 1, right, target)
    else:
        return binary_search(arr, left, mid - 1, target)
# Example usage
if __name__ == "__main__":
    arr = [1, 2, 3, 4, 5, 6, 7, 8, 9]
    target = 5
    index = binary_search(arr, 0, len(arr) - 1, target)
    if index != -1:
        print(f"Element {target} found at index {index}.")
    else:
        print(f"Element {target} not found in the array.")
        