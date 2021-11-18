package branching;

import java.util.Scanner;

/**
 * Заданы размеры А, В прямоугольного отверстия и размеры x, y, z кирпича.
 * Определить пройдет ли кирпич через отверстие.
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A: ");
        double A = scanner.nextDouble();
        System.out.print("B: ");
        double B = scanner.nextDouble();

        System.out.print("x: ");
        double x = scanner.nextDouble();
        System.out.print("y: ");
        double y = scanner.nextDouble();
        System.out.print("z: ");
        double z = scanner.nextDouble();

        if ((A > x && B > y) || (A > y && B > x) ||
                (A > z && B > x) || (A > x && B > z) ||
                (A > z && B > y) || (A > y && B > z)) {
            System.out.println("Кирпич пройдет через отверстие");
        } else {
            System.out.println("Кирпич не пройдет через отверстие");
        }
    }
}
