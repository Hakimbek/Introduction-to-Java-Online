package com.epam.item;

import com.epam.packing.Packing;

public interface Item {
    public String name();

    public Packing packing();

    public double price();
}
