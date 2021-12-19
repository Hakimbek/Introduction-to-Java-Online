package cycles;

/**
 * Вывести на экран соответствий между символами и их численными обозначениями в памяти компютера.
 */
public class Task6 {
    public static void main(String[] args) {
        // Print
        for (int i = 0; i < 256; i++) {
            System.out.println((char) i + " - " + i);
        }
    }
}
