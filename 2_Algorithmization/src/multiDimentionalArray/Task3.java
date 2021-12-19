package multiDimentionalArray;

import java.util.Scanner;

/**
 * Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */
public class Task3 {
    public static void main(String[] args) {
        // Create and generate matrix
        Matrix matrixGenerator = new Matrix(0,50,4,5);
        int[][] matrix = matrixGenerator.generateMatrix();

        // Print matrix
        matrixGenerator.printMatrix(matrix);

        // Print the k-th row and p-th column of the matrix
        Scanner scanner = new Scanner(System.in);
        System.out.print("K-th row: ");
        int k = scanner.nextInt() - 1;
        System.out.print("P-th col: ");
        int p = scanner.nextInt() - 1;

        try {
            System.out.print("K-th row of matrix: ");
            for (int i = 0; i < matrixGenerator.getCol(); i++) {
                System.out.print(matrix[i][k] + " ");
            }

            System.out.println();

            System.out.print("P-th column of matrix: ");
            for (int i = 0; i < matrixGenerator.getRow(); i++) {
                System.out.print(matrix[p][i] + " ");
            }
        } catch (Exception e) {
            System.out.println("Entered number is incorrect");
        }
    }
}
