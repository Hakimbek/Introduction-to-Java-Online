package com.epam;

import com.epam.item.Item;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PresentBuilder presentBuilder = new PresentBuilder();

        Present birthdayPresent = presentBuilder.birthdayPresent();
        System.out.println("Birthday present");
        birthdayPresent.showItems();
        System.out.println("Total cost: " + birthdayPresent.getCost());

        Present weddingPresent = presentBuilder.weddingPresent();
        System.out.println("Wedding present");
        weddingPresent.showItems();
        System.out.println("Total cost: " + weddingPresent.getCost());

        Present myOwnPresent = new Present();
        System.out.println("Выбрать подарки и добавить в мои => 1\n" +
                "Посмотреть мои подарки => 2\n" +
                "Посмотреть общую сумму подарок => 3\n" +
                "Выход => 0");
        int num = 1;
        while (num > 0) {
            System.out.print("Введите: ");
            Scanner scanner = new Scanner(System.in);
            int selectedNum = scanner.nextInt();
            if (selectedNum == 1) {
                System.out.print("Введите название подарка(flower или gift): ");
                String present = scanner.next();
                AbstractFactory factory = FactoryProducer.getFactory(present);
                scanner = new Scanner(System.in);
                if (factory != null) {
                    if (present.equalsIgnoreCase("flower")) {
                        System.out.print("Введите тип(rose, iris, calendula): ");
                    } else {
                        System.out.print("Введите тип(lollipop, iceCream, chocolate): ");
                    }
                    String item = scanner.next();
                    Item factoryItem = factory.getItem(item);
                    myOwnPresent.addItem(factoryItem);
                    System.out.println("Подарок добавлен");
                } else {
                    System.out.println("Такого подарка пока не существует");
                }
            } else if (selectedNum == 2) {
                myOwnPresent.showItems();
            } else if (selectedNum == 3) {
                System.out.println("Total cost: " + myOwnPresent.getCost());
            } else if (selectedNum == 0) {
                num = 0;
            } else {
                System.out.println("Введите корректное значение");
            }
        }
    }
}
