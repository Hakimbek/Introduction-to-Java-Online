package charArray;

/**
 * Дан массив названий переменных в camelCase. Переобразовать названия в snake_case.
 */
public class Task1 {
    public static void main(String[] args) {
        String[] array = {"camelCase", "javaScript", "objectOrientedProgramming"};

        // Convert
        convertToSnakeCase(array);

        // Print
        for (String s : array) {
            System.out.println(s);
        }
    }

    // The method that converts camelCase to snake_case
    public static void convertToSnakeCase(String[] text) {
        for (int i = 0; i < text.length; i++) {
            char[] oldChars = text[i].toCharArray();
            char[] newChars = new char[text[i].length() + 1];
            int count = 0;
            for (int j = 0; j < newChars.length; j++) {
                if (Character.isUpperCase(oldChars[count])) {
                    newChars[j] = '_';
                    j++;
                }
                newChars[j] = Character.toLowerCase(oldChars[count]);
                count++;
            }
            text[i] = String.valueOf(newChars);
        }
    }
}
