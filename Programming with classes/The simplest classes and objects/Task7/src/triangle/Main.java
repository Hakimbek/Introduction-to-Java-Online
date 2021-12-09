package triangle;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(4, 3, 5);
        System.out.println(triangle.isTriangle());

        System.out.println(triangle.calculatePerimeter());
        System.out.println(triangle.calculateSquare());
        System.out.println(triangle.intersectionPoint());
    }
}
