package com.epam.service;

import com.epam.security.Decrypt;
import com.epam.user.User;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.security.GeneralSecurityException;
import java.util.ArrayList;

public class AuthService {

    /**
     * Authenticates users
     *
     * @param login    - user login
     * @param password - user password
     * @return String - user status
     * @throws IOException
     * @throws ClassNotFoundException
     * @throws GeneralSecurityException
     */
    public static String auth(String login, String password) throws IOException, ClassNotFoundException {
        // Получает всех пользователейй из файла и приводит в ArrayList
        FileInputStream fileInputStream = new FileInputStream("users.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ArrayList<User> arrayList = (ArrayList<User>) objectInputStream.readObject();

        // Проверяет порль и логин
        // Если совпадают то возвращает STATUS пользователя
        // Если нет то возвращает null
        for (User user : arrayList) {
            if (user.getName().equals(login) && Decrypt.decrypt(user.getPassword()).equals(password)) {
                return user.getStatus().toString();
            }
        }
        return null;
    }

}
