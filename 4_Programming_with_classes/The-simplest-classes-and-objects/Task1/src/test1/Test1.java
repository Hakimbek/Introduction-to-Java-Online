package test1;

/**
 * Создайте класс Test1 с двумя переменными. Добавьте метод вывода на экран и методы изменения
 * этих переменных. Добавьте метод, который находит суммы значений этих переменных, и метод,
 * который находит наибольшее значение из этих двух переменных.
 */
public class Test1 {
    // Первая переменная
    private int firsVariable;

    // Вторая переменная
    private int secondVariable;

    // Конструктор с входными параметрами
    public Test1(int firsVariable, int secondVariable) {
        this.firsVariable = firsVariable;
        this.secondVariable = secondVariable;
    }

    // Default конструктор
    public Test1() {
    }

    // Метод, который выводит переменные на экран
    public void print() {
        System.out.println("Firs variable: " + firsVariable);
        System.out.println("Second variable: " + secondVariable);
    }

    // Метод, который находит суммы значений этих переменных
    public void sum() {
        int sum = firsVariable + secondVariable;
        System.out.println("Sum: " + sum);
    }

    // Метод, который находит наибольшее значение из этих двух переменных
    public void findMax() {
        if (firsVariable > secondVariable) {
            System.out.println("Max: " + firsVariable);
        } else {
            System.out.println("Max: " + secondVariable);
        }
    }

    // Мутоды get- и set-
    public int getFirsVariable() {
        return firsVariable;
    }

    public void setFirsVariable(int firsVariable) {
        this.firsVariable = firsVariable;
    }

    public int getSecondVariable() {
        return secondVariable;
    }

    public void setSecondVariable(int secondVariable) {
        this.secondVariable = secondVariable;
    }
}
