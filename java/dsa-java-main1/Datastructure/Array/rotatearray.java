package Array;

import java.util.Arrays;

public class rotatearray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 3; // No. of rotations

        System.out.println("Given array is ");
        System.out.println(Arrays.toString(arr));

        // Method 1: Using Extra Space (Time: O(n), Space: O(k))
        int[] rotated1 = rotateWithExtraSpace(arr, k);
        System.out.println("\nRotated array using extra space: ");
        System.out.println(Arrays.toString(rotated1));

        // Method 2: Rotating in Place with Reversal (Time: O(n), Space: O(1))
        int[] rotated2 = rotateInPlaceWithReversal(arr, k);
        System.out.println("\nRotated array using reversal: ");
        System.out.println(Arrays.toString(rotated2));

        // Method 3: Rotating in Place with Juggling Algorithm (Time: O(n), Space: O(1))
        int[] rotated3 = rotateInPlaceWithJuggling(arr, k);
        System.out.println("\nRotated array using juggling algorithm: ");
        System.out.println(Arrays.toString(rotated3));
    }

    // Method 1: Rotate using Extra Space
    public static int[] rotateWithExtraSpace(int[] arr, int k) {
        int n = arr.length;
        int[] rotated = new int[n];
        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = arr[i];
        }
        return rotated;
    }

    // Method 2: Rotate in Place with Reversal
    public static int[] rotateInPlaceWithReversal(int[] arr, int k) {
        int n = arr.length;
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
        return arr;
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Method 3: Rotate in Place with Juggling Algorithm
    public static int[] rotateInPlaceWithJuggling(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int gcd = gcd(n, k);
        for (int i = 0; i < gcd; i++) {
            int temp = arr[i];
            int j = i;
            while (true) {
                int d = j + k;
                if (d >= n)
                    d -= n;
                if (d == i)
                    break;
                arr[j] = arr[d];
                j = d;
            }
            arr[j] = temp;
        }
        return arr;
    }

    private static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
