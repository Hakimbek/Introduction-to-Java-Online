package linearPrograms;

import java.util.Scanner;

/**
 * Дано действительное число R, вида nnn.ddd (три цифровых разряда в дробной и челой частях).
 * Поменяйте местами дробную и целую часть цисла и вывести полученное значение числа.
 */
public class Task4 {
    public static void main(String[] args) {
        double r = 123.456;
        System.out.println((r*1000) % 1000 + ((int) r / 1000.0));
        Scanner scanner = new Scanner(System.in);
    }
}
