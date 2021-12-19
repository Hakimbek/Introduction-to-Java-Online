package com.epam.service;

import com.epam.book.Book;

import java.io.*;
import java.util.ArrayList;

public class BookService {

    /**
     * Print all books from file
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static void printAllBooks() throws IOException, ClassNotFoundException {
        // Получает все книги из файла и приводит в ArrayList
        FileInputStream fileInputStream = new FileInputStream("books.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ArrayList arrayList = (ArrayList) objectInputStream.readObject();

        // Выводит все книги в консоль
        for (Object o : arrayList) {
            System.out.println(o);
        }
        objectInputStream.close();
        fileInputStream.close();
    }


    /**
     * Get books by name
     * @param name - book name
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static void printByName(String name) throws IOException, ClassNotFoundException {
        // Получает все книги из файла и приводит в ArrayList
        FileInputStream fileInputStream = new FileInputStream("books.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ArrayList<Book> arrayList = (ArrayList<Book>) objectInputStream.readObject();

        // Выводит все книги в консоль если названия совпадают
        for (Book book :  arrayList) {
            if (book.getName().equals(name)) {
                System.out.println(book);
            }
        }
        objectInputStream.close();
        fileInputStream.close();
    }

    /**
     * Get books by author
     * @param author - book author
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static void printByAuthor(String author) throws IOException, ClassNotFoundException {
        // Получает все книги из файла и приводит в ArrayList
        FileInputStream fileInputStream = new FileInputStream("books.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ArrayList<Book> arrayList = (ArrayList<Book>) objectInputStream.readObject();

        // Выводит все книги в консоль если авторы совпадают
        for (Book book :  arrayList) {
            if (book.getAuthor().equals(author)) {
                System.out.println(book);
            }
        }
        objectInputStream.close();
        fileInputStream.close();
    }

    /**
     * Edit book
     * @param id - book id
     * @param name - book name
     * @param author - book author
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static void editBook(String id, String name, String author) throws IOException, ClassNotFoundException {
        // Получает все книги из файла и приводит в ArrayList
        FileInputStream fileInputStream = new FileInputStream("books.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ArrayList<Book> arrayList = (ArrayList<Book>) objectInputStream.readObject();

        // Edits book name and author name
        for (Book book :  arrayList) {
            if (book.getUuid().equals(id)) {
                book.setName(name);
                book.setAuthor(author);
            }
        }
        objectInputStream.close();
        fileInputStream.close();
    }

    /**
     * Add book
     * @param name - book name
     * @param author - book author
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static void addBook(String name, String author) throws IOException, ClassNotFoundException {
        // Получает все книги из файла и приводит в ArrayList
        FileInputStream fileInputStream = new FileInputStream("books.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ArrayList<Book> arrayList = (ArrayList<Book>) objectInputStream.readObject();

        // Добавляет новую книгу в лист
        arrayList.add(new Book(name, author));
        objectInputStream.close();
        fileInputStream.close();

        // Сохраняет лист в файл
        FileOutputStream fileOutputStream = new FileOutputStream("books.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(arrayList);
        objectOutputStream.close();
        fileOutputStream.close();
    }

}
