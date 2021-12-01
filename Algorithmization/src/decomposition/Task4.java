package decomposition;

/**
 * На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие,
 * между какими из пар точексамое большое растояние. Указание. Координаты точек занести в массив.
 */
public class Task4 {
    public static void main(String[] args) {
        int[][] arr = {{1,1}, {5,1}, {11,1}, {2,1}, {10, 1}};

        // Calculate max distance and print
        System.out.println(calculate(arr));
    }

    // Calculate distance between points
    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Calculate max distance between point in array
    public static double calculate(int[][] arr) {
        double maxDistance = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (maxDistance < calculateDistance(arr[i][0], arr[i][1], arr[j][0], arr[j][1])) {
                    maxDistance = calculateDistance(arr[i][0], arr[i][1], arr[j][0], arr[j][1]);
                }
            }
        }
        return maxDistance;
    }

}
