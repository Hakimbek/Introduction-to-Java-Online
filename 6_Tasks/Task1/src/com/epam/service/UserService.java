package com.epam.service;

import com.epam.user.Status;
import com.epam.user.User;

import java.io.*;
import java.security.GeneralSecurityException;
import java.util.ArrayList;

public class UserService {

    /**
     * Adds new user to file
     * @param username - name of user
     * @param password - password of user
     * @throws GeneralSecurityException
     * @throws UnsupportedEncodingException
     */
    public static boolean addUser(String username, String password) throws IOException, ClassNotFoundException {
        // Получает всех пользователейй из файла и приводит в ArrayList
        FileInputStream fileInputStream = new FileInputStream("users.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ArrayList<User> usersList = (ArrayList<User>) objectInputStream.readObject();

        boolean userNameAlreadyExist = false;

        // Проверяет не существует ли такое имя в листе
        for (User user : usersList) {
            if (user.getName().equals(username)) {
                userNameAlreadyExist = true;
                break;
            }
        }

        // Если такое имя существует то возвращает false
        // Если не сущществует добавляет новый полизователь с статусом USER в лист и возвращает true
        if (userNameAlreadyExist) {
            return false;
        } else {
            usersList.add(new User(username, password, Status.USER));
            objectInputStream.close();
            fileInputStream.close();

            FileOutputStream fileOutputStream = new FileOutputStream("users.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(usersList);
            objectOutputStream.close();
            fileOutputStream.close();
            return true;
        }
    }

}
