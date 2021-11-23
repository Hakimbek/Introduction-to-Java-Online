package oneDimensionalArrays;

import java.util.Arrays;

/**
 * Дана последовательность действительных чисел а1, а2, а3,...аn. Заменить все ее члены,
 * большие данного Z, этим числом. Подсчитать количество замен.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] numSequence = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int z = 2;

        int count = 0;

        for (int i : numSequence) {
            if (i > z) {
                numSequence[--i] = z;
                count++;
            }
        }

        System.out.println(Arrays.toString(numSequence));
        System.out.println("Count: " + count);
    }
}
