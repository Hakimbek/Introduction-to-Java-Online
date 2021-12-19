package com.epam.item.flower;

import com.epam.item.Flower;

public class Rose extends Flower {
    @Override
    public double price() {
        return 12.5;
    }

    @Override
    public String name() {
        return "Rose";
    }
}
