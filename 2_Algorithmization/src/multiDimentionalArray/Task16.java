package multiDimentionalArray;

import java.util.Scanner;

/**
 * Магическим квадратом порядка n называется квадратная матрица размером nxn, составленная из чисел
 * 1, 2, 3, ... n^2 так, что суммы по каждому столбцу, каждой строке и  каждой из двух больших дагоналей
 * равны между собой. Построить такой квадрат. Пример магического квадрата порядка 3:
 *      6 2 8
 *      7 5 3
 *      2 9 4
 */
public class Task16 {
    public static void main(String[] args) {
        // Enter N(row and col of quadratic matrix) from keyboard
        Scanner scanner = new Scanner(System.in);
        System.out.print("N: ");
        int n = scanner.nextInt();

        // Check N
        if (n == 2) {
            System.out.println("It is not possible to construct a magic square with this number");
            return;
        }

        // Create matrix
        int[][] matrix = new int[n][n];

        // Generate odd magic matrix
        if (n % 2 != 0) {
            int row = n - 1;
            int col = n / 2;

            int oldRow;
            int oldCol;

            for (int i = 1; i <= n * n; i++) {
                matrix[row][col] = i;
                oldRow = row;
                oldCol = col;
                row++;
                col++;

                if (row == n) {
                    row = 0;
                }
                if (col == n) {
                    col = 0;
                }
                if (matrix[row][col] != 0) {
                    row = oldRow;
                    col = oldCol;
                    row--;
                }
            }
            // Generate even magic matrix
        } else {
            int i, j;

            for ( i = 0; i < n; i++)
                for ( j = 0; j < n; j++)
                    matrix[i][j] = (n*i) + j + 1;

            for ( i = 0; i < n; i++)
                for ( j = 0; j < n; j++)
                    matrix[i][j] = (n*i) + j + 1;

            for ( i = 0; i < n/4; i++)
                for ( j = 0; j < n/4; j++)
                    matrix[i][j] = (n*n + 1) - matrix[i][j];

            for ( i = 0; i < n/4; i++)
                for ( j = 3 * (n/4); j < n; j++)
                    matrix[i][j] = (n*n + 1) - matrix[i][j];

            for ( i = 3 * n/4; i < n; i++)
                for ( j = 0; j < n/4; j++)
                    matrix[i][j] = (n*n+1) - matrix[i][j];

            for ( i = 3 * n/4; i < n; i++)
                for ( j = 3 * n/4; j < n; j++)
                    matrix[i][j] = (n*n + 1) - matrix[i][j];

            for ( i = n/4; i < 3 * n/4; i++)
                for ( j = n/4; j < 3 * n/4; j++)
                    matrix[i][j] = (n*n + 1) - matrix[i][j];
        }

        // Print matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
