package state;

public class City {
    // Название города
    private String name;

    // Площадь города
    private double square;

    // Конструктор с входными параметрами
    public City(String name, double square) {
        this.name = name;
        this.square = square;
    }

    // Default constructor
    public City() {
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
