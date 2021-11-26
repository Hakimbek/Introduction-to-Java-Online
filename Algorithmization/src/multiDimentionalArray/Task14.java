package multiDimentionalArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Сформировать случайную матрицу mxn, состоящую из нулей и едениц, причем в каждом столбце число
 * едениц равно номеру столбца.
 */
public class Task14 {
    public static void main(String[] args) {
        // Enter N(row and col of quadratic matrix) from keyboard
        Scanner scanner = new Scanner(System.in);
        System.out.print("N: ");
        int n = scanner.nextInt();

        // Generate matrix which consist of 0 and 1
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= j) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }

        // Shuffle matrix
        ArrayList<Integer> arrayList = new ArrayList();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arrayList.add(matrix[i][j]);
            }
            Collections.shuffle(arrayList);
            for (int j = 0; j < n; j++) {
                matrix[i][j] = arrayList.get(j);
            }
            arrayList.clear();
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
