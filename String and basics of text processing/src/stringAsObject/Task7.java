package stringAsObject;

/**
 * Вводится строка. Требуется удалить из нее повторяющиеся символы и пробелы. Например, если
 * было введено "abc cde def", то должно быть выведено "abcdef".
 */
public class Task7 {
    public static void main(String[] args) {
        System.out.println(divide("  dddd ssaaa  djhgjhgjgj"));
    }

    public static String divide(String text) {
        String newText = "";
        for (int i = 0; i < text.length(); i++) {
            String textChar = String.valueOf(text.charAt(i));
            if (!newText.contains(textChar) && text.charAt(i) != ' ') {
                newText = newText.concat(textChar);
            }
        }
        return newText;
    }
}
