package Array;

import java.util.Arrays;

class insert {
    public static void main(String[] args) {
        // Initialize an array with a capacity of 10
        int[] arr = new int[10];
        // Insert initial elements into the array
        arr[0] = 12;
        arr[1] = 16;
        arr[2] = 20;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 70;
        
        // Capacity of the array
        int capacity = arr.length;
        // Current number of elements in the array
        int n = 6;
        // Key to be inserted at the end
        int key = 500;
        
        // Insert the key at the last position if there is enough capacity
        if (n < capacity) {
            arr[n] = key;
            n++; // Increment the number of elements after insertion
        }
        
        // Insert at any position with shift
        int pos = 3; // Position where the target should be inserted
        int target = 1000;
        
        // Shift elements to the right to make space for the new element
        for (int i = capacity - 1; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        // Insert the target at the specified position
        arr[pos] = target;
        
        // Print the array after insertion
        System.out.println(Arrays.toString(arr));
    }
}

/*
Time Complexity:
- Insertion at the end: O(1), as it directly inserts the element without shifting.
- Insertion at any position with shift: O(n), where n is the number of elements to be shifted. In the worst case, this would be O(capacity) when inserting at the beginning.

Space Complexity:
- O(1), as the operations are performed in-place without using any extra space apart from a few variables.

Possible Optimizations:
- If frequent insertions and deletions are needed, consider using a dynamic data structure such as an ArrayList, which can handle such operations more efficiently.
- The current implementation is efficient for small fixed-size arrays but might not be suitable for large dynamic datasets.
*/
