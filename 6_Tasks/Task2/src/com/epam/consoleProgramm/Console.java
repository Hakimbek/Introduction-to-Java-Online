package com.epam.consoleProgramm;

import com.epam.service.NoteService;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class Console {
    // In console program you can
    // 1 - get all notes
    // 2 - get notes by theme
    // 3 - get notes by date
    // 4 - get notes by email
    // 5 - get notes by message
    // 6 - get notes by word in message
    // 7 - add new note
    // 0 - exit
    public static void start() throws IOException, ClassNotFoundException {
        int num = 1;
        while (num > 0) {
            System.out.println("Get all notes => 1 | Get notes by theme => 2 | Get notes by data => 3 | " +
                    "Get notes by email => 4 | Get notes by message => 5 | Get by word in message => 6 | " +
                    "Add new note => 7 | Exit => 0");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter: ");
            int selectedNumber = scanner.nextInt();
            if (selectedNumber == 1) {
                NoteService.getAll();
            } else if (selectedNumber == 2) {
                System.out.print("Enter theme: ");
                String theme = scanner.next();
                NoteService.getByTheme(theme);
            } else if (selectedNumber == 3) {
                System.out.print("Enter data(yyyy-mm-dd): ");
                String data = scanner.next();
                NoteService.getByDate(LocalDate.parse(data));
            } else if (selectedNumber == 4) {
                System.out.print("Enter email: ");
                String email = scanner.next();
                NoteService.getByEmail(email);
            } else if (selectedNumber == 5) {
                scanner = new Scanner(System.in);
                System.out.print("Enter message: ");
                String message = scanner.nextLine();
                NoteService.getByMessage(message);
            } else if (selectedNumber == 6) {
                System.out.print("Enter word: ");
                String word = scanner.next();
                NoteService.getByWord(word);
            } else if (selectedNumber == 7) {
                System.out.print("Enter theme: ");
                String theme = scanner.next();
                scanner = new Scanner(System.in);
                System.out.print("Enter email: ");
                String email = scanner.next();
                scanner = new Scanner(System.in);
                System.out.print("Enter message: ");
                String message = scanner.nextLine();
                NoteService.add(theme, email, message);
            } else if (selectedNumber == 0) {
                num = 0;
            } else {
                System.out.println("Enter correct number");
            }
        }
    }

}
