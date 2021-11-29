package branching;

import java.util.Scanner;

/**
 * Даны три точки А(х1, y1), В(х2, у2), С(х3, у3). Определить будут ли они расположены на одной прямой.
 */
public class Task3 {
    public static void main(String[] args) {
        checkPoints(1,4,2,4,3,4);
    }

    public static void checkPoints(double x1, double y1, double x2, double y2, double x3, double y3) {
        if ((y1 - y2) * x3 + (x2 - x1) * y3 + (x1 * y2 - x2 * y1) == 0) {
            System.out.println("Точки расположены на одной прямой");
        } else {
            System.out.println("Точки не расположены на одной прямой");
        }
    }
}
