package multiDimentionalArray;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Сформировать кводратную матрицу порядка n по заданному образцу(n - четное):
 *      1 2 3 ... n
 *      n n-1 n-2 ... 1
 *      1 2 3 ... n
 *      n n-1 n-2 ... 1
 *      :  :  :  :
 *      n n-1 n-2 ... 1
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            int[][] matrix = new int[n][n];
            for (int i = 0; i < n; i++) {
                if (i % 2 != 0) {
                    int num = n;
                    for (int j = 0; j < n; j++, num--) {
                        matrix[i][j] = num;
                    }
                } else {
                    int num = 1;
                    for (int j = 0; j < n; j++, num++) {
                        matrix[i][j] = num;
                    }
                }
            }
            System.out.println(Arrays.deepToString(matrix));
        } else {
            System.out.println("n must be even");
        }
    }
}
