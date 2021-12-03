package stringAsObject;

/**
 * В строке вставить после каждого символа 'a' символ 'b'.
 */
public class Task2 {
    public static void main(String[] args) {
        String text = "kjkhakjhkjhkjh akjhkjhkj khkhajhkjhkh khjkjha";
        System.out.println(putB(text));
    }

    public static String putB(String text) {
        StringBuilder newText = new StringBuilder();
        char[] chars = text.toCharArray();
        for (char aChar : chars) {
            if (aChar == 'a') {
                newText.append(aChar).append('b');
            } else {
                newText.append(aChar);
            }
        }
        return newText.toString();
    }
}
