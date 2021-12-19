package com.epam;

public class FactoryProducer {

    public static AbstractFactory getFactory(String factoryType) {
        if (factoryType.equalsIgnoreCase("flower")) {
            return new FlowerFactory();
        } else if (factoryType.equalsIgnoreCase("gift")) {
            return new GiftFactory();
        }
        return null;
    }

}
