package ru.netology.springrestdemo.model;

import lombok.Getter;

import java.util.Objects;

@Getter
public class User {
    private String user;
    private String password;


    public User(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, password);
    }

    @Override
    public String toString() {
        return "Authorities{" +
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
