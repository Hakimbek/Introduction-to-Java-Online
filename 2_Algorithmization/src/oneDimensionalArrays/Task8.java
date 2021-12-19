package oneDimensionalArrays;

/**
 * Дана последовательность целых чисел a1, a2,...an. Образовать новую последовательность, выбросив из
 * исходной те члены, которые равны min(a1, a2,...an)
 */
public class Task8 {
    public static void main(String[] args) {
        int[] array = {12, 2, 5, 65, 88, 74};

        // Find min
        int min = array[0];

        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }

        int count = 0;
        for (int i : array) {
            if (i == min) {
                count++;
            }
        }

        int[] newArray = new int[array.length - count];
        int countNewArray = 0;
        for (int j : array) {
            if (j == min) {
                continue;
            }
            newArray[countNewArray] = j;
            countNewArray++;
        }

        // Print
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i] + "]");
            } else {
                System.out.print(array[i] + ", ");
            }
        }

        // Print new array
        System.out.print("\n[");
        for (int i = 0; i < newArray.length; i++) {
            if (i == newArray.length - 1) {
                System.out.print(newArray[i] + "]");
            } else {
                System.out.print(newArray[i] + ", ");
            }
        }
    }
}
