package Matrix;

// Java program showing time difference
// in row major and column major access
import java.time.Duration;
import java.time.Instant;

public class row_col_matrix {

    // taking MAX 10000 so that time difference
    // can be shown
    static int MAX = 10000;

    static int[][] arr = new int[MAX][MAX];

    static void rowMajor() {

        int i, j;

        // accessing element row wise
        for (i = 0; i < MAX; i++) {
            for (j = 0; j < MAX; j++) {
                arr[i][j]++;
            }
        }
    }

    static void colMajor() {

        int i, j;

        // accessing element column wise
        for (i = 0; i < MAX; i++) {
            for (j = 0; j < MAX; j++) {
                arr[j][i]++;
            }
        }
    }

    // Driver code
    public static void main(String[] args) {

        // Time taken by row major order
        Instant start = Instant.now();
        rowMajor();
        Instant end = Instant.now();
        System.out.println("Row major access time : "
                + Duration.between(start, end));

        // Time taken by column major order
        start = Instant.now();
        colMajor();
        end = Instant.now();
        System.out.printf("Column major access time : "
                + Duration.between(start, end));
    }
}
// Time Complexity: O(MAX*MAX)
// Auxiliary Space: O(MAX*MAX)
