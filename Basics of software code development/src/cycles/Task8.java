package cycles;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Second number: ");
        int secondNumber = scanner.nextInt();

        HashSet<Integer> digitsInTwoNumbers = new HashSet<>();

        while (firstNumber > 0) {
            int tempSecondNumber = secondNumber;
            int firstNumberDigit = firstNumber % 10;
            while (tempSecondNumber > 0) {
                if (firstNumberDigit == tempSecondNumber % 10) {
                    digitsInTwoNumbers.add(firstNumberDigit);
                }
                tempSecondNumber /= 10;
            }
            firstNumber /= 10;
        }
        System.out.println(digitsInTwoNumbers);
    }
}
