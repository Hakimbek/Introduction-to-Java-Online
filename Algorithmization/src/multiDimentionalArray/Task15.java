package multiDimentionalArray;

/**
 * Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */
public class Task15 {
    public static void main(String[] args) {
        // Create and generate matrix
        Matrix matrixCreator = new Matrix(0,50,5,4);
        int[][] matrix = matrixCreator.generateMatrix();

        // Print matrix
        matrixCreator.printMatrix(matrix);

        // Find the larges number of matrix
        int max = 0;
        for (int i = 0; i < matrixCreator.getCol(); i++) {
            for (int j = 0; j < matrixCreator.getRow(); j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        }

        // Replace all odd element of the matrix with this element
        for (int i = 0; i < matrixCreator.getCol(); i++) {
            for (int j = 0; j < matrixCreator.getRow(); j++) {
                if (matrix[i][j] % 2 != 0) {
                    matrix[i][j] = max;
                }
            }
        }
        matrixCreator.printMatrix(matrix);
    }
}
