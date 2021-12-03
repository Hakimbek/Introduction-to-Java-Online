package stringAsObject;

/**
 * Подсчитать сколько раз среди символов заданной строки встречается буква 'a'.
 */
public class Task5 {
    public static void main(String[] args) {
        String text  = "lkjhklhkljhakjhklhadadshlkahdklhjlhkaa";
        System.out.println(count(text));
    }

    public static int count(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a') {
                count++;
            }
        }
        return count;
    }
}
