package com.epam;

import com.epam.item.flower.Calendula;
import com.epam.item.flower.Iris;
import com.epam.item.flower.Rose;
import com.epam.item.gift.Chocolate;
import com.epam.item.gift.IceCream;
import com.epam.item.gift.Lollipop;

public class PresentBuilder {

    public Present weddingPresent() {
        Present present = new Present();
        present.addItem(new Rose());
        present.addItem(new Chocolate());
        return present;
    }

    public Present birthdayPresent() {
        Present present = new Present();
        present.addItem(new Calendula());
        present.addItem(new Iris());
        present.addItem(new Lollipop());
        present.addItem(new IceCream());
        return present;
    }

}
