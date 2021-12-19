package payment;

import java.util.ArrayList;

public class Payment {
    // Уникальный идентификатор
    private int uuid;

    // Все продукты которые купили
    private ArrayList<Product> products;

    // Constructor
    public Payment(ArrayList<Product> products) {
        this.products = products;
    }

    // Pay
    public void pay() {
        double price = 0;
        System.out.printf("%10s %10s %10s\n", "Name", "Amount", "Price");
        System.out.printf("%10s %10s %10s\n", "----", "------", "-----");
        for (Product product : products) {
            price += product.getPrice() * product.getAmount();
            System.out.printf("%10s %10s %10s\n", product.getName(), product.getAmount(), product.getPrice());
        }
        System.out.printf("%10s %10s %10s\n", "----", "------", "-----");
        System.out.println("Total: " + price);
        System.out.println("Success! Thank you!");
    }

    // get- and set-
    public int getUuid() {
        return uuid;
    }

    public void setUuid(int uuid) {
        this.uuid = uuid;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    // Product class
    public static class Product {
        // Название товара
        private String name;

        // Цена
        private double price;

        // Количество
        private double amount;

        // Конструктор
        public Product(String name, double price, double amount) {
            this.name = name;
            this.price = price;
            this.amount = amount;
        }

        // Методы get- и set-
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }
    }
}
