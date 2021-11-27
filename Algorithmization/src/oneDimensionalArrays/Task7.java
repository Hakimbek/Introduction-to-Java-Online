package oneDimensionalArrays;

/**
 * Дана действительные числа а1, а2,...аn. Найти max(a1 + a2n, a2 + a2n-1,...an + an-1)
 */
public class Task7 {
    public static void main(String[] args) {
        int[] array = {12, 15, 2, 25, 65, 55, 9, 78, 1, 10};

        int maxSum = array[0] + array[array.length - 1];
        for (int i = 1; i < array.length / 2; i++) {
            if (array[i] + array[array.length - i - 1] > maxSum) {
                maxSum = array[i] + array[array.length - i - 1];
            }
        }

        System.out.println(maxSum);
    }
}
