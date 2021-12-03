package stringAsObject;

/**
 * Строка Х состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или
 * вопросительным знаком. Определить количество предложений в строке Х.
 */
public class Task10 {
    public static void main(String[] args) {
        System.out.println(count("I am Hakimbek Bahramov. I am Student! Do you like ice cream?"));
    }

    public static int count(String text) {
        int count = 0;
        String[] splitText = text.split("[.!?]");
        for (int i = 0; i < splitText.length; i++) {
            count++;
        }
        return count;
    }
}
