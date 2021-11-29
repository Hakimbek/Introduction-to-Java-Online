package branching;

import java.util.Scanner;

/**
 * Найти max{min(a, b), min(c, d)}
 */
public class Task2 {
    public static void main(String[] args) {
        // Enter a, b, c, d from keyboard
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();
        System.out.print("d: ");
        double d = scanner.nextDouble();

        // First way
        double max = Math.max(Math.min(a, b), Math.min(c, d));
        System.out.println("Max: " + max);

        // Second way
        double firstMin;
        double secondMin;

        if (a < b) {
            firstMin = a;
        } else {
            firstMin = b;
        }

        if (c < d) {
            secondMin = c;
        } else {
            secondMin = d;
        }

        if (firstMin > secondMin) {
            System.out.println("Max: " + firstMin);
        } else {
            System.out.println("Max: " + secondMin);
        }
    }
}
