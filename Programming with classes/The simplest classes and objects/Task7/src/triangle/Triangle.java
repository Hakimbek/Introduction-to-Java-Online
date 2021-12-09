package triangle;

/**
 * Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов,
 * вычисления площади, периметра и точки пересечения медиан.
 */
public class Triangle {
    private double a;

    private double b;

    private double c;

    // Конструктор с входными параметрами
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Default конструктор
    public Triangle() {
    }

    // Метод get- и set-
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    // Метод проверяет является ли фигура треугольником
    public boolean isTriangle() {
        return a + b > c && a + c > b && b + c > a;
    }

    // Метод, который находит периметр
    public double calculatePerimeter() {
        return a + b + c;
    }

    // Метод, который находит площадь
    public double calculateSquare() {
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    // Метод, который находит тичку пересечения медиан
    public double intersectionPoint() {
        double median = Math.sqrt(2 * Math.pow(a, 2) + 2 * Math.pow(b, 2) - Math.pow(c, 2)) / 2;
        return (median / 3) * 2;
    }
}
