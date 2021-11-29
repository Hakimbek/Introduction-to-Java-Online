package cycles;

import java.util.Scanner;

/**
 * Напишите программу где пользователь вводит любое целое число. А программа суммирует все числа
 * от 1 до введенного пользователем числа.
 */
public class Task1 {
    public static void main(String[] args) {
        // Enter number from keyboard
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int num = scanner.nextInt();

        // Calculate and print the sum
        System.out.println(sum(num));
    }

    // Recursion
    public static int sum(int num) {
        if (num == 1) {
            return 1;
        } else {
            return sum(num - 1) + num;
        }
    }
}
