package decomposition;

/**
 * Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
 * Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 */
public class Task16 {
    public static void main(String[] args) {
        // Find sum of numbers with odd digits
        long sum = sumOfOddNumbers(2);

        // Print sum
        System.out.println("Sum: " + sum);

        // Calculate count of even digits in sum and print
        System.out.println("Count even digits: " + evenCount(sum));

    }

    // The method finds a range of numbers that consist of n digits
    public static int[] findRange(int n) {
        int startPoint = 1;
        int endPoint = 9;
        for (int i = 1; i < n; i++) {
            startPoint *= 10;
            endPoint = (endPoint * 10) + 9;
        }
        return new int[] {startPoint, endPoint};
    }

    // The method sum numbers if their digits are odd
    public static long sumOfOddNumbers(int n) {
        long sum = 0;
        int[] range = findRange(n);
        for (int i = range[0]; i < range[1]; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }

    // The method return true if digits of number odd else return false
    public static boolean isOdd(int num) {
        boolean isOdd = true;
        while (num != 0) {
            if (num % 2 == 0) {
                isOdd = false;
                break;
            }
            num /= 10;
        }
        return isOdd;
    }

    // The method counts even digits in number
    public static int evenCount(long num) {
        int count = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                count++;
            }
            num /= 10;
        }
        return count;
    }
}
