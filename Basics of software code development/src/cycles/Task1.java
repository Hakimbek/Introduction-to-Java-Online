package cycles;

import java.util.Scanner;

/**
 * Напишите программу где пользователь вводит любое целое число. А программа суммирует все числа
 * от 1 до введенного пользователем числа.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number: ");
        int num = scanner.nextInt();
        System.out.println(sum(num));
    }

    public static int sum(int num) {
        if (num == 1) {
            return 1;
        } else {
            return sum(num - 1) + num;
        }
    }
}
