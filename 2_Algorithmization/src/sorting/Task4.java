package sorting;

/**
 * Сортировка обменами. Дана последовательность чисел a1 <= a2 ... <= an.
 * Требуется переставить числа в порядке возростания. Для этого сравниваются два соседних числа аi и ai+2.
 * Если ai > ai+1, то делается перестановка. Так продолжается до тех пор, пока все элементы не станут
 * расположены в порядке возростания. Сортировать алгоритм сортировки, подсчитывая при этом количества
 * перестановок.
 *
 * Worst Case Time Complexity [Big-O]: O(n^2)
 * Best Case Time Complexity [Big-omega]: O(n)
 * Average Case Time Complexity [Big-theta]: O(n^2)
 * Space Complexity: O(1)
 */
public class Task4 {
    public static void main(String[] args) {
        int[] array = {5, 44, 2, 25, 10, 1, 56, 88};

        // Sort
        int count = bubbleSort(array);

        // Print count
        System.out.println("Count: " + count);

        // Print sorted array
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    // Sorting method
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
