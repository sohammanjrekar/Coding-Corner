package Algorithms.Bitwisealgo;

public class CheckNumIsPowerOf2 {
    public static void main(String[] args) {
        int n = 16; // Initialize n with the value 12
        // Check if n is a power of 2 and print the appropriate message
        if (isPowerOf2(n)) {
            System.out.println("Number is a power of 2"); // If true, print this message
        } else {
            System.out.println("Number is not a power of 2"); // If false, print this message
        }
    }

    // Method to check if a number is a power of 2
    public static boolean isPowerOf2(int n) {
        // Check if n is greater than 0 and if n has exactly one bit set
        return n > 0 && (n & (n - 1)) == 0;
    }
}
