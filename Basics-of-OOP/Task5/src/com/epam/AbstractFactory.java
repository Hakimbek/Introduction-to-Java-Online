package com.epam;

import com.epam.item.Item;

public abstract class AbstractFactory {

    public abstract Item getItem(String type);

}
