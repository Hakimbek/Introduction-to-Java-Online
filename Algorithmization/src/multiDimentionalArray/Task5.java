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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            int[][] matrix = new int[n][n];
            int num = 1;
            int length = n;

            for (int i = 0; i < n; i++, num++, length--) {
                for (int j = 0; j < length; j++) {
                    matrix[i][j] = num;
                }
            }
            System.out.println(Arrays.deepToString(matrix));
        } else {
            System.out.println("n must be even");
        }
    }
}
