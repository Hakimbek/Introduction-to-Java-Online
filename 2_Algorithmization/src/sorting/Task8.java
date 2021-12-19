package sorting;

/**
 * Даны дроби p1/q1, p2/q2, ..., pn/qn (p, q - натуральные). Составить программу, которая приводит эти
 * дроби общему знаменателю и упорядочить их в порядке возростания.
 */
public class Task8 {
    public static void main(String[] args) {
        int[] numerator = {2, 5, 6, 8, 10, 74, 25, 22, 1};
        int[] denomerator = {10, 6, 8, 14, 12, 90, 26, 30, 50};

        // Sort
        sort(numerator, denomerator);

        // Print sorting arrays
        for (int i = 0; i < numerator.length; i++) {
            System.out.println(numerator[i] + "/" + denomerator[i]);
        }

        // Print gcd
        System.out.println("Общий знаменатель: " + gcd(denomerator));
    }

    // Calculate gcd
    public static int gcd(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int a = arr[0];
            int b = arr[i];
            while (b != 0) {
                int temp = a % b;
                a = b;
                b = temp;
            }
            arr[0] = (arr[0] * arr[i]) / a;
        }
        return arr[0];
    }

    // Sorting method
    public static void sort(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if ((double) a[j]/b[j] > (double) a[j+1]/b[j+1]) {
                    int aTemp = a[j];
                    int bTemp = b[j];
                    a[j] = a[j + 1];
                    b[j] = b[j + 1];
                    a[j + 1] = aTemp;
                    b[j + 1] = bTemp;
                }
            }
        }
    }
}
