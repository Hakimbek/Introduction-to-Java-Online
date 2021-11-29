package oneDimensionalArrays;

/**
 * Дана последовательность действительных чисел а1, а2, а3,...аn. Заменить все ее члены,
 * большие данного Z, этим числом. Подсчитать количество замен.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] numSequence = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int z = 2;

        // Replace array elements and count replacements
        int count = 0;

        for (int i : numSequence) {
            if (i > z) {
                numSequence[--i] = z;
                count++;
            }
        }

        // Print array
        System.out.print("[");
        for (int i = 0; i < numSequence.length; i++) {
            if (i == numSequence.length - 1) {
                System.out.print(numSequence[i] + "]");
            } else {
                System.out.print(numSequence[i] + ", ");
            }
        }

        // Print count
        System.out.println("\nCount: " + count);
    }
}
