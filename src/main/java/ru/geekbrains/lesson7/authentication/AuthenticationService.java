package ru.geekbrains.lesson7.authentication;

import ru.geekbrains.lesson7.entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Java Core. Advanced level. Lesson 7
 *
 * @author Zurbaevi Nika
 */
public class AuthenticationService {
    private final static List<User> users = new ArrayList<>();

    public AuthenticationService() {
        users.add(new User("user1", "password1"));
        users.add(new User("user2", "password2"));
        users.add(new User("user3", "password3"));
        users.add(new User("user4", "password4"));
    }

    public User doAuthentication(String nick, String password) {
        for (User user : users) {
            if (user.getNick().equals(nick) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}
