package com.epam.item.flower;

import com.epam.item.Flower;

public class Calendula extends Flower {
    @Override
    public double price() {
        return 25.2;
    }

    @Override
    public String name() {
        return "Calendula";
    }
}
