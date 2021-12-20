package com.epam.entity;

import java.util.UUID;

public class University {
    // id
    private UUID uuid;

    // name
    private String name;

    // address
    private Address address;

    // constructor
    public University(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "University{" +
                "uuid=" + uuid +
                ", name='" + name + '\'' +
                ", address=" + address +
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
