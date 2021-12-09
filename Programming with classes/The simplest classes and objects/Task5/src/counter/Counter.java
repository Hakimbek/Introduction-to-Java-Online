package counter;

/**
 * Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
 * на еденицу в заданном диапазоне. Предусмотрите инициализазию счетчика значения по умолчанию
 * и произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
 * позволяющее получить его текущее состоягие. Написать код, демонстрирующий все возможности класса.
 */
public class Counter {
    // Текущее значение десятичного счетчика
    private int current;

    // Максимальное значение счетчика в заданном диапазоне
    private int max;

    // Минимальное значение счетчика в заданном диапазоне
    private int min;

    // Конструктор с входными параметрами
    public Counter(int min, int max, int current) {
        this.min = min;
        this.max = max;
        this.current = current;

        if (max < min) {
            int temp = max;
            max = min;
            min = temp;
        }

        if (current < min) {
            current = min;
        }

        if (current > max) {
            current = max;
        }
    }

    // Default конструктор
    public Counter() {
        this(0, 10, 0);
    }

    // Plus method
    public boolean inc() {
        if (current + 1 <= max) {
            current++;
            return true;
        } else {
            return false;
        }
    }

    // Minus method
    public boolean dec() {
        if (current - 1 >= min) {
            current--;
            return true;
        } else {
            return false;
        }
    }

    // Методы get- и set-
    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        if (current < min) {
            this.current = min;
        }

        if (current > max) {
            this.current = max;
        }

        this.current = current;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }
}
