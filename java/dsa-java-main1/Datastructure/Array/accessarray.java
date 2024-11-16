package Array;

public class accessarray {
    public static void main(String[] args) {
        // Initialize an array with four integer elements
        int arr[] = { 1, 5, 3, 4 };

        // Modify the elements of the array
        arr[0] = 45; // Set the first element to 45
        arr[1] = 82; // Set the second element to 82
        arr[2] = 76; // Set the third element to 76

        // Print the third element of the array (which is now 76)
        System.out.println(arr[2]);
    }
}

/*
Time Complexity: 
The time complexity of accessing and modifying array elements is O(1) (constant time) because array indices allow direct access to any element.

Space Complexity: 
The space complexity is O(n) where n is the number of elements in the array. In this case, the array has 4 elements, so the space complexity is O(4), which simplifies to O(1) in Big-O notation because it is a constant space usage.

Possible Optimizations:
1. The current code is already optimal for accessing and modifying array elements. There are no further optimizations needed for such simple operations.
2. If there were more complex operations on the array, we could consider data structures or algorithms that fit the specific use case.
*/
