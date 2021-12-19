package com.epam.logic;

import com.epam.treasure.*;
import com.epam.typeOfTreasure.Type;

import java.util.ArrayList;
import java.util.Random;

public class Logic {

    // Просмотр сокровищ
    public static void print(ArrayList<Treasure> treasures) {
        for (Treasure treasure : treasures) {
            System.out.println(treasure);
        }
    }

    // Выбор самого дорогого по стоимости сокровища
    public static void findMostValuableTreasure(ArrayList<Treasure> treasures) {
        Treasure mostExpensive = null;
        double value = 0;
        for (Treasure treasure : treasures) {
            if (value < treasure.getPrice()) {
                value = treasure.getPrice();
                mostExpensive = treasure;
            }
        }
        System.out.println(mostExpensive);
    }

    // Сокровища на заданную сумму
    public static void treasuresOfGivenPrice(double price, ArrayList<Treasure> treasures) {
        ArrayList<Treasure> list = new ArrayList<>();
        double sumOfTreasures = 0;
        for (Treasure treasure : treasures) {
            if (sumOfTreasures + treasure.getPrice() <= price) {
                sumOfTreasures += treasure.getPrice();
                list.add(treasure);
            }
        }

        for (Treasure treasure : list) {
            System.out.println(treasure);
        }
    }

    // Generate treasures
    public static void generateTreasure(ArrayList<Treasure> treasures) {
        Random price = new Random();
        Random treasure = new Random();
        for (int i = 0; i < 100; i++) {
            switch (treasure.nextInt(5)) {
                case 0:
                    treasures.add(new Coin("coin" + i, findType(), price.nextInt(1000)));
                    break;
                case 1:
                    treasures.add(new Crown("crown" + i, findType(), price.nextInt(1000)));
                    break;
                case 2:
                    treasures.add(new Cup("cup" + i, findType(), price.nextInt(1000)));
                    break;
                case 3:
                    treasures.add(new Ingot("ingot" + i, findType(), price.nextInt(1000)));
                    break;
                case 4:
                    treasures.add(new Ring("ring" + i, findType(), price.nextInt(1000)));
            }
        }
    }

    // Find type of treasure
    public static String findType() {
        Random random = new Random();
        switch (random.nextInt(3)) {
            case 0:
                return Type.GOLD.toString();
            case 1:
                return Type.SILVER.toString();
            default:
                return Type.BRONZE.toString();
        }
    }
}
