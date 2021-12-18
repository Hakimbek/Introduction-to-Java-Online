package com.epam;

import com.epam.item.Item;
import com.epam.item.gift.Chocolate;
import com.epam.item.gift.IceCream;
import com.epam.item.gift.Lollipop;

public class GiftFactory extends AbstractFactory {

    @Override
    public Item getItem(String type) {
        if (type.equalsIgnoreCase("lollipop")) {
            return new Lollipop();
        } else if (type.equalsIgnoreCase("chocolate")) {
            return new Chocolate();
        } else if (type.equalsIgnoreCase("iceCream")) {
            return new IceCream();
        }
        return null;
    }
}
