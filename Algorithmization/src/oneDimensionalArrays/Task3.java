package oneDimensionalArrays;

/**
 * Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
 * положительных и нулевых элементов.
 */
public class Task3 {
    public static void main(String[] args) {
        int[] array = {-10, 5, 0, 25, 0, -56, -7, 41, 78, 66, -5};

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i : array) {
            if (i < 0) {
                negative++;
            } else if (i > 0) {
                positive++;
            } else {
                zero++;
            }
        }

        System.out.println("Positive numbers: " + positive +
                "\nNegative numbers " + negative + "\nZero " + zero);
    }
}
