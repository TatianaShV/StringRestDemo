package ru.netology.springrestdemo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.springrestdemo.model.Authorities;
import ru.netology.springrestdemo.model.User;

import java.util.*;

@Repository
public class UserRepository {

    private List<User> users;
    public UserRepository() {
        users = Arrays.asList(new User("Ana", "1123"),
                new User("Viacheslav", "25416"),
                new User("MamaSita", "234567754"));
    }

     public List<Authorities> getUserAuthorities(String user, String password) {

        for (User person : users) {
            if (person.getUser().equals(user) && person.getPassword().equals(password)) {
                return Arrays.asList(Authorities.values());
            }
        }
        return new ArrayList<>();
    }
}
