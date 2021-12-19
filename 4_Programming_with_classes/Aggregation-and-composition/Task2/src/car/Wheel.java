package car;

import java.time.LocalDate;

public class Wheel {
    // Год выпуска
    private LocalDate year;

    // Тип
    private String type;

    // Цена
    private double price;

    // Размер
    private int size;

    // Конструктор с входными параметрами
    public Wheel(LocalDate year, String type, double price, int size) {
        this.year = year;
        this.type = type;
        this.price = price;
        this.size = size;
    }

    // Default constructor
    public Wheel() {
    }

    // Методы get- и set-
    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
