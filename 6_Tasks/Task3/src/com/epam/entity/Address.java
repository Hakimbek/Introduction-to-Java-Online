package com.epam.entity;

import java.util.UUID;

public class Address {
    // id
    private UUID uuid;

    // city
    private Student city;

    // street
    private String street;

    // home
    private String home;

    // constructor
    public Address(Student city, String street, String home) {
        this.city = city;
        this.street = street;
        this.home = home;
    }

    @Override
    public String toString() {
        return "Address{" +
                "uuid=" + uuid +
                ", city=" + city +
                ", street='" + street + '\'' +
                ", home='" + home + '\'' +
                '}';
    }

    // get- and set-
    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Student getCity() {
        return city;
    }

    public void setCity(Student city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }
}
