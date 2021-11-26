package multiDimentionalArray;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Сформировать кводратную матрицу порядка n по заданному образцу(n - четное):
 *      1 1 1 ... 1 1 1
 *      2 2 2 ... 2 2 0
 *      3 3 3 ... 3 0 0
 *      : : : ... : : :
 *      n 0 0 ... 0 0 0
 */
public class Task5 {
    public static void main(String[] args) {
        // Enter N(row and col of quadratic matrix) from keyboard
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        // Generate and print matrix
        if (n % 2 == 0) {
            int[][] matrix = new int[n][n];
            int length = n;

            for (int i = 0; i < n; i++, length--) {
                for (int j = 0; j < length; j++) {
                    matrix[i][j] = i+1;
                }
            }
            System.out.println(Arrays.deepToString(matrix));
        } else {
            System.out.println("n must be even");
        }
    }
}
