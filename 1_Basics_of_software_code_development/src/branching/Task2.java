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
        System.out.println("1. max(min(" + a + ", " + b + "), min(" + c + ", " + d + ")) = " + max);

        // Second way
        double firstMin;
        double secondMin;

        // Finds min number between 'a' and 'b'
        // And assign this value to 'firstMin'
        if (a < b) {
            firstMin = a;
        } else {
            firstMin = b;
        }

        // Finds min number between 'c' and 'd'
        // And assign this value to 'secondMin'
        if (c < d) {
            secondMin = c;
        } else {
            secondMin = d;
        }

        // Finds max number between 'firstMin' and 'secondMin'
        // And prints it
        System.out.print("2. max(min(" + a + ", " + b + "), min(" + c + ", " + d + ")) = ");
        if (firstMin > secondMin) {
            System.out.println(firstMin);
        } else {
            System.out.println(secondMin);
        }
    }
}
