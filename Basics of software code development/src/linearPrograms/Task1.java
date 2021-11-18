package linearPrograms;

import java.util.Scanner;

/**
 * Найдите значение функции: z = ((a-3)*b/2)+c
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();

        System.out.print("b: ");
        double b = scanner.nextDouble();

        System.out.print("c: ");
        double c = scanner.nextDouble();

        double z = ((a-3)*b/2)+c;
        System.out.println("z: " + z);
    }
}
