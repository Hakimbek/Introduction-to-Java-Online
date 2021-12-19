package decomposition;

/**
 * Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного
 * двух натуральных чисел:
 *      НОК(А, В) = (А * В) / НОД(А, В)
 */
public class Task1 {
    public static void main(String[] args) {
        int a = 8;
        int b = 12;

        // Find Greatest Common Divisor and print it
        System.out.println(calculateGcd(a,b));

        // Find Least Common Multiple and print it
        System.out.println(calculateLcm(a,b));
    }

    // The method that finds Greatest Common Divisor
    public static int calculateGcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    // The method that finds Least Common Multiple
    public static int calculateLcm(int a, int b) {
        return (a * b) / calculateGcd(a, b);
    }
}
