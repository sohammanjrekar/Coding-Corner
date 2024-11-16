package Array;

public class DutchNationalFlag {

    // Utility function to print the contents of an array
    static void printArr(int arr[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    // Function to sort the array of 0s, 1s, and 2s using counting method
    static void sortArr(int arr[], int n) {
        // Initialize counters for 0s, 1s, and 2s
        int i, cnt0 = 0, cnt1 = 0, cnt2 = 0;

        // Count the number of 0s, 1s, and 2s in the array
        for (i = 0; i < n; i++) {
            switch (arr[i]) {
                case 0:
                    cnt0++;
                    break;
                case 1:
                    cnt1++;
                    break;
                case 2:
                    cnt2++;
                    break;
            }
        }

        // Update the array with the counted values
        i = 0;

        // Store all the 0s at the beginning
        while (cnt0 > 0) {
            arr[i++] = 0;
            cnt0--;
        }

        // Store all the 1s next
        while (cnt1 > 0) {
            arr[i++] = 1;
            cnt1--;
        }

        // Store all the 2s at the end
        while (cnt2 > 0) {
            arr[i++] = 2;
            cnt2--;
        }

        // Print the sorted array
        printArr(arr, n);
    }

    // Dutch National Flag algorithm to sort the array of 0s, 1s, and 2s in-place
    static void dutchNationalFlag(int arr[], int n) {
        int low = 0, mid = 0, high = n - 1;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    // Swap arr[low] and arr[mid], increment low and mid
                    int temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    // If the element is 1, just move mid pointer
                    mid++;
                    break;
                case 2:
                    // Swap arr[mid] and arr[high], decrement high
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
            }
        }
    }

    // Driver code
    public static void main(String[] args) {
        // Initialize an array with 0s, 1s, and 2s
        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        int n = arr.length; // Get the length of the array

        // Sorting using counting method
        System.out.print("Sorted array using counting method: ");
        sortArr(arr, n);
        System.out.println();

        // Restore the array to its original state for Dutch National Flag algorithm
        int arr2[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        System.out.print("Original array: ");
        printArr(arr2, n);
        System.out.println();

        // Sorting using Dutch National Flag algorithm
        dutchNationalFlag(arr2, n);
        System.out.print("Sorted array using Dutch National Flag algorithm: ");
        printArr(arr2, n);
        System.out.println();
    }
}

/*
Time Complexity:
- For both methods (counting and Dutch National Flag algorithm), the time complexity is O(n), where n is the length of the array.
  This is because both methods involve iterating through the array once.

Space Complexity:
- The space complexity is O(1) for both methods because they use only a constant amount of extra space (for counters in the counting method and for temporary variables in the Dutch National Flag algorithm).

Possible Optimizations:
- Both methods are optimal in terms of time and space complexity for sorting arrays of 0s, 1s, and 2s.
- The Dutch National Flag algorithm performs the sorting in a single pass through the array, making it more efficient than the counting method, especially for large arrays.
*/
