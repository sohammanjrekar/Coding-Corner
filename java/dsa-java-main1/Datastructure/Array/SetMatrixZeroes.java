// package Array;

// public class SetMatrixZeroes {
//     public static void main(String[] args) {
//         int[][] matrix = {
//             {1, 1, 1},
//             {1, 0, 1},
//             {1, 1, 1}
//         };

//         System.out.println("Original Matrix:");
//         printMatrix(matrix);

//         setZeroes(matrix);

//         System.out.println("Matrix after setting zeroes:");
//         printMatrix(matrix);
//     }

//     public static void setZeroes(int[][] matrix) {
//         int rows = matrix.length;
//         int cols = matrix[0].length;

//         // First pass: mark the rows and columns that need to be set to zero
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 if (matrix[i][j] == 0) {
//                     // Mark the corresponding row and column
//                     for (int k = 0; k < rows; k++) {
//                         if (matrix[k][j] != 0) {
//                             matrix[k][j] = -1;  // Use a marker
//                         }
//                     }
//                     for (int k = 0; k < cols; k++) {
//                         if (matrix[i][k] != 0) {
//                             matrix[i][k] = -1;  // Use a marker
//                         }
//                     }
//                 }
//             }
//         }

//         // Second pass: set the marked elements to zero
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 if (matrix[i][j] == -1) {
//                     matrix[i][j] = 0;
//                 }
//             }
//         }
//     }

//     public static void printMatrix(int[][] matrix) {
//         for (int[] row : matrix) {
//             for (int element : row) {
//                 System.out.print(element + " ");
//             }
//             System.out.println();
//         }
//     }
// }
package Array;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        setZeroes(matrix);

        System.out.println("Matrix after setting zeroes:");
        printMatrix(matrix);
    }

    public static void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean firstRowZero = false;
        boolean firstColZero = false;

        // Check if first row should be zeroed
        for (int j = 0; j < cols; j++) {
            if (matrix[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }

        // Check if first column should be zeroed
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        // Use first row and first column as markers
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;  // Mark this row
                    matrix[0][j] = 0;  // Mark this column
                }
            }
        }

        // Set zeros based on markers
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Set first row to zero if needed
        if (firstRowZero) {
            for (int j = 0; j < cols; j++) {
                matrix[0][j] = 0;
            }
        }

        // Set first column to zero if needed
        if (firstColZero) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
