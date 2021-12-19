package decomposition;

/**
 * Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел
 */
public class Task2 {
    public static void main(String[] args) {
        int a = 125;
        int b = 25;
        int c = 50;
        int d = 120;

        // Calculate GCD and print
        System.out.println(calculateGcd(a, b, c, d));
    }

    // The method that find GCD of two numbers
    public static int calculateGcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    // The method that find GCD of four numbers
    public static int calculateGcd(int a, int b, int c, int d) {
        return calculateGcd(calculateGcd(a,b), calculateGcd(c, d));
    }
}
