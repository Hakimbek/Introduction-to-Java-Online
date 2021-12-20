package com.epam.entity;

import java.util.UUID;

public class Ship {
    // id
    private UUID uuid;

    // name of ship
    private String name;

    // containers in ship
    private Integer numberOfContainersInShip;

    // ship capacity
    private Integer shipCapacity;

    // container
    public Ship(String name, Integer numberOfContainersInShip, Integer shipCapacity) {
        this.name = name;
        this.numberOfContainersInShip = numberOfContainersInShip;
        this.shipCapacity = shipCapacity;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "uuid=" + uuid +
                ", name='" + name + '\'' +
                ", numberOfContainersInShip=" + numberOfContainersInShip +
                ", shipCapacity=" + shipCapacity +
                '}';
    }

    // get- and set-
    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfContainersInShip() {
        return numberOfContainersInShip;
    }

    public void setNumberOfContainersInShip(Integer numberOfContainersInShip) {
        this.numberOfContainersInShip = numberOfContainersInShip;
    }

    public Integer getShipCapacity() {
        return shipCapacity;
    }

    public void setShipCapacity(Integer shipCapacity) {
        this.shipCapacity = shipCapacity;
    }
}
