package stringAsObject;

/**
 * Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывесто его на экран.
 * Случай когда длинных слов может быть несколько, не обрабатывать.
 */
public class Task8 {
    public static void main(String[] args) {
        System.out.println(maxWord("aaa jjjjjjjjjjaaaaaaaa jj kkkkkkkkkkkk"));
    }

    public static String maxWord(String text) {
        String maxWord = "";
        String[] splitText = text.split(" ");
        for (String s : splitText) {
            if (s.length() > maxWord.length()) {
                maxWord = s;
            }
        }
        return maxWord;
    }
}
