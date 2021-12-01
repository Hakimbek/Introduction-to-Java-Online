package decomposition;

/**
 * Даны натуральные числа K и N. Написать метод(методы) формирования массива А,
 * элементами которого явдяются числа, сумма цифр которых равна K и которые не больше N.
 */
public class Task12 {
    public static void main(String[] args) {
        // Generate array
        int[] array = findEqualsNum(9, 50);

        // Print
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    // Find sum of number digits
    public static int calculateSumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // Generate array. Sum of digits of array elements equal K and elements less than N
    public static int[] findEqualsNum(int k, int n) {
        int[] array = new int[3];

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (calculateSumOfDigits(i) == k) {
                array[count] = i;
                count++;
            }

            if (count == array.length) {
                int[] tempArray = new int[2 * count];
                for (int j = 0; j < array.length; j++) {
                    tempArray[j] = array[j];
                }
                array = tempArray;
            }
        }
        return array;
    }
}
