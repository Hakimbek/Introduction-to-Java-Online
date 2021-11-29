package oneDimensionalArrays;

/**
 * Дан чело численный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй
 * элемент(освободившиеся элементы заполнить нулями). Примечание дополнительный массив не использовать.
 */
public class Task10 {
    public static void main(String[] args) {
        int[] array = {45, 1, 5, 6, 8, 88, 10, 45, 9};

        // Print initial array
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i] + "]");
            } else {
                System.out.print(array[i] + ", ");
            }
        }

        // Shrink array
        int evenNum = 2;
        int count = 1;

        for (int i = 1; i < array.length / 2 + 1; i++) {
            if (evenNum < array.length) {
                array[i] = array[evenNum];
                count++;
            }
            evenNum += 2;
        }

        for (int i = count; i < array.length; i++) {
            array[i] = 0;
        }

        // Print changed array
        System.out.print("\n[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i] + "]");
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }
}
