package oneDimensionalArrays;

/**
 * В массив А[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] arrayA = {12, 2, 5, 25, 27, 85, 99, 45, 3, 50};
        int k = 2;

        int sum = 0;

        for (int i : arrayA) {
            if (i % k == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
