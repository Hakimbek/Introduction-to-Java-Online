package linearPrograms;

import java.util.Scanner;

/**
 * Для данной области составить линейную программу, которая печатает true если точка с координатами(x, y)
 * принадлежит закрашенной области, и false - в противном случае
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x: ");
        double x = scanner.nextDouble();
        System.out.print("y: ");
        double y = scanner.nextDouble();

        System.out.println((y <= 4 && y >= 0 && x <= 2 && x >= -2) || (y <= 0 && y >= -3 && x <= 4 && x >= -4));
    }
}
