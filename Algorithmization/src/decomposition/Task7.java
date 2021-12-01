package decomposition;

/**
 * Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */
public class Task7 {
    public static void main(String[] args) {
        // Calculate and print
        System.out.println(sumOfFactorialOddNumbers());
    }

    // The method that calculate factorial
    public static long calculateFactorial(int a) {
        if (a == 0) {
            return 1;
        } else {
            return a * calculateFactorial(a - 1);
        }
    }

    // The method that calculate sum of factorial odd numbers
    public static long sumOfFactorialOddNumbers() {
        long sum = 0;
        for (int i = 1; i < 10; i += 2) {
            sum += calculateFactorial(i);
        }
        return sum;
    }
}
