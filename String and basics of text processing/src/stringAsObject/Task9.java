package stringAsObject;

/**
 * Посчитать количество строчных(маленьких) и прописных(больших) букв в введенной строке.
 * Учитывать только английские буквы.
 */
public class Task9 {
    public static void main(String[] args) {
        count("My name is Hakimbek. I am 22 years old.");
    }

    public static void count(String text) {
        int countUppercase = 0;
        int countLowercase = 0;
        for (int i = 0; i < text.length(); i++) {
            if (String.valueOf(text.charAt(i)).matches(".*[A-Z].*")) {
                countUppercase++;
            }

            if (String.valueOf(text.charAt(i)).matches(".*[a-z].*")) {
                countLowercase++;
            }
        }

        System.out.println("Upper case: " + countUppercase);
        System.out.println("Lower case: " + countLowercase);
    }
}
