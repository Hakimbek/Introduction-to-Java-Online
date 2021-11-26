package multiDimentionalArray;

/**
 * Задана матрица неотрицательных чисел. Посчитатьт сумму элементов в каждом столбце. Определить, какой
 * столбец содержит максимальную сумму.
 */
public class Task9 {
    public static void main(String[] args) {
        // Create and generate matrix
        Matrix matrixCreator = new Matrix(0,50,1,6);
        int[][] matrix = matrixCreator.generateMatrix();

        // Print matrix
        matrixCreator.printMatrix(matrix);

        //
        int sum = 0;
        int temp = 0;
        int count = 0;

        // Find the column which contains maximum amount
        for (int i = 0; i < matrixCreator.getCol(); i++) {
            for (int j = 0; j < matrixCreator.getRow(); j++) {
                temp += matrix[i][j];
            }

            if (temp > sum) {
                count = i + 1;
                sum = temp;
            }
            temp = 0;
        }
        System.out.println("The column containing the maximum amount: " + count);
    }
}
