package branching;

import java.util.Scanner;

/**
 * Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да,
 * то будет ли он прямоугольным
 */
public class Task1 {
    public static void main(String[] args) {
        // Enter a, b from keyboard
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();

        // Check
        if (a + b >= 180) {
            System.out.println("The triangle does not exist");
        } else {
            if (a == 90 || b == 90 || a + b == 90) {
                System.out.println("Rectangular triangle");
            } else {
                System.out.println("The triangle is not rectangular");
            }
        }
    }
}
