package multiDimentionalArray;

/**
 * Дана матрица. Вывести на экране все нечетные столбцы, у которых первый элемент больше последнего.
 */
public class Task1 {
    public static void main(String[] args) {
        // Create and generate matrix
        Matrix matrixCreator = new Matrix(0,50,4,2);
        int[][] matrix = matrixCreator.generateMatrix();

        // Print matrix
        matrixCreator.printMatrix(matrix);

        // Find and print odd columns of matrix which first element greater than last element
        for (int i = 0; i < matrixCreator.getCol(); i+=2) {
            if (matrix[i][0] > matrix[i][matrixCreator.getRow() - 1]) {
                for (int j = 0; j < matrixCreator.getRow(); j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
