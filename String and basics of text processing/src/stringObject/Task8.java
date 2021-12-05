package stringObject;

/**
 * Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывесто его на экран.
 * Случай когда длинных слов может быть несколько, не обрабатывать.
 */
public class Task8 {
    public static void main(String[] args) {
        System.out.println(findLongWord("aaa jjjjjjjjjjaaaaaaaa jj kkkkkkkkkkkk"));
    }

    public static String findLongWord(String text) {
        StringBuilder max = new StringBuilder();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                word = new StringBuilder();
            }
            word.append(text.charAt(i));

            if (max.length() < word.length()) {
                max = word;
            }
        }
        return max.toString();
    }
}
