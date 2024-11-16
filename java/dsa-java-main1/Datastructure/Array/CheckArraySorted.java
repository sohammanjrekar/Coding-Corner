package Array;

public class CheckArraySorted {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 5, 4, 2, 5, 1, 3};

        // Method 1: Iterative approach
        boolean sorted = checkSortedIterative(arr);
        System.out.println("Array is sorted in non-decreasing order (Iterative): " + sorted);

        // Method 2: Recursive approach
        boolean sortedRecursive = checkSortedRecursive(arr, arr.length);
        System.out.println("Array is sorted in non-decreasing order (Recursive): " + sortedRecursive);
    }

    /**
     * Method 1: Iterative approach to check if array is sorted.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static boolean checkSortedIterative(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Method 2: Recursive approach to check if array is sorted.
     * Time Complexity: O(n)
     * Space Complexity: O(n), due to recursive stack space in worst case (if not tail-optimized)
     */
    public static boolean checkSortedRecursive(int[] arr, int n) {
        if (n == 1) {
            return true;
        }
        return arr[n - 1] >= arr[n - 2] && checkSortedRecursive(arr, n - 1);
    }
}
