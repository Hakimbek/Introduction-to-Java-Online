package branching;

import java.util.Scanner;

/**
 * Найти max{min(a, b), min(c, d)}
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();
        System.out.print("d: ");
        double d = scanner.nextDouble();

        double max = Math.max(Math.min(a, b), Math.min(c, d));
        System.out.println("Max = " + max);

//        double firstMax;
//        double secondMax;
//
//        if (a < b) {
//            firstMax = a;
//        } else {
//            firstMax = b;
//        }
//
//        if (c < d) {
//            secondMax = c;
//        } else {
//            secondMax = d;
//        }
//
//        if (firstMax > secondMax) {
//            System.out.println(firstMax);
//        } else {
//            System.out.println(secondMax);
//        }
    }
}
