package stringObject;

/**
 * С помощью функции копирования и операции конкатенации составить из частей слова 'информатика' слово 'торт'.
 */
public class Task4 {
    public static void main(String[] args) {
        System.out.println(gazerNewWord("Информатика"));
    }

    public static String gazerNewWord(String text) {
        String t = String.valueOf(text.charAt(text.indexOf('т')));
        String o = String.valueOf(text.charAt(text.indexOf('о')));
        String r = String.valueOf(text.charAt(text.indexOf('р')));
        return t.concat(o).concat(r).concat(t);
    }
}
