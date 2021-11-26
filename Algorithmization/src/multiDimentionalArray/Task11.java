package multiDimentionalArray;

/**
 * Матрицу 10х20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк,
 * в которых число 5 встречается три и более раз.
 */
public class Task11 {
    public static void main(String[] args) {
        // Create and generate matrix
        Matrix matrixCreator = new Matrix(0,15,20,10);
        int[][] matrix = matrixCreator.generateMatrix();

        // Print matrix
        matrixCreator.printMatrix(matrix);

        // Find row numbers in which the number 5 occurs three or more times
        int count = 0;
        for (int i = 0; i < matrixCreator.getRow(); i++) {
            for (int j = 0; j < matrixCreator.getCol(); j++) {
                if (matrix[j][i] == 5) {
                    count++;
                }
            }
            if (count >= 3) {
                System.out.println(i+1);
            }
            count = 0;
        }
    }
}
