package charArray;

/**
 * Заменить в строке все взождения 'word' на 'letter'.
 */
public class Task2 {
    public static void main(String[] args) {
        String text = "It was the word \"water\" and I continued to make some sound for that word after all other speech was lost.";
        System.out.println(text);

        // Change amd print
        System.out.println(changer(text));
    }

    // The method that changes word to letter
    public static String changer(String text) {
        char[] oldChars = text.toCharArray();
        int count = 0;
        for (int i = 0; i < oldChars.length - 5; i++) {
            if (oldChars[i] == 'w' && oldChars[i + 1] == 'o' && oldChars[i + 2] == 'r' && oldChars[i + 3] == 'd') {
                count++;
            }
        }

        char[] newChars = new char[oldChars.length + 2 * count];
        count = 0;
        for (int i = 0; i < newChars.length; i++) {
            if (oldChars[count] == 'w' && oldChars[count + 1] == 'o' && oldChars[count + 2] == 'r' && oldChars[count + 3] == 'd') {
                newChars[i] = 'l';
                i++;
                newChars[i] = 'e';
                i++;
                newChars[i] = 't';
                i++;
                newChars[i] = 't';
                i++;
                newChars[i] = 'e';
                i++;
                newChars[i] = 'r';
                count += 3;
            } else {
                newChars[i] = oldChars[count];
            }
            count++;
        }
        return String.valueOf(newChars);
    }
}
