package stringArrays;

/**
 * В строке найти количество цифр.
 */
public class Task3 {
    public static void main(String[] args) {
        String text = "I was born in 1999 year 23 October";
        System.out.println("Digits count: " + countDigits(text));
    }

    // The method calculates count of digits in text
    public static int countDigits(String text) {
        char[] chars = text.toCharArray();
        int count = 0;
        for (char aChar : chars) {
            if (Character.isDigit(aChar)) {
                count++;
            }
        }
        return count;
    }
}
