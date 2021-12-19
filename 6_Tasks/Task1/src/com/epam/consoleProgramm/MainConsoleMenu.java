package com.epam.consoleProgramm;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Scanner;

// Основное меню
public class MainConsoleMenu {
    // Метод, который запускает программу
    // В этой части программы в можете
    // 1 - Войти в свой кабинет
    // 2 - Зарегестрироваться
    // 3 - Выйти из программы
    public static void start() {
        int num = 1;
        while (num > 0) {
            System.out.println("---------------------------------------");
            System.out.println("Sign In => 1 | Sign Up => 2 | Exit => 0");
            System.out.println("---------------------------------------");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter: ");
            int selectedNum = scanner.nextInt();
            if (selectedNum == 1) {
                try {
                    SignIn.signIn();
                } catch (GeneralSecurityException | IOException | ClassNotFoundException e) {
                    System.out.println("Error in sign in process");
                }
            } else if (selectedNum == 2) {
                try {
                    SignUp.signUp();
                } catch (GeneralSecurityException | IOException | ClassNotFoundException e) {
                    System.out.println("Error in sign up process");
                }
            } else if (selectedNum == 0) {
                num = 0;
            } else {
                System.out.println("Enter correct number!");
            }
        }
    }

}
