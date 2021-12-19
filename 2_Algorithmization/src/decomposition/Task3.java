package decomposition;

/**
 * Вычислить площадь правильного шестиугольника со стороной а,
 * используя метод вычисления площади треугольника
 */
public class Task3 {
    public static void main(String[] args) {
        int a = 4;

        // Calculate square and print
        System.out.println(calculateSquareOfHexagon(a));
    }

    //  The method that calculate square of triangle
    public static double calculateSquareOfTriangle(int a) {
        return Math.sqrt(3) * Math.pow(a, 2) / 4;
    }

    // The method that calculate square of hexagon
    public static double calculateSquareOfHexagon(int a) {
        return 6 * calculateSquareOfTriangle(a);
    }


}
