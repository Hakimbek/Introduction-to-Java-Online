package oneDimensionalArrays;

public class Task6 {
    public static void main(String[] args) {
        int[] array = {12, 25, 65, 87, 2, 3, 5, 85, 11, 6};

        int sum = 0;
        boolean isNormal;

        outerLoop:
        for (int i = 0; i < array.length; i++) {
            isNormal = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isNormal = false;
                    continue outerLoop;
                }
                isNormal = true;
            }

            if (isNormal) {
                sum += array[i];
            }
        }

        System.out.println(sum);
    }
}
