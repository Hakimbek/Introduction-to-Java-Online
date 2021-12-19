package decomposition;

/**
 * Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
 * возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k.
 * Для решения использовать декомпозицию.
 */
public class Task14 {
    public static void main(String[] args) {
        // Find numbers of Armstrong
        findArmstrongNumbers(500);
    }

    // The method finds the count of digits in the number
    public static int calculateCountOfNumberDigits(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }


    // The method that finds sum of digits
    public static int sumOfDigits(int num) {
        int count = calculateCountOfNumberDigits(num);
        int sum = 0;

        while (num != 0) {
            sum += Math.pow(num % 10, count);
            num /= 10;
        }
        return sum;
    }

    // The method that finds num of Armstrong
    public static void findArmstrongNumbers(int k) {
        for (int i = 1; i < k; i++) {
            if (sumOfDigits(i) == i) {
                System.out.println(i);
            }
        }
    }
}
