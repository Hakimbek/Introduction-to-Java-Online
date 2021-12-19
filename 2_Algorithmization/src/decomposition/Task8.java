package decomposition;

/**
 * Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] + D[5] + D[6].
 * Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
 * массива с номерами от K до M.
 */
public class Task8 {
    public static void main(String[] args) {
        int[] arr = {5, 4, 8, 11, 3, 6};

        // Calculate sum and print
        System.out.println(findSum(arr,4,6));
    }

    // The method that find sum
    public static int findSum(int[] arr, int k, int m) {
        if (k > m || k > arr.length || m > arr.length) {
            System.out.println("Value of k or m is not valid");
            return 0;
        }

        int sum = 0;
        for (int i = k - 1; i < m; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
