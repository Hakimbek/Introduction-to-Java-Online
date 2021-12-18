package com.epam.item.gift;

import com.epam.item.Gift;

public class Lollipop extends Gift {

    @Override
    public double price() {
        return 10.2;
    }

    @Override
    public String name() {
        return "Lollipop";
    }

}
