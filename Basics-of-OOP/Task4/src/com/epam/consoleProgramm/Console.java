package com.epam.consoleProgramm;

import com.epam.dragon.Dragon;
import com.epam.logic.Logic;

import java.util.Scanner;

public class Console {

    public static void start() {
        // Create Dragon object
        Dragon dragon = new Dragon();

        System.out.println("Просмотр сокровищ => 1\n" +
                "Самое дорогое сокровище => 2\n" +
                "Сокровища на заданную сумму => 3\n" +
                "Выход => 0\n----------------------------");

        int num = 1;
        while (num > 0) {
            System.out.print("Введите число:");
            Scanner scanner = new Scanner(System.in);
            int selectedNum = scanner.nextInt();
            if (selectedNum == 1) {
                Logic.print(dragon.getTreasures());
            }  else if (selectedNum == 2) {
                Logic.findMostValuableTreasure(dragon.getTreasures());
            } else if (selectedNum == 3) {
                System.out.print("Введите цену:");
                int price = scanner.nextInt();
                Logic.treasuresOfGivenPrice(price, dragon.getTreasures());
            } else if (selectedNum == 0) {
                num = 0;
            } else {
                System.out.println("Вводите числа в диапазоне 0-3");
            }
        }
    }

}
