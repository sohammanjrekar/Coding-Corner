package Array;

import java.util.Arrays;
import java.util.HashMap;

public class FindMissingAndRepeatingNumber {
    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 1, 1};
        Arrays.sort(arr); // Sorting the array
        int n = arr.length;
        int repeating = -1; // Initialize repeating number
        int missing = -1; // Initialize missing number

        // Method 1: Using sorting
        // Traverse the array to find the repeating number
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                repeating = arr[i];
                break;
            }
        }

        // Traverse from 1 to n to find the missing number
        for (int i = 1; i <= n; i++) {
            boolean found = false;
            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                missing = i;
                break;
            }
        }

        System.out.println("Method 1 - Sorting:");
        System.out.println("Repeating Number : " + repeating);
        System.out.println("Missing Number : " + missing);

        // Method 2: Using HashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                repeating = arr[i];
            } else {
                map.put(arr[i], 1);
            }
        }

        for (int i = 1; i <= n; i++) {
            if (!map.containsKey(i)) {
                missing = i;
                break;
            }
        }

        System.out.println("Method 2 - HashMap:");
        System.out.println("Repeating Number : " + repeating);
        System.out.println("Missing Number : " + missing);

        // Method 3: Using sum formulas
        int sumN = n * (n + 1) / 2;
        int sumNSq = n * (n + 1) * (2 * n + 1) / 6;
        int sum = 0;
        int sumSq = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            sumSq += arr[i] * arr[i];
        }

        int sumDiff = sumN - sum;
        int sumSqDiff = sumNSq - sumSq;

        missing = (sumDiff + sumSqDiff / sumDiff) / 2;
        repeating = missing - sumDiff;

        System.out.println("Method 3 - Sum formulas:");
        System.out.println("Repeating Number : " + repeating);
        System.out.println("Missing Number : " + missing);

        // Method 4: Using XOR
        repeating = -1; // Reset repeating number
        missing = -1; // Reset missing number
        int xor = 0;

        for (int i = 0; i < n; i++) {
            xor ^= arr[i];
        }

        for (int i = 1; i <= n; i++) {
            xor ^= i;
        }

        int setBit = xor & ~(xor - 1);
        int x = 0, y = 0;

        for (int i = 0; i < n; i++) {
            if ((arr[i] & setBit) != 0) {
                x ^= arr[i];
            } else {
                y ^= arr[i];
            }
        }

        for (int i = 1; i <= n; i++) {
            if ((i & setBit) != 0) {
                x ^= i;
            } else {
                y ^= i;
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                repeating = x;
                missing = y;
                break;
            } else if (arr[i] == y) {
                repeating = y;
                missing = x;
                break;
            }
        }

        System.out.println("Method 4 - XOR:");
        System.out.println("Repeating Number : " + repeating);
        System.out.println("Missing Number : " + missing);
    }
}
