package com.epam.service;

import com.epam.notes.Note;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class NoteService {

    /**
     * Adds new note to notebook
     * @param theme
     * @param email
     * @param message
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static void add(String theme, String email, String message) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("notebook.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ArrayList<Note> notesList = (ArrayList<Note>) objectInputStream.readObject();
        notesList.add(new Note(theme, email, message));

        FileOutputStream fileOutputStream = new FileOutputStream("notebook.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(notesList);
    }

    /**
     * Get all notes from notebook
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static void getAll() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("notebook.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ArrayList<Note> notesList = (ArrayList<Note>) objectInputStream.readObject();
        for (Note note : notesList) {
            System.out.println(note);
        }
    }

    /**
     * Get notes by theme
     * @param theme
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static void getByTheme(String theme) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("notebook.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ArrayList<Note> notesList = (ArrayList<Note>) objectInputStream.readObject();
        for (Note note : notesList) {
            if (note.getTheme().equals(theme)) {
                System.out.println(note);
            }
        }
    }

    /**
     * Get notes by date
     * @param date
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static void getByDate(LocalDate date) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("notebook.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ArrayList<Note> notesList = (ArrayList<Note>) objectInputStream.readObject();
        for (Note note : notesList) {
            if (note.getDate().equals(date)) {
                System.out.println(note);
            }
        }
    }

    /**
     * Get notes by email
     * @param email
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static void getByEmail(String email) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("notebook.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ArrayList<Note> notesList = (ArrayList<Note>) objectInputStream.readObject();
        for (Note note : notesList) {
            if (note.getEmail().equals(email)) {
                System.out.println(note);
            }
        }
    }

    /**
     * Get notes by message
     * @param message
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static void getByMessage(String message) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("notebook.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ArrayList<Note> notesList = (ArrayList<Note>) objectInputStream.readObject();
        for (Note note : notesList) {
            if (note.getMessage().equals(message)) {
                System.out.println(note);
            }
        }
    }

    /**
     * Get notes by word in message
     * @param text
     * @throws IOException
     */
    public static void getByWord(String text) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("notebook.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ArrayList<Note> notesList = (ArrayList<Note>) objectInputStream.readObject();
        for (Note note : notesList) {
            if (note.getMessage().contains(text)) {
                System.out.println(note);
            }
        }
    }

}
