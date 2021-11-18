package branching;

import java.util.Scanner;

/**
 * Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да,
 * то будет ли он прямоугольным
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        if (a + b >= 180) {
            System.out.println("Треугольник не существует");
        } else {
            if (a == 90 || b == 90 || a + b == 90) {
                System.out.println("Треугольник прямоугольный");
            } else {
                System.out.println("Треугольник не прямоугольный");
            }
        }
    }
}
