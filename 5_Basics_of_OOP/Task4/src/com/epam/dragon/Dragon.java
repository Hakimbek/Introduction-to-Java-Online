package com.epam.dragon;

import com.epam.logic.Logic;
import com.epam.treasure.*;

import java.util.ArrayList;

public class Dragon {
    // Сокровища
    private ArrayList<Treasure> treasures = new ArrayList<>();

    // Constructor
    public Dragon() {
        // Генерирует 100 сокровищ
        Logic.generateTreasure(getTreasures());
    }

    // get- and set-
    public ArrayList<Treasure> getTreasures() {
        return treasures;
    }

    public void setTreasures(ArrayList<Treasure> treasures) {
        this.treasures = treasures;
    }
}
