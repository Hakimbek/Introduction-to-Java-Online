package stringAsCharArray;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(trim("  jkhkhkjhk    kjhkjhkjhkh     lkjlkjlj"));
    }

    public static String trim(String text) {
        int count = 0;
        char[] chars = text.toCharArray();

        int start = 0;
        int end = 0;

        for (char aChar : chars) {
            if (aChar != ' ') {
                break;
            }
            start++;
        }

        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] != ' ') {
                break;
            }
            end++;
        }

        for (int i = start; i < chars.length - end; i++) {
            if (chars[i] == ' ') {
                continue;
            }

            if (i != start && chars[i - 1] == ' ') {
                count++;
            }

            count++;
        }

        char[] newChar = new char[count];
        count = 0;
        for (int i = start; i < chars.length - end; i++) {
            if (chars[i] == ' ') {
                continue;
            }

            if (i != start && chars[i - 1] == ' ') {
                newChar[count] = ' ';
                count++;
            }

            newChar[count] = chars[i];
            count++;
        }
        return String.valueOf(newChar);
    }
}
