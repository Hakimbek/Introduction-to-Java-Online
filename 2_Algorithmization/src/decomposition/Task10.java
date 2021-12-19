package decomposition;

/**
 * Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются
 * цифры числа N.
 */
public class Task10 {
    public static void main(String[] args) {
        int num = 45687;

        // Generate array
        int[] array = generateArray(num);

        // Print
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    // The method that counts digits in number
    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    // The method that generate array
    public static int[] generateArray(int num) {
        int[] array = new int[countDigits(num)];
        int count = countDigits(num) - 1;
        while (num != 0) {
            array[count] = num % 10;
            count--;
            num /= 10;
        }
        return array;
    }
}
