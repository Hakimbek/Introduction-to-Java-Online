package com.epam.controller;

import com.epam.entity.Port;
import com.epam.entity.Ship;
import com.epam.service.PortService;
import com.epam.service.ShipService;

import java.util.UUID;

public class ShipController {

    public static void getAll() {
        ShipService.getAll();
    }

    public static Ship getById(UUID id) {
        return ShipService.getById(id);
    }

    public static void add(Ship ship) {
        ShipService.add(ship);
    }

    public static void edit(Ship ship) {
        ShipService.edit(ship);
    }


}
