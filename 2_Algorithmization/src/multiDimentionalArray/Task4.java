package multiDimentionalArray;

import java.util.Scanner;

/**
 * Сформировать кводратную матрицу порядка n по заданному образцу(n - четное):
 *      1 2 3 ... n
 *      n n-1 n-2 ... 1
 *      1 2 3 ... n
 *      n n-1 n-2 ... 1
 *      :  :  :  :
 *      n n-1 n-2 ... 1
 */
public class Task4 {
    public static void main(String[] args) {
        // Enter N(row and col of quadratic matrix) from keyboard
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        // Generate and print matrix
        if (n % 2 == 0) {
            int[][] matrix = new int[n][n];
            for (int i = 0; i < n; i++) {
                if (i % 2 != 0) {
                    int num = n;
                    for (int j = 0; j < n; j++, num--) {
                        matrix[i][j] = num;
                    }
                } else {
                    for (int j = 0; j < n; j++) {
                        matrix[i][j] = j+1;
                    }
                }
            }
            // Print
            for (int[] row : matrix) {
                for (int col : row) {
                    System.out.print(col + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("n must be even");
        }
    }
}
