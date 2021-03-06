package multiDimentionalArray;

import java.util.Scanner;

/**
 * Сформировать квадатную матрицу порядка n по заданному образцу(n - четное):
 *      1 1 1 ... 1 1 1
 *      0 1 1 ... 1 1 0
 *      0 0 1 ... 1 0 0
 *      : : : ... : : :
 *      0 1 1 ... 1 1 0
 *      1 1 1 ... 1 1 1
 */
public class Task6 {
    public static void main(String[] args) {
        // Enter N(row and col of quadratic matrix) from keyboard
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        // Generate and print matrix
        if (n % 2 == 0) {
            int[][] matrix = new int[n][n];

            int num = 0;
            int length = n;
            boolean isEqual = false;

            for (int i = 0; i < n; i++) {
                for (int j = num; j < length; j++) {
                    matrix[i][j] = 1;
                    if (num + 1 == length - 1) {
                        isEqual = true;
                    }
                    if (num + n == length) {
                        isEqual = false;
                    }
                }
                if (isEqual) {
                    num--;
                    length++;
                } else {
                    num++;
                    length--;
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
