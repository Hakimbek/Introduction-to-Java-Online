package multiDimentionalArray;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Сформировать квадратную матрицу порядка N по правилу:
 *      A[I, J] = sin((I^2 - J^2) / N)
 * и подсчитать количество положительных элементов в ней.
 */
public class Task7 {
    public static void main(String[] args) {
        // Enter N(row and col of quadratic matrix) from keyboard
        Scanner scanner = new Scanner(System.in);
        System.out.print("N: ");
        int n = scanner.nextInt();

        // Generate and print matrix
        double[][] matrix = new double[n][n];

        int countPositiveNumbers = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Math.sin((Math.pow(i,2) + Math.pow(j,2)) / n);
                if (matrix[i][j] > 0) {
                    countPositiveNumbers++;
                }
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(countPositiveNumbers);
    }
}
