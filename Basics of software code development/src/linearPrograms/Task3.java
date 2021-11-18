package linearPrograms;

import java.util.Scanner;

/**
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 * (sinX + cosY) / (cosX - sinY) * tgXY
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x: ");
        double x = scanner.nextDouble();

        System.out.print("y: ");
        double y = scanner.nextDouble();

        if (Math.cos(x) - Math.sin(y) != 0) {
            double res = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x*y);
            System.out.println("Solution: " + res);
        } else {
            System.out.println("No solution");
        }
    }
}
