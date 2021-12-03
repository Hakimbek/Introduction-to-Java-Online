package stringAsObject;

/**
 * Из заданной строки получить новую, повторив каждый символ дважды.
 */
public class Task6 {
    public static void main(String[] args) {
        System.out.println(multiple("abcdefg"));
    }

    public static String multiple(String text) {
        StringBuilder newText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            newText.append(text.charAt(i)).append(text.charAt(i));
        }
        return newText.toString();
    }
}
