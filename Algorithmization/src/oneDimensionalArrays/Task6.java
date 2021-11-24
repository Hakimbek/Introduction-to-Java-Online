package oneDimensionalArrays;

/**
 * Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
 * являются простыми числами.
 */
public class Task6 {
    public static void main(String[] args) {
        int[] array = {12, 10, 25, 65, 87, 2, 3, 5, 85, 11, 6};

        int sum = 0;
        boolean isNormal = true;

        for (int i = 2; i < array.length; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isNormal = false;
                    break;
                }
            }

            if (isNormal) {
                sum += array[i];
            }
            isNormal = true;
        }

        System.out.println(sum);
    }
}
