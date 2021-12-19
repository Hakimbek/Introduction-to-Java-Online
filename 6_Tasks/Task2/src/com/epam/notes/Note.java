package com.epam.notes;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

public class Note implements Serializable {
    // Note id
    private UUID uuid = UUID.randomUUID();

    // Note theme
    private String theme;

    // Created date
    private LocalDate date = LocalDate.now();

    // Email
    private String email;

    // Message
    private String message;

    // Constructor
    public Note(String theme, String email, String message) {
        this.theme = theme;
        this.email = email;
        this.message = message;
    }

    @Override
    public String toString() {
        return "Note{" +
                "uuid=" + uuid +
                ", theme='" + theme + '\'' +
                ", date=" + date +
                ", email='" + email + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    // get- and set-
    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
