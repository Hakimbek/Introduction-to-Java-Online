package com.epam;

import com.epam.item.Item;
import com.epam.item.flower.Calendula;
import com.epam.item.flower.Iris;
import com.epam.item.flower.Rose;

public class FlowerFactory extends AbstractFactory {

    @Override
    public Item getItem(String type) {
        if (type.equalsIgnoreCase("rose")) {
            return new Rose();
        } else if (type.equalsIgnoreCase("iris")) {
            return new Iris();
        } else if (type.equalsIgnoreCase("calendula")) {
            return new Calendula();
        }
        return null;
    }

}
