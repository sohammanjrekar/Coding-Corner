package Array;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] matrix = { { 4, 5 }, { 34, 67 }, { 8, 9 } };

        // Method to iterate and print elements of a 2D array
        print2DArray(matrix);
    }

    /**
     * Method to print elements of a 2D array along with their indices.
     * Time Complexity: O(n * m) where n is the number of rows and m is the number of columns in the matrix.
     * Space Complexity: O(1) - Only constant space used for variables.
     */
    public static void print2DArray(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length; // Assuming all rows have the same number of columns

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("matrix[" + i + "][" + j + "] = " + matrix[i][j]);
            }
        }
    }
}
