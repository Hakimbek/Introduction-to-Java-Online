package sorting;

/**
 * Сортировка Шелла. Дан массив n действителтных чисел. Требуется упорядочить его по возростанию.
 * Делается это следующим образом: сравниваются два соседних элемента ai и ai+1. Если ai <= ai+1,
 * то продвигаются на один элемент вперед. Если ai > ai+1, то производится перестановка и сдвигается на
 * один элемент назад. Составить алгоритм этой сортировки.
 *
 * Worst Case Time Complexity [Big-O]: O(n^2)
 * Best Case Time Complexity [Big-omega]: O(n*log(n))
 * Average Case Time Complexity [Big-theta]: O(n/log(n))
 * Space Complexity: O(1)
 */
public class Task6 {
    public static void main(String[] args) {
        int[] array = {12, 2, 56, 4, 5, 10, 22};

        // Sort
        shellSort(array);

        // Print sorting array
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    // Sorting method
    public static void shellSort(int[] arr) {
        for (int interval = arr.length/2; interval > 0; interval /= 2) {
            for (int i = interval; i < arr.length; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= interval && arr[j - interval] > temp; j -= interval) {
                    arr[j] = arr[j - interval];
                }
                arr[j] = temp;
            }
        }
    }
}
