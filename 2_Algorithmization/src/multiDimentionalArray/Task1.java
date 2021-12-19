package multiDimentionalArray;

/**
 * Дана матрица. Вывести на экране все нечетные столбцы, у которых первый элемент больше последнего.
 */
public class Task1 {
    public static void main(String[] args) {
        // Create and generate matrix
        Matrix matrixGenerator = new Matrix(0,50,4,4);
        int[][] matrix = matrixGenerator.generateMatrix();

        // Print matrix
        matrixGenerator.printMatrix(matrix);

        // Find and print odd columns of matrix which first element greater than last element
        for (int i = 0; i < matrixGenerator.getCol(); i+=2) {
            if (matrix[i][0] > matrix[i][matrixGenerator.getRow() - 1]) {
                for (int j = 0; j < matrixGenerator.getRow(); j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
