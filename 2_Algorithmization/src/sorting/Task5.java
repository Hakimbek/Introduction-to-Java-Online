package sorting;

/**
 * Сортировка вставками. Дана последовательность чисел a1, a2, ... an.
 * Требуется переставить числа в порядке возростания. Делается этого следующим образом.
 * Пусть а1, а2 ... ai - упорядоченная последовательность, т.е. a1 <= a2 ... <= ai.
 * Берется следующее число аi+1 и вставляется а последовательность так, чтобы новая последовательность
 * было тоже возрастающей. Процес производится до тех пор, пока все элементы от i+1 до n не будут перебраны.
 * Примечание. Место помещение очередного элемента в отсортированную часть производить с помощью
 * двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 *
 * Worst Case Time Complexity [Big-O]: O(n^2)
 * Best Case Time Complexity [Big-omega]: O(n)
 * Average Case Time Complexity [Big-theta]: O(n^2)
 * Space Complexity: O(1)
 */
public class Task5 {
    public static void main(String[] args) {
        int[] array = {5, 4, 2, 55, 45, 10, 12 ,26, 6};

        // Sort
        insertionSort(array);


        // Print sorting array
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    // Sorting method
    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int key = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = key;
                j--;
            }
        }
    }
}
