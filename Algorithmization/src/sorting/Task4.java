package sorting;

import java.util.Arrays;

/**
 * Сортировка обменами. Дана последовательность чисел a1 <= a2 ... <= an.
 * Требуется переставить числа в порядке возростания. Для этого сравниваются два соседних числа аi и ai+2.
 * Если ai > ai+1, то делается перестановка. Так продолжается до тех пор, пока все элементы не станут
 * расположены в порядке возростания. Сортировать алгоритм сортировки, подсчитывая при этом количества
 * перестановок.
 */
public class Task4 {
    public static void main(String[] args) {
        int[] array = {5, 44, 2, 25, 10, 1, 56, 88};
        int count = bubbleSort(array);
        System.out.println(count);
        System.out.println(Arrays.toString(array));
    }

    // Sort
    public static int bubbleSort(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    count++;
                }
            }
        }
        return count;
    }
}
