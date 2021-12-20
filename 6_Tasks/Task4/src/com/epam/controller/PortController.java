package com.epam.controller;

import com.epam.entity.Port;
import com.epam.service.PortService;

import java.util.UUID;

public class PortController {

    public static void getAll() {
        PortService.getAll();
    }

    public static Port getById(UUID id) {
        return PortService.getById(id);
    }

    public static void add(Port port) {
        PortService.add(port);
    }

    public static void edit(Port port) {
        PortService.edit(port);
    }

}
