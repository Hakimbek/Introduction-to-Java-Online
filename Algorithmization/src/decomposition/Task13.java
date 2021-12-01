package decomposition;

/**
 * Два простых числа называются "близнецами", если они отличаются друг от друга на 2 (например, 41 и 43).
 * Найти и напечатать все пары "близнецов" из отрезка [n, 2n], где n - заданное натуральное число больше 2.
 * Для решения задачи использовать декомпозицию.
 */
public class Task13 {
    public static void main(String[] args) {
        // Find twin numbers amd print
        findTwinNumbers(10);
    }

    // The method that return true if number is prime and false
    public static boolean isPrime(int num) {
        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    // The method that finds twin numbers
    public static void findTwinNumbers(int n) {
        if (n > 2) {
            for (int i = n; i < (2 * n) - 2; i++) {
                if (isPrime(i) && isPrime(i + 2)) {
                    System.out.print(i + ", ");
                    System.out.println(i + 2);
                }
            }
        } else {
            System.out.println("N must be greater than 2");
        }
    }
}
