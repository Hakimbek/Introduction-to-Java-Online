package decomposition;

/**
 * Даны числа X, Y, Z, T - длины сторон четырехугольника. Написать метод(методы) вычисления его
 * площади, если угол между сторонами длиной X и Y - прямой.
 */
public class Task9 {
    public static void main(String[] args) {
        System.out.println(calculateSquareOfQuadrangle(4,3,5,8));
    }

    // Находит площадь прямоугольного треугольника
    public static double calculateSquareOfRightTriangle(double a, double b) {
        return a * b / 2;
    }

    // Находит гипотенузу прямоугольного треугольника по катетам (a, b)
    public static double findHypothesis(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    // Находит площадь треугольника по формуле Герона
    public static double calculateSquareByGHeron(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    // Находит площадь четырехугольникаб у которого угол между сторонами X, Y прямой
    public static double calculateSquareOfQuadrangle(int x, int y, int z, int t) {
        return calculateSquareOfRightTriangle(x, y) + calculateSquareByGHeron(z, t, findHypothesis(x, y));
    }
}
