package stringArrays;

/**
 * Заменить в строке все взождения 'word' на 'letter'.
 */
public class Task2 {
    public static void main(String[] args) {
        String text = "It was the word \"water,\" and I continued to make some sound for that word after all other speech was lost.";

        // First way
        String changedText = changer(text);
        System.out.println(changedText);

        // Second way
        String replacedText = text.replace("word", "letter");
        System.out.println(replacedText);
    }

    // First way
    // The method that changes word to letter
    public static String changer(String text) {
        String[] splitText = text.split(" ");
        for (int i = 0; i < splitText.length; i++) {
            if (splitText[i].equalsIgnoreCase("word")) {
                splitText[i] = "letter";
            }
        }
        StringBuilder changedText = new StringBuilder();
        for (String str : splitText) {
            changedText.append(str).append(" ");
        }
        return changedText.toString();
    }
}
