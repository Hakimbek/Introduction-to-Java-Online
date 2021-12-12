package stringObject;

/**
 * Проверить, является ли заданное слово полиндромом.
 */
public class Task3 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("aziza"));
    }

    // The method returns true if word is palindrome else returns false
    public static boolean isPalindrome(String text) {
        boolean isPalindrome = true;
        int end = text.length() - 1;
        for (int i = 0; i < text.length() / 2; i++) {
            if (!(text.charAt(i) == text.charAt(end))) {
                isPalindrome = false;
                break;
            }
            end--;
        }
        return isPalindrome;
    }
}
