package cycles;

import java.math.BigInteger;

/**
 * Составить программу нахождения произведения квадратов первых двухсот чисел.
 */
public class Task4 {
    public static void main(String[] args) {
        // Calculate (comes out a very large number so I used BigInteger)
        BigInteger multiplication = BigInteger.ONE;
        for (int i = 1; i <= 200; i++) {
            multiplication = multiplication.multiply(BigInteger.valueOf((long) i*i));
        }

        // Print
        System.out.println(multiplication);
    }
}
