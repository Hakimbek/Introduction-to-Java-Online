package multiDimentionalArray;

import java.util.Scanner;

/**
 * В числовой матрице поменять местами два столбца любых столбца, т.е все элементы одного столбца
 * поставить на соответствующие им позиции другого, а его элементы второрго переместить в первый.
 * Номера столбцов вводить пользователем с клавиатуры.
 */
public class Task8 {
    public static void main(String[] args) {
        // Create and generate matrix
        Matrix matrixCreator = new Matrix(0,50,4,5);
        int[][] matrix = matrixCreator.generateMatrix();

        // Print matrix
        matrixCreator.printMatrix(matrix);

        // Enter columns, we want to swap
        Scanner scanner = new Scanner(System.in);
        System.out.print("Col1: ");
        int col1 = scanner.nextInt() - 1;
        System.out.print("Col2: ");
        int col2 = scanner.nextInt() - 1;

        // Swap and print the columns
        if (col1 < matrixCreator.getCol() && col2 < matrixCreator.getCol()) {
            for (int i = 0; i < matrixCreator.getRow(); i++) {
                int temp = matrix[col1][i];
                matrix[col1][i] = matrix[col2][i];
                matrix[col2][i] = temp;
            }
            matrixCreator.printMatrix(matrix);
        } else {
            System.out.println("Invalid number of column");
        }
    }
}
