package ru.netology.springrestdemo.model;

import lombok.Getter;

import java.util.Objects;

@Getter
public class User {
    private String user;
    private String password;

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public User(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public User() {}

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
