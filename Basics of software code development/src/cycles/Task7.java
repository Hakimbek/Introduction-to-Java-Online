package cycles;

import java.util.Scanner;

/**
 * Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого
 * числа. m и n вводятся с клавиатуры.
 */
public class Task7 {
    public static void main(String[] args) {
        // Enter m and n from keyboard
        Scanner scanner = new Scanner(System.in);
        System.out.print("m: ");
        int m = scanner.nextInt();
        System.out.print("n: ");
        int n = scanner.nextInt();

        // I use concatenation many times so I used StringBuffer
        StringBuffer result = new StringBuffer();

        // Find and print divisors
        if (m <= n) {
            for (int i = m; i < n; i++) {
                result.append(i).append(": ");
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        result.append(j).append(" ");
                    }
                }
                System.out.println(result);
                result = new StringBuffer();
            }
        } else {
            System.out.println("Error");
        }
    }
}
