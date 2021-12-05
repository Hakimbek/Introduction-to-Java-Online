package cycles;

/**
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */
public class Task8 {
    public static void main(String[] args) {
        // Boolean representation of digits from 0 to 9
        boolean[] numbers = {false,false,false,false,false,false,false,false,false,false};

        int a = 356125;
        int b = 5781113;

        // Find digits which include in record of two numbers
        while (a != 0) {
            int tempB = b;
            while (tempB != 0) {
                if (a % 10 == tempB % 10) {
                    if (!numbers[a % 10]) {
                        numbers[a % 10] = true;
                    }
                }
                tempB /= 10;
            }
            a /= 10;
        }

        // Print
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
