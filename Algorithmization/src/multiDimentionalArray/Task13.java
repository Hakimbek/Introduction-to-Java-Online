package multiDimentionalArray;

/**
 * Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов.
 */
public class Task13 {
    public static void main(String[] args) {
        // Create and generate matrix
        Matrix matrixCreator = new Matrix(0,50,5,8);
        int[][] matrix = matrixCreator.generateMatrix();

        // Print matrix
        matrixCreator.printMatrix(matrix);

        // Sort columns of matrix
        for (int i = 0; i < matrixCreator.getCol(); i++) {
            for (int j = 0; j < matrixCreator.getRow(); j++) {
                for (int k = 0; k < matrixCreator.getRow() - 1; k++) {
                    if (matrix[i][k] > matrix[i][k + 1]) {
                        int temp = matrix[i][k];
                        matrix[i][k] = matrix[i][k + 1];
                        matrix[i][k + 1] = temp;
                    }
                }
            }
        }
        matrixCreator.printMatrix(matrix);

        for (int i = 0; i < matrixCreator.getCol(); i++) {
            for (int j = 0; j < matrixCreator.getRow(); j++) {
                for (int k = 0; k < matrixCreator.getRow() - 1; k++) {
                    if (matrix[i][k] < matrix[i][k + 1]) {
                        int temp = matrix[i][k];
                        matrix[i][k] = matrix[i][k + 1];
                        matrix[i][k + 1] = temp;
                    }
                }
            }
        }
        matrixCreator.printMatrix(matrix);
    }
}
