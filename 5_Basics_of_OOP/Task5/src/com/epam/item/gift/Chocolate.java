package com.epam.item.gift;

import com.epam.item.Gift;

public class Chocolate extends Gift {

    @Override
    public double price() {
        return 25.2;
    }

    @Override
    public String name() {
        return "Chocolate";
    }

}
