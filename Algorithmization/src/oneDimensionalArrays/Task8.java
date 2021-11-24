package oneDimensionalArrays;

import java.util.Arrays;

/**
 * Дана последовательность целых чисел a1, a2,...an. Образовать новую последовательность, выбросив из
 * исходной те члены, которые равны min(a1, a2,...an)
 */
public class Task8 {
    public static void main(String[] args) {
        int[] array = {12, 2, 5, 65, 88, 74};

        int min = array[0];

        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }

        int count = 0;
        for (int i : array) {
            if (i == min) {
                count++;
            }
        }

        int[] newArray = new int[array.length - count];
        int countNewArray = 0;
        for (int j : array) {
            if (j == min) {
                continue;
            }
            newArray[countNewArray] = j;
            countNewArray++;
        }

        System.out.println("Old array: " + Arrays.toString(array));
        System.out.println("New array: " + Arrays.toString(newArray));
    }
}
