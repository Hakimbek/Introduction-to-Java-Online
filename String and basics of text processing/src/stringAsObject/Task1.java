package stringAsObject;

/**
 * Дан текст(строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 */
public class Task1 {
    public static void main(String[] args) {
        String text = "This    is      text";
        System.out.println(getWhiteSpace(text));
    }

    // The method finds max white space
    public static int getWhiteSpace(String text) {
        int max = 0;
        int count = 0;
        char[] chars = text.toCharArray();
        for (char aChar : chars) {
            if (aChar == ' ') {
                count++;
            } else {
                count = 0;
            }

            if (count > max) {
                max = count;
            }
        }
        return max;
    }

}
