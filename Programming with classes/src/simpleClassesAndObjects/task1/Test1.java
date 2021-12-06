package simpleClassesAndObjects.task1;

/**
 * Создайте класс Test1 с двумя переменными. Добавьте метод вывода на экран и методы изменения
 * этих переменных. Добавьте метод, который находит суммы значений этих переменных, и метод,
 * который находит наибольшее значение из этих двух переменных.
 */
public class Test1 {
    private int firsVariable;
    private int secondVariable;

    public void print() {
        System.out.println("Firs variable" + firsVariable);
        System.out.println("Second variable" + secondVariable);
    }

    public void sum() {
        int sum = firsVariable + secondVariable;
        System.out.println("Sum: " + sum);
    }

    public void findMax() {
        if (firsVariable > secondVariable) {
            System.out.println("Max: " + firsVariable);
        } else {
            System.out.println("Max: " + secondVariable);
        }
    }

    public void setFirsVariable(int firsVariable) {
        this.firsVariable = firsVariable;
    }

    public void setSecondVariable(int secondVariable) {
        this.secondVariable = secondVariable;
    }
}
