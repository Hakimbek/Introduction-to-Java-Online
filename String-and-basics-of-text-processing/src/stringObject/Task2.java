package stringObject;

/**
 * В строке вставить после каждого символа 'a' символ 'b'.
 */
public class Task2 {
    public static void main(String[] args) {
        String text = "apple java software hibernate";
        System.out.println(putB(text));
    }

    public static String putB(String text) {
        StringBuilder newText = new StringBuilder();
        char[] chars = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a') {
                newText.append(text.charAt(i)).append('b');
            } else {
                newText.append(text.charAt(i));
            }
        }
        return newText.toString();
    }
}
