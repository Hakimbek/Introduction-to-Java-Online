package branching;

import java.util.Scanner;

/**
 * Даны три точки А(х1, y1), В(х2, у2), С(х3, у3). Определить будут ли они расположены на одной прямой.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("y1: ");
        double y1 = scanner.nextDouble();

        System.out.print("x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("y2: ");
        double y2 = scanner.nextDouble();

        System.out.print("x3: ");
        double x3 = scanner.nextDouble();
        System.out.print("y3: ");
        double y3 = scanner.nextDouble();

        if ((y1 - y2) * x3 + (x2 - x1) * y3 + (x1 * y2 - x2 * y1) == 0) {
            System.out.println("Точки расположены на одной прямой");
        } else {
            System.out.println("Точки не расположены на одной прямой");
        }
    }
}
