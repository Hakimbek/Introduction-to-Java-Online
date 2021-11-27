package sorting;

import java.util.Arrays;

/**
 * Сортировка выбором. Дана последовательность чисел a1 <= a2 ... <= an.
 * Требуется переставить элементы так, чтобы они были расположены по убыванию.
 * Для этого в массиве, начиная с первого, выбирается наибольший элемент и ставится на первое место,
 * а первый - на место наибольшего. Затем, начиная со второго, это процедура повторяется.
 * Написать алгоритм сортировки выбором.
 *
 */
public class Task3 {
    public static void main(String[] args) {
        int[] array = {1, 6, 11, 26, 4, 45, 68, 5};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    // Swap indexes of maximum number of array with i-index
    public static void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }

    // Find index of maximum number of array
    public static int indexOfMaximum(int[] arr, int startIndex) {
        int maxValue = arr[startIndex];
        int maxIndex = startIndex;

        for (int i = startIndex + 1; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxIndex = i;
                maxValue = arr[i];
            }
        }
        return maxIndex;
    }

    // Sort
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int maxIndex = indexOfMaximum(arr, i);
            swap(arr,i,maxIndex);
        }
    }
}
