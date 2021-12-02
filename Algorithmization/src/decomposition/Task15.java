package decomposition;

/**
 * Найти все натуральные n-значные числа, чифры в которых образуют строго возрастающую последовательность
 * (например, 1234, 5678). Для решения использовать декомпозицию.
 */
public class Task15 {
    public static void main(String[] args) {
        // Find and print
        findAscendingOrderNumbers(2);
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

    // The method finds numbers that digits are arranged in ascending order
    public static void findAscendingOrderNumbers(int n) {
        int[] range = findRange(n);
        for (int i = range[0]; i <= range[1]; i++) {
            if (checkAscendingOrder(i)) {
                System.out.println(i);
            }
        }
    }

    // The method checks if the digits of number are in ascending order
    public static boolean checkAscendingOrder(int num) {
        boolean ascendingOrder = true;
        while (num /10 != 0) {
            if (num % 10 - (num / 10) % 10 != 1) {
                ascendingOrder = false;
                break;
            }
            num /= 10;
        }
        return ascendingOrder;
    }
}
