package stringArrays;

/**
 * Дан массив названий переменных в camelCase. Переобразовать названия в snake_case.
 */
public class Task1 {
    public static void main(String[] args) {
        String[] array = {"camelCase", "javaScript", "objectOrientedProgramming"};

        // Covers to snake case
        String[] snakeCase = convertToSnakeCase(array);

        // Print
        for (String text : snakeCase) {
            System.out.println(text);
        }
    }

    // The method that converts camelCase to snake_case
    public static String[] convertToSnakeCase(String[] array) {
        String[] snaKeCase = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            String[] split = array[i].split("(?=\\p{Upper})");
            for (int j = 1; j < split.length; j++) {
                split[j] =  "_" + split[j].toLowerCase();
            }
            StringBuilder convertedText = new StringBuilder();
            for (String text : split) {
                convertedText.append(text);
            }
            snaKeCase[i] = convertedText.toString();
        }
        return snaKeCase;
    }
}
