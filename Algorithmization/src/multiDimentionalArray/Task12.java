package multiDimentionalArray;

/**
 * Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */
public class Task12 {
    public static void main(String[] args) {
        // Create and generate matrix
        Matrix matrixCreator = new Matrix(0,50,5,8);
        int[][] matrix = matrixCreator.generateMatrix();

        // Print matrix
        matrixCreator.printMatrix(matrix);

        // Sort ascending
        for (int i = 0; i < matrixCreator.getRow(); i++) {
            for (int j = 0; j < matrixCreator.getCol(); j++) {
                for (int k = 0; k < matrixCreator.getCol() - 1; k++) {
                    if (matrix[k][i] > matrix[k + 1][i]) {
                        int temp = matrix[k][i];
                        matrix[k][i] = matrix[k + 1][i];
                        matrix[k + 1][i] = temp;
                    }
                }
            }
        }
        // Print
        matrixCreator.printMatrix(matrix);

        // Sort descending
        for (int i = 0; i < matrixCreator.getRow(); i++) {
            for (int j = 0; j < matrixCreator.getCol(); j++) {
                for (int k = 0; k < matrixCreator.getCol() - 1; k++) {
                    if (matrix[k][i] < matrix[k + 1][i]) {
                        int temp = matrix[k][i];
                        matrix[k][i] = matrix[k + 1][i];
                        matrix[k + 1][i] = temp;
                    }
                }
            }
        }
        // Print
        matrixCreator.printMatrix(matrix);
    }
}
