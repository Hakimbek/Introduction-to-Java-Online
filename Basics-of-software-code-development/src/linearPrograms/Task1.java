package linearPrograms;

/**
 * Найдите значение функции: z = ((a-3)*b/2)+c
 */
public class Task1 {
    public static void main(String[] args) {
        System.out.println(calculate(5,0,8));
    }

    public static double calculate(double a, double b, double c) {
        return ((a-3)*b/2)+c;
    }
}
