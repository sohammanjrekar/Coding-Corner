package Algorithms.Bitwisealgo;

public class countSetBit {
    public static void main(String[] args) {
        int n = 12; // Initialize n with the value 12
        int count = countset(n); // Call the method to count set bits and store the result
        System.out.println("Number of set bits: " + count); // Print the result
    }

    // Method to count the number of set bits in an integer
    public static int countset(int n) {
        int count = 0; // Initialize count of set bits

        // Loop until all bits are processed
        while (n > 0) {
            // Increment count if the least significant bit is 1
            count += n & 1;
            // Right shift n by 1 to process the next bit
            n >>= 1;
        }

        return count; // Return the count of set bits
    }
}
