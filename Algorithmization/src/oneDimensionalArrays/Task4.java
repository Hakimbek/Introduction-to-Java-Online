package oneDimensionalArrays;

import java.util.Arrays;

/**
 * Даны действительные числа а1, а2,...аn. Поменять местами наибольший и наименьший элемент.
 */
public class Task4 {
    public static void main(String[] args) {
        int[] array = {1, 56, 55, 11, 74, 85, 56, 25, 8, 123, 45, 77, 63};

        // Replace max and min elements
        int max = 0;
        int min = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[max]) {
                max = i;
            }

            if (array[i] < array[min]) {
                min = i;
            }
        }

        int temp = array[min];
        array[min] = array[max];
        array[max] = temp;

        // Print
        System.out.println(Arrays.toString(array));
    }
}
