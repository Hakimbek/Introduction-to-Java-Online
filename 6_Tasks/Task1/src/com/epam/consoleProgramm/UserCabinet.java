package com.epam.consoleProgramm;

import com.epam.service.BookService;

import java.io.IOException;
import java.util.Scanner;

// Кабинет полбзователя со статусом USER
public class UserCabinet {
    // USER может
    // 1 - вывести все книги на консоль
    // 2 - найти книги по названию
    // 3 - найти книги по автору
    // 4 - выйти из кабинета
    public static void enterToUserCabinet() throws IOException, ClassNotFoundException {
        int num = 1;
        while (num > 0) {
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("Get all books => 1 | Get book by name => 2 | Get book by author => 3 | Exit => 0");
            System.out.println("--------------------------------------------------------------------------------");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter: ");
            int selectedNum = scanner.nextInt();

            if (selectedNum == 1) {
                BookService.printAllBooks();
            } else if (selectedNum == 2) {
                System.out.print("Enter book name: ");
                String name = scanner.next();
                BookService.printByName(name);
            } else if (selectedNum == 3) {
                System.out.print("Enter book author: ");
                String author = scanner.next();
                BookService.printByAuthor(author);
            } else if (selectedNum == 0) {
                num = 0;
            } else {
                System.out.println("Enter correct number!");
            }
        }
    }

}
