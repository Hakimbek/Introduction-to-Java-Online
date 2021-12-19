package state;

public class District {
    // Название района
    private String name;

    // Площадь района
    private double square;

    // Конструктор с входными параметрами
    public District(String name, double square) {
        this.name = name;
        this.square = square;
    }

    // Default constructor
    public District() {
    }

    // Методы get- и set-
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSquare() {
        return square;
    }

    public void setSquare(Double square) {
        this.square = square;
    }
}
