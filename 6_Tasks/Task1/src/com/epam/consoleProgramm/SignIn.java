package com.epam.consoleProgramm;

import com.epam.service.AuthService;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Scanner;

public class SignIn {
    // Метод который проверяет и дает доступ в систему
    public static void signIn() throws GeneralSecurityException, IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter login: ");
        String login = scanner.next();
        System.out.print("Enter password: ");
        scanner = new Scanner(System.in);
        String password = scanner.next();

        String status = AuthService.auth(login, password);
        if (status != null) {
            if (status.equalsIgnoreCase("user")) {
                UserCabinet.enterToUserCabinet();
            } else {
                AdministratorCabinet.enterToAdministratorCabinet();
            }
        } else {
            System.out.println("Login or password is incorrect");
        }
    }

}
