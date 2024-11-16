package Array;

public class PascalTriangle {
    // time complexity: O(n^2)
    // space complexity: O(1)
    public static void main(String[] args) {
        int n = 6;  // Number of rows in Pascal's Triangle

        for (int row = 0; row < n; row++) {  // Outer loop for each row
            // Print leading spaces for alignment
            for (int col = 0; col < n - row - 1; col++) {
                System.out.print(" ");
            }
            int number = 1;  // Initialize the first number in the row to 1
            for (int col = 0; col <= row; col++) {  // Inner loop for each element in the row
                System.out.print(number + " ");  // Print the current number
                number = number * (row - col) / (col + 1);  // Calculate the next number in the row
            }
            System.out.println();  // Move to the next line after printing each row
        }
    }
}
