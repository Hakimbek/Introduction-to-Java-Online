package com.epam.consoleProgramm;

import com.epam.service.BookService;

import java.io.IOException;
import java.util.Scanner;

// Кабинет админостратора
public class AdministratorCabinet {
    // Администратор может
    // 1 - переименовать название книги или автора книги
    // 2 - просматривать книги
        // 1 - вывести все книги на консоль
        // 2 - найти книги по названию
        // 3 - найти книги по автору
        // 4 - выйти из режима просмотр
    // 3 - добавить новую книгу
    // 4 - выйти из кабинета
    public static void enterToAdministratorCabinet() throws IOException, ClassNotFoundException {
        int num = 1;
        while (num > 0) {
            System.out.println("------------------------------------------------------------------");
            System.out.println("Edit book => 1 | Browse books => 2 | Add new book => 3 | Exit => 0");
            System.out.println("------------------------------------------------------------------");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter: ");
            int selectedNum = scanner.nextInt();

            if (selectedNum == 1) {
                System.out.print("Enter book id: ");
                String id = scanner.next();

                System.out.print("Enter name: ");
                scanner = new Scanner(System.in);
                String newName = scanner.next();

                System.out.print("Enter author: ");
                scanner = new Scanner(System.in);
                String newAuthor = scanner.next();

                BookService.editBook(id, newName, newAuthor);
            } else if (selectedNum == 2) {
                UserCabinet.enterToUserCabinet();
            } else if (selectedNum == 3) {
                System.out.print("Enter name: ");
                scanner = new Scanner(System.in);
                String name = scanner.next();

                System.out.print("Enter author: ");
                scanner = new Scanner(System.in);
                String author = scanner.next();

                BookService.addBook(name, author);
            } else if (selectedNum == 0) {
                num = 0;
            } else {
                System.out.println("Enter correct number!");
            }
        }
    }

}
