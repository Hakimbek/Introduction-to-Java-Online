package com.epam.book;

import java.io.Serializable;
import java.util.UUID;

public class Book implements Serializable {
    // Уникальный id книги
    private UUID uuid = UUID.randomUUID();

    // Название книги
    private String name;

    // Автор книги
    private String author;

    // Constructor
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "uuid=" + uuid +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    // get- and set-
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
