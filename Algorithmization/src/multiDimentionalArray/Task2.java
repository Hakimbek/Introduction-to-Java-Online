package multiDimentionalArray;

/**
 * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */
public class Task2 {
    public static void main(String[] args) {
        // Create and generate matrix
        Matrix matrixGenerator = new Matrix(0,50,3,3);
        int[][] matrix = matrixGenerator.generateMatrix();

        // Print matrix
        matrixGenerator.printMatrix(matrix);

        // Find and print matrix diagonals
        int max = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] != matrix[i][max]) {
                System.out.println(matrix[i][i]);
                System.out.println(matrix[i][max]);
            } else {
                System.out.println(matrix[i][i]);
            }
            max--;
        }
    }
}
