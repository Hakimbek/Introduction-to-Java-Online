package multiDimentionalArray;

import java.util.Arrays;
import java.util.Scanner;

/**
 * В числовой матрице поменять местами два столбца любых столбца, т.е все элементы одного столбца
 * поставить на соответствующие им позиции другого, а его элементы второрго переместить в первый.
 * Номера столбцов вводить пользователем с клавиатуры.
 */
public class Task8 {
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

        System.out.print("Col1: ");
        int col1 = scanner.nextInt() - 1;
        System.out.print("Col2: ");
        int col2 = scanner.nextInt() - 1;
        if (col1 < matrix.length && col2 < matrix.length) {
            for (int i = 0; i < row; i++) {
                int temp = matrix[i][col1];
                matrix[i][col1] = matrix[i][col2];
                matrix[i][col2] = temp;
            }
            System.out.println(Arrays.deepToString(matrix));
        } else {
            System.out.println("Invalid column");
        }
    }
}
