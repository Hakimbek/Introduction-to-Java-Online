package com.epam.treasure;

public abstract class Treasure {
    // Название сокровища
    private String name;

    // Из чего сделан
    private String type;

    // Цена
    private int price;

    // Конструктор
    public Treasure(String name, String type, int price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public Treasure() {
    }

    // get- and set-
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Treasure{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
