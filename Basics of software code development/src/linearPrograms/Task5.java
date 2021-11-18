package linearPrograms;

import java.util.Scanner;

/**
 * Дано натуральное число T, которое представляет длительность прошедшого времени в секундах.
 * Вывести значение длительности в часах, минутах и секундах в следующей форме: HHч ММмин SSс
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Seconds: ");
        int num = scanner.nextInt();

        int seconds = num % 60;
        num /= 60;
        int minute = num % 60;
        int hour = num / 60;
        System.out.println( ((hour/10 != 0) ? hour : "0" + hour) + "ч " +
                ((minute/10 != 0) ? minute : "0" + minute) + "мин " +
                ((seconds/10 != 0) ? seconds : "0" + seconds) + "c");
    }
}
