package branching;

import java.util.Scanner;

/**
 * Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да,
 * то будет ли он прямоугольным
 */
public class Task1 {
    public static void main(String[] args) {
        // Принимает углы треугольника из клаиватуры
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble(); // a - первый угол треугольника
        System.out.print("b: ");
        double b = scanner.nextDouble(); // b - второй угол треугольника

        // 1. Если сумма двух углов треугольника больше 180 градусов то такой треугольник не существует
        // 2. Если меньше 180 градусов то такой треугольник существует
        //      Если 'a' или 'b' или 'a + b' 90 градусов то это прямоугольный треугольник
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
