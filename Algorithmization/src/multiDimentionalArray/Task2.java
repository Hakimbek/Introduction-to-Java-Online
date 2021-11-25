package multiDimentionalArray;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quadratic matrix: ");
        int rowCol = scanner.nextInt();

        int[][] matrix = new int[rowCol][rowCol];

        //Generate matrix
        for (int i = 0; i < rowCol; i++) {
            for (int j = 0; j < rowCol; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }

        System.out.println(Arrays.deepToString(matrix));
        int max = rowCol - 1;

        for (int i = 0; i < rowCol; i++) {
            if (matrix[i][i] != matrix[i][max]) {
                System.out.println(matrix[i][i]);
                System.out.println(matrix[i][max]);
            } else {
                System.out.println(matrix[i][i]);
            }
            max--;
        }
    }
}
