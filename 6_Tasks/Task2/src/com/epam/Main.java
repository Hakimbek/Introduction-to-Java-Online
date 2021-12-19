package com.epam;

import com.epam.consoleProgramm.Console;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            Console.start();
        } catch (ClassNotFoundException e) {
            System.out.println("Error");
        }
    }
}
