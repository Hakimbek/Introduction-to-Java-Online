package decomposition;

/**
 * Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */
public class Task11 {
    public static void main(String[] args) {
        // Find number with more digits and print
        System.out.println(findNumberWithMoreDigits(4566,23));
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

    // The method that finds the number with more digits
    public static int findNumberWithMoreDigits(int a, int b) {
        return countDigits(a) > countDigits(b) ? a : b;
    }
}
