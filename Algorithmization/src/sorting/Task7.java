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

        int length = firstArr.length +secondArr.length;
        int firstCount = 0;
        int secondCount = 0;
        for (int i = 0; i < length; i++) {
            System.out.print("mergedArray[" + i + "]: ");
            if (secondCount == secondArr.length) {
                System.out.println(firstArr[firstCount]);
                firstCount++;
            } else if (firstCount == firstArr.length) {
                System.out.println(secondArr[secondCount]);
                secondCount++;
            } else if (firstArr[firstCount] < secondArr[secondCount]) {
                System.out.println(firstArr[firstCount]);
                firstCount++;
            } else {
                System.out.println(secondArr[secondCount]);
                secondCount++;
            }
        }
    }
}
