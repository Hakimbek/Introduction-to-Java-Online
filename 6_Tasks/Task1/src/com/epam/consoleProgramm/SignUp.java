package com.epam.consoleProgramm;

import com.epam.service.UserService;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Scanner;

public class SignUp {
    // Метод, который регестрирует
    public static void signUp() throws GeneralSecurityException, IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.next();
        System.out.print("Enter password: ");
        scanner = new Scanner(System.in);
        String password = scanner.next();

        if (UserService.addUser(username, password)) {
            UserCabinet.enterToUserCabinet();
        } else {
            System.out.println("User name already exist");
        }
    }

}
