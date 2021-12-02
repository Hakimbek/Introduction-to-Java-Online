package stringArrays;

/**
 * В строке найти количество чисел.
 */
public class Task4 {
    public static void main(String[] args) {
        String text = "I was born in 1999 year 23 October";
        System.out.println(countNumbersByException(text));
        System.out.println(countNumbersByCharacter(text));
    }

    // First way
    // The method calculates count of numbers in text
    public static int countNumbersByException(String text) {
        int count = 0;
        String[] splitText = text.split(" ");
        for (String str : splitText) {
            try {
                Integer.parseInt(str);
                count++;
            } catch (Exception ignored) {

            }
        }
        return count;
    }

    // Second way
    public static int countNumbersByCharacter(String text) {
        int count = 0;
        String[] splitText = text.split(" ");
        for (String str : splitText) {
            boolean isNum = true;
            char[] chars = str.toCharArray();
            for (char aChar : chars) {
                if (!Character.isDigit(aChar)) {
                    isNum = false;
                    break;
                }
            }
            if (isNum) {
                count++;
            }
        }
        return count;
    }
}
