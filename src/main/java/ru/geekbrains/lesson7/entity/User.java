package ru.geekbrains.lesson7.entity;

/**
 * @author Zurbaevi Nika
 */
public class User {
    private String nick;
    private String password;

    public User(String nick, String password) {
        this.nick = nick;
        this.password = password;
    }

    public String getNick() {
        return nick;
    }

    public String getPassword() {
        return password;
    }
}
