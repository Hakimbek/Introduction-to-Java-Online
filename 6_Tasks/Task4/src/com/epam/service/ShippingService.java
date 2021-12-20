package com.epam.service;

import com.epam.entity.Port;
import com.epam.entity.Ship;

import java.util.UUID;

public class ShippingService {

    public static boolean in(UUID shipId, UUID portId) {
        Port port = PortService.getById(portId);
        Ship ship = ShipService.getById(shipId);
        return port == null || ship == null || port.getContainersInPort() + ship.getNumberOfContainersInShip() > port.getPortCapacity();
    }

    public static boolean out(UUID shipId, UUID portId) {
        Port port = PortService.getById(portId);
        Ship ship = ShipService.getById(shipId);
        return port == null || ship == null || ship.getNumberOfContainersInShip() + port.getContainersInPort() > ship.getShipCapacity();
    }

}
