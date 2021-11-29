package linearPrograms;

/**
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 * (b + √(b^2 + 4ac))/2a - a^3c + b^(-2);
 */
public class Task2 {
    public static void main(String[] args) {
       calculate(1,3,4);
    }

    public static void calculate(double a, double b, double c) {
        if (a != 0 && Math.sqrt(b*b + 4*a*c) >= 0) {
            double res = (b + Math.sqrt(b*b + 4*a*c))/(2*a) - a*a*a*c + 1/(b*b);
            System.out.println("Solution: " + res);
        } else {
            System.out.println("No solution");
        }
    }
}
