package com.epam.item;

import com.epam.packing.GiftWrapper;
import com.epam.item.Item;
import com.epam.packing.Packing;

public abstract class Gift implements Item {

    @Override
    public Packing packing() {
        return new GiftWrapper();
    }

}
