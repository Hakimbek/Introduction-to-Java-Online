package sorting;

public class Task8 {
    public static void main(String[] args) {
        int[] numerator = {2, 5, 6, 8, 10, 74, 25, 22, 1};
        int[] denomerator = {10, 6, 8, 14, 12, 90, 26, 30, 50};

        sort(numerator, denomerator);

        for (int i = 0; i < numerator.length; i++) {
            System.out.println(numerator[i] + "/" + denomerator[i]);
        }

        System.out.println("Общий знаменатель: " + gcd(denomerator));
    }

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
