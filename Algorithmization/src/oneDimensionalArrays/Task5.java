package oneDimensionalArrays;

/**
 * Даны целые числа а1, а2,...а3. Вывести на печать те числа, для которых ai > i.
 */
public class Task5 {
    public static void main(String[] args) {
        int[] array = {12, 2, 25, 45, 56, 84, 1, 29, 24, 12, 36, 2, 5};

        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                System.out.println(array[i]);
            }
        }
    }
}
