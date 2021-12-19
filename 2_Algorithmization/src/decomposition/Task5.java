package decomposition;

/**
 * Составить программу, которая в массиве A[N] находит второе по величине число
 * (вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов)
 */
public class Task5 {
    public static void main(String[] args) {
        int[] arr = {5, 1, 56, 8, 95, 45, 12};

        // Find second largest num and print
        System.out.println(findSecondLargestNumber(arr));
    }

    // The method that finds max number of array
    public static int findMax(int[] arr) {
        int maxNumber = 0;
        for (int num : arr) {
            if (num > maxNumber) {
                maxNumber = num;
            }
        }
        return maxNumber;
    }

    // The method that finds second larges number of array
    public static int findSecondLargestNumber(int[] arr) {
        int secondLargestNum = 0;
        int maxNumber = findMax(arr);
        for (int num : arr) {
            if (num > secondLargestNum && num < maxNumber) {
                secondLargestNum = num;
            }
        }
        return secondLargestNum;
    }
}
