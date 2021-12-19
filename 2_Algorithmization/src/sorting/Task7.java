package sorting;

/**
 * Пусть даны две неубывающие последовательности действительных чисел
 * a1 <= a2 ... <= a и b1 <= b2 ... <= bm. Требуется указать те места, на которые нужно вставлять
 * элементы последовательности b1 <= b2 ... <= bm в первую последовательность так,
 * чтобы новая последовательность оставалась возрастающей.
 */
public class Task7 {
    public static void main(String[] args) {
        int[] firstArr = {11, 15, 20, 36, 38, 40};
        int[] secondArr = {2, 19, 22, 26, 28, 35, 50};

        boolean lessThan = false;
        int firstCount = 0;
        int secondCount = 0;
        for (int i = 0; i < firstArr.length; i++) {
            if (firstArr[firstCount] > secondArr[secondCount]) {
                System.out.print("firstArr[from " + (i - 1) + " to " + i + "]: ");
                lessThan = true;
            }

            while (firstArr[firstCount] > secondArr[secondCount]) {
                System.out.print(secondArr[secondCount] + " ");
                secondCount++;
            }
            firstCount++;

            if (lessThan) {
                System.out.println();
            }
            lessThan = false;
         }

        if (secondArr.length > firstArr.length) {
            System.out.print("firstArr[from " + (firstCount - 1) + " to ..." + "]: ");
            for (int i = secondCount; i < secondArr.length; i++) {
                System.out.print(secondArr[i] + " ");
            }
        }
    }
}
