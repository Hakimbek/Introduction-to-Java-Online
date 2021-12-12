package cycles;

import java.util.Scanner;

/**
 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или
 * равен заданному е. Общий член ряда имеет вид: An = 1/2^n + 1/3^n
 */
public class Task5 {
    public static void main(String[] args) {
        // Enter e from keyboard
        Scanner scanner = new Scanner(System.in);
        System.out.print("e: ");
        double e = scanner.nextDouble();

        // Calculate
        int count = 1;
        double sum = 0;
        while (true) {
            double num = Math.abs((1/Math.pow(2, count)) + (1/ Math.pow(3, count)));
            if (num >= e) {
                sum += num;
            } else {
                break;
            }
            count++;
        }

        // Print
        System.out.println(sum);
    }
}
