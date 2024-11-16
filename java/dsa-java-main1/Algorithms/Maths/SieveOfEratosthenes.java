package Maths;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 50; // Define the upper limit to find prime numbers up to 50.
        int[] prime = new int[n + 1]; // Create an array to mark prime numbers, initialized to 0 by default.

        // Initialize all numbers as prime (1).
        for (int i = 2; i <= n; i++) {
            prime[i] = 1; // Assume all numbers from 2 to n are prime.
        }

        // Sieve of Eratosthenes algorithm to mark non-prime numbers.
        for (int i = 2; i * i <= n; i++) { // Only go up to the square root of n.
            if (prime[i] == 1) { // Check if i is a prime number.
                for (int j = i * i; j <= n; j += i) { // Mark all multiples of i as non-prime.
                    prime[j] = 0; // Mark j as non-prime.
                }
            }
        }

        // Print all prime numbers.
        for (int i = 2; i <= n; i++) {
            if (prime[i] == 1) System.out.println(i); // Print i if it is a prime number.
        }
    }
}

/*
Time Complexity: O(n log log n)
- The outer loop runs approximately sqrt(n) times.
- The inner loop runs n/i times for each prime i, leading to the harmonic series, which sums to log log n.

Space Complexity: O(n)
- An additional array of size n is used.
*/
