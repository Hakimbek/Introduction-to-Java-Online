package book;

import java.util.Arrays;

public class BookAggregation {
    // Массив итпа Book
    private Book[] books;

    // Крнструктор с входными параметрами
    public BookAggregation(Book[] books) {
        this.books = books;
    }

    // Default constructor
    public BookAggregation() {
    }

    // Методы get- и set-
    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    // Метод toString()
    @Override
    public String toString() {
        return "BookAggregation{" +
                "books=" + Arrays.toString(books) +
                '}';
    }

    // Выводит список книг заданного автора
    public void getByAuthor(String author) {
        for (Book book : books) {
            for (String s : book.getAuthor()) {
                if (s.equals(author)) {
                    System.out.println(book);
                }
            }
        }
    }

    // Выводит список книг, выпущенных заданным издательством
    public void getByPublisher(String publisher) {
        for (Book book : books) {
            if (book.getPublisher().equals(publisher)) {
                System.out.println(book);
            }
        }
    }

    // Выводит список книг, выпущенных после заданного года
    public void getAfterTheYear(int year) {
        for (Book book : books) {
            if (book.getYear() > year) {
                System.out.println(book);
            }
        }
    }
}
