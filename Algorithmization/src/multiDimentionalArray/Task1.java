package multiDimentionalArray;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Дана матрица. Вывести на экране все нечетные столбцы, у которых первый элемент больше последнего.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Rows: ");
        int row = scanner.nextInt();
        System.out.print("Columns: ");
        int col = scanner.nextInt();

        // Generate matrix
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }

        System.out.println(Arrays.deepToString(matrix));

        for (int i = 0; i < row; i += 2) {
            if (matrix[i][0] > matrix[i][matrix[i].length - 1]) {
                System.out.print("[");
                for (int j = 0; j < col; j++) {
                    if (j != col - 1) {
                        System.out.print(matrix[i][j] + ", ");
                    } else {
                        System.out.print(matrix[i][j]);
                    }
                }
                System.out.println("]");
            }
        }
    }
}
