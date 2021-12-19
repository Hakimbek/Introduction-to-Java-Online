package decomposition;

/**
 * Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
 * Сколько таких действий надо произвести, чтобы получился ноль? Для решения использовать декомпозицию.
 */
public class Task17 {
    public static void main(String[] args) {
        // Calculate and print
        System.out.println(subtract(25));
    }

    // The method finds the sum of number digits
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // The method calculates count of subtractions
    public static int subtract(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num -= sumOfDigits(num);
        }
        return count;
    }
}
