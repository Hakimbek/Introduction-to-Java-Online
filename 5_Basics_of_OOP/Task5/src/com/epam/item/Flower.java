package com.epam.item;

import com.epam.packing.FlowerPacking;
import com.epam.item.Item;
import com.epam.packing.Packing;

public abstract class Flower implements Item {

    @Override
    public Packing packing() {
        return new FlowerPacking();
    }

    @Override
    public abstract double price();
}
