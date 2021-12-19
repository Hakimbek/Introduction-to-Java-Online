package com.epam.item.gift;

import com.epam.item.Gift;

public class IceCream extends Gift {

    @Override
    public double price() {
        return 14.5;
    }

    @Override
    public String name() {
        return "Ice cream";
    }

}
