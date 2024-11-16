package Array;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        int[] arr = {102, 4, 100, 1, 101, 3, 2, 1, 1};

        System.out.println("Using Two Pointers: " + twoPointer(arr));
        System.out.println("Using Sorting: " + sort(arr));
        System.out.println("Using Set: " + setUse(arr));
    }

    // Method 1: Using Two Pointers (Brute Force)
    public static int twoPointer(int[] arr) {
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            int length = 1;
            int current = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == current + 1) {
                    length++;
                    current++;
                    j = -1; // Restart the inner loop to find the next consecutive number
                }
            }
            maxLength = Math.max(maxLength, length);
        }
        return maxLength;
    }

    // Method 2: Using Sorting
    public static int sort(int[] arr) {
        if (arr.length == 0) return 0;

        Arrays.sort(arr);
        int maxLength = 1;
        int length = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                length++;
            } else if (arr[i] != arr[i - 1]) {
                length = 1;
            }
            maxLength = Math.max(maxLength, length);
        }
        return maxLength;
    }

    // Method 3: Using Set
    public static int setUse(int[] arr) {
        if (arr.length == 0) return 0;

        HashSet<Integer> numSet = new HashSet<>();
        for (int num : arr) {
            numSet.add(num);
        }

        int maxLength = 0;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int length = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    length++;
                }
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }
}

/*
Time Complexities:
1. Two Pointers (Brute Force): O(n^2) because for each element, we potentially traverse the array again.
2. Sorting: O(n log n) due to the sorting step, followed by a single pass through the array.
3. Set: O(n) because we traverse the array twice, once to fill the set and once to find the sequences.

Space Complexities:
1. Two Pointers (Brute Force): O(1) as no extra space is used.
2. Sorting: O(1) for the algorithm itself, but the sorting function may use O(log n) space.
3. Set: O(n) due to the space used by the HashSet.
*/
