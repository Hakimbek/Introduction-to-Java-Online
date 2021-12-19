package oneDimensionalArrays;

/**
 * Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
 * являются простыми числами.
 */
public class Task6 {
    public static void main(String[] args) {
        double[] array = {12, -10, 25.4, 65, 87.2, 2.0, 3, 5, 85.1, 11, 6};

        // Calculate sum of numbers which index is prime
        int sum = 0;
        boolean isPrime = true;

        for (int i = 2; i < array.length; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                sum += array[i];
            }
            isPrime = true;
        }

        // Print sum
        System.out.println(sum);
    }
}
