package sorting;

/**
 * Даны две последовательности a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm.
 * Образовать их них новую последовательность чисел, чтобы она тоже быда не убывающей.
 * Примечание. Дополнительный массив не использовать.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] firstArr = {1, 4, 5, 10, 15, 20, 85};
        int[] secondArr = {8, 16, 22, 44, 70, 80, 88};

        // Create new mergedArray
        int[] mergedArray = new int[firstArr.length + secondArr.length];

        // Merge arrays and sort in ascending order
        int firstCount = 0;
        int secondCount = 0;
        for (int i = 0; i < mergedArray.length; i++) {
            if (secondCount == secondArr.length) {
                mergedArray[i] = firstArr[firstCount];
                firstCount++;
            } else if (firstCount == firstArr.length) {
                mergedArray[i] = secondArr[secondCount];
                secondCount++;
            } else if (firstArr[firstCount] < secondArr[secondCount]) {
                mergedArray[i] = firstArr[firstCount];
                firstCount++;
            } else {
                mergedArray[i] = secondArr[secondCount];
                secondCount++;
            }
        }

        // Print mergedArray
        for (int i : mergedArray) {
            System.out.print(i + " ");
        }
    }
}
