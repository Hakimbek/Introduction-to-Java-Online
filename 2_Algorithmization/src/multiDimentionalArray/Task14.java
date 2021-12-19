package multiDimentionalArray;
import java.util.Scanner;

/**
 * Сформировать случайную матрицу MxN, состоящую из нулей и едениц, причем в каждом столбце число
 * едениц равно номеру столбца.
 */
public class Task14 {
    public static void main(String[] args) {
        // Enter N(row and col of quadratic matrix) from keyboard
        Scanner scanner = new Scanner(System.in);
        System.out.print("N: ");
        int n = scanner.nextInt();

        // Generate matrix which consist of 0 and 1
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            int count = 0;
            while (count <= i) {
                int num = (int) (Math.random() * (n));
                if (matrix[i][num] != 1) {
                    matrix[i][num] = 1;
                    count++;
                }
            }
        }

        // Print matrix
        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
