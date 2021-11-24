package oneDimensionalArrays;

import java.util.Arrays;

/**
 * Дан чело численный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй
 * элемент(освободившиеся элементы заполнить нулями). Примечание дополнительный массив не использовать.
 */
public class Task10 {
    public static void main(String[] args) {
        int[] array = {45, 1, 5, 6, 8, 88, 10, 45, 9};
        System.out.println(Arrays.toString(array));

        int evenNum = 2;
        int count = 1;

        for (int i = 1; i < array.length / 2 + 1; i++) {
            if (evenNum < array.length) {
                array[i] = array[evenNum];
                count++;
            }
            evenNum += 2;
        }

        for (int i = count; i < array.length; i++) {
            array[i] = 0;
        }

        System.out.println(Arrays.toString(array));
    }
}
