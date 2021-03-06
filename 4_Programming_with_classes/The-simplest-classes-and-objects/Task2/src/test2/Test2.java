package test2;

/**
 * Создайте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами.
 * Добавьте конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get-
 * методы для полей экземпляра класса.
 */
public class Test2 {
    // Первая переменная
    private int firsVariable;

    // Вторая переменная
    private int secondVariable;

    // Конструктор с входными параметрами
    public Test2(int firsVariable, int secondVariable) {
        this.firsVariable = firsVariable;
        this.secondVariable = secondVariable;
    }

    // Default конструктор
    public Test2() {}

    // Методы set- и get-
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
