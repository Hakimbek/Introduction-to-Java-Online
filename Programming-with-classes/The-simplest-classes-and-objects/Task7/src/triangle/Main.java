package triangle;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(4, 3, 5);
        System.out.println(triangle.isTriangle());

        triangle.calculatePerimeter();
        triangle.calculateSquare();
        triangle.intersectionPoint();
    }
}
