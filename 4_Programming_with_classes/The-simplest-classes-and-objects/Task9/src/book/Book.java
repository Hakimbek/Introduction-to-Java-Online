package book;

import java.util.Arrays;

/**
 * Создать класс Book, спецификация которого приведена ниже. Определить конструкторы,
 * set-и get- методы и метод  toString(). Создать второй класс, агрегирующий массив типа Book,
 * с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
 *
 * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 * Найти и вывести:
 *  a) список книг заданного автора;
 *  b) список книг, выпущенных заданным издательством;
 *  c) список книг, выпущенных после заданного года.
 */
public class Book {
    // Уникальный id
    private int id;

    // Название
    private String name;

    // Автор(ы)
    private String[] author;

    // Издательство
    private String publisher;

    // Год издания
    private int year;

    // Количество страниц
    private int numberOfPages;

    // Цена
    private double price;

    // Тип переплета
    private String type;

    // Конструктор с входными параметрами
    public Book(int id, String name, String[] author, String publisher, int year, int numberOfPages, double price, String type) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.type = type;
    }

    // Default constructor
    public Book() {
    }

    // Методы get- и set-
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getAuthor() {
        return author;
    }

    public void setAuthor(String[] author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Метод toString()
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author=" + Arrays.toString(author) +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", numberOfPages=" + numberOfPages +
                ", price=" + price +
                ", type='" + type + '\'' +
                '}';
    }
}
