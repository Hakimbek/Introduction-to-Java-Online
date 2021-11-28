package sorting;

/**
 * Заданы два одномерных масива с различным количеством элементов и натуральное число k.
 * Объеденить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого,
 * при этом не используя дополнительный массив.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] firstArr = {5, 1, 3, 56, 22, 7, 89, 10};
        int[] secondArr = {11, 13, 30, 6, 2, 5};

        // k - must be less than firstArr length
        int k = 7;

        // Create new merged array
        int[] mergedArray = new int[firstArr.length + secondArr.length];

        // Merge arrays
        int count = 0;
        for (int i = 0; i < mergedArray.length; i++) {
            if (i == k) {
                for (int j = 0; j < secondArr.length; j++, i++) {
                    mergedArray[i] = secondArr[j];
                }
            }
            mergedArray[i] = firstArr[count];
            count++;
        }

        // Print mergedArray
        for (int i : mergedArray) {
            System.out.print(i + " ");
        }
    }
}
