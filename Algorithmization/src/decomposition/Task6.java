package decomposition;

/**
 * Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */
public class Task6 {
    public static void main(String[] args) {
        // Check numbers and print
        System.out.println(isPrime(5,12,3));
    }

    // The method that finds GCD
    public static int calculateGcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    // The method that check if number prime mutually
    public static boolean isPrime(int a, int b, int c) {
        int gcd = calculateGcd(calculateGcd(a, b), c);
        return gcd == 1;
    }
}
