package oneDimensionalArrays;

import java.util.*;

/**
 * В массиве целых чисел с количеством элементов n найти наиболее часто встречающее число.
 * Если таких чисел несколько, то определить наименьшее из них.
 */
public class Task9 {
    public static void main(String[] args) {
        int[] array = {54, 56, 55, 8, 11, 5, 66, 3, 3, 2, 3, 2, 2};

        // First way
        int frequentNumber = 0;
        int repetitionCount = 0;
        for (int i : array) {
            int count = 0;
            for (int j : array) {
                if (i == j) {
                    count++;
                }
            }
            if (count > repetitionCount) {
                repetitionCount = count;
                frequentNumber = i;
            }
            if (count == repetitionCount && i < frequentNumber) {
                frequentNumber = i;
            }
        }

        // Print
        System.out.println(frequentNumber);


        // Second way (faster)
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i : array) {
            if (map.containsKey(i)) {
                map.replace(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        int count = 0;
        int max = 0;
        int keyIndex = 0;
        Collection<Integer> values = map.values();
        for (Integer value : values) {
            if (max < value) {
                max = value;
                keyIndex = count;
            }
            count++;
        }
        Object[] keys = map.keySet().toArray();

        // Print
        System.out.println(keys[keyIndex]);
    }
}
