package com.epam.item.flower;

import com.epam.item.Flower;

public class Iris extends Flower {
    @Override
    public double price() {
        return 50.5;
    }

    @Override
    public String name() {
        return "Iris";
    }
}
