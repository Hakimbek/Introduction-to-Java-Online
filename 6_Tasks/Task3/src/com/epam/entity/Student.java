package com.epam.entity;

import java.util.UUID;

public class Student {
    // id
    private UUID uuid;

    // name
    private String name;

    // surname
    private String surname;

    // phone
    private String phone;

    // university
    private University university;

    // address
    private Address address;


    // address
    public Student(String name, String surname, String phone, University university, Address address) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.university = university;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "uuid=" + uuid +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", university=" + university +
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
