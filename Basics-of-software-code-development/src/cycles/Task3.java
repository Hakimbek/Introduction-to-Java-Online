package cycles;

/**
 * Найти сумму квадратов первых ста чисел.
 */
public class Task3 {
    public static void main(String[] args) {
        // Calculate
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i*i;
        }

        // Print
        System.out.println(sum);
    }
}
