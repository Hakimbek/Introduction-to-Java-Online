package cycles;

import java.util.Scanner;

/**
 * Вычислить значение функции на отрезке [a, b] с шагом h:
 * y = x, x > 2
 * y = -x, x <= 2
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();
        System.out.print("h: ");
        int h = scanner.nextInt();

        if (a <= b) {
            for (int i = a; i <= b; i += h) {
                if (i <= 2) {
                    System.out.println(-i);
                } else {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Error");
        }
    }
}
