package branching;

import java.util.Scanner;

/**
 * Вычислить значение функции.
 * f(x) = x^2 - x*3 + 9, если x <= 3
 * f(x) = 1 / (x^3 + 6), если x > 3
 */
public class Task5 {
    public static void main(String[] args) {
        // Enter x from keyboard
        Scanner scanner = new Scanner(System.in);
        System.out.print("x: ");
        double x = scanner.nextDouble();

         // Calculate the value of function
        if (x <= 3) {
            System.out.println(Math.pow(x, 2) - 3*x + 9);
        } else {
            System.out.println(1/(Math.pow(x, 3) + 6));
        }
    }
}
