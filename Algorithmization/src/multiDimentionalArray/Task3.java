package multiDimentionalArray;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Дана матрица. Вывести k-ю столку и p-й столбец иатрицы.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Row: ");
        int row = scanner.nextInt();
        System.out.print("Col: ");
        int col = scanner.nextInt();

        //Generate matrix
        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println(Arrays.deepToString(matrix));

        System.out.print("Row: ");
        row = scanner.nextInt();
        System.out.print("Col: ");
        col = scanner.nextInt();

        try {
            for (int i = 0; i < matrix[row - 1].length; i++) {
                System.out.print(matrix[row - 1][i] + " ");
            }

            System.out.println();

            for (int[] ints : matrix) {
                System.out.print(ints[col - 1] + " ");
            }
        } catch (Exception e) {
            System.out.println("Entered number is incorrect");
        }
    }
}
