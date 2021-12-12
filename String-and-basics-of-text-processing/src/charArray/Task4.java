package charArray;

/**
 * В строке найти количество чисел.
 */
public class Task4 {
    public static void main(String[] args) {
        String text = "I was born in 1999 year 23 October";
        System.out.println("Numbers count: " + countNumbers(text));
    }

    // The method counts numbers in the text
    public static int countNumbers(String text) {
        int numCount = 0;
        int digitCount = 0;
        char[] chars = text.toCharArray();
        for (char aChar : chars) {
            if (Character.isDigit(aChar)) {
                digitCount++;
            } else {
                if (digitCount > 0) {
                    numCount++;
                }
                digitCount = 0;
            }
        }
        return numCount;
    }
}
