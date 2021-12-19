package com.epam.user;

import com.epam.security.Encrypt;

import java.io.Serializable;
import java.util.UUID;

public class User implements Serializable {
    // Уникальный id пользователя
    private UUID uuid = UUID.randomUUID();

    // Имя пользователя (unique)
    private String name;

    // Пароль пользователя (хранится в зашифрованном виде)
    private String password;

    // Статус пользователя (USER, ADMINISTRATOR)
    private Status status;

    // Constructor
    public User(String name, String password, Status status) {
        this.name = name;
        setPassword(password);
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "uuid=" + uuid +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                '}';
    }

    // get- and -set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    // Шифрует пароль перед сохранением
    public void setPassword(String password) {
        this.password = Encrypt.encrypt(password);
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
