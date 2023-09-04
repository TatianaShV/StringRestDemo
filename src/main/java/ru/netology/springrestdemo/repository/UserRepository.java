package ru.netology.springrestdemo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.springrestdemo.model.Authorities;
import ru.netology.springrestdemo.model.User;

import java.util.*;

@Repository
public class UserRepository {

    private List<User> users = new ArrayList<>();

    public List<Authorities> getUserAuthorities(String user, String password) {
        User person = new User(user, password);
        if (users.contains(person)) {
            return List.of(Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        }
        return Collections.emptyList();
    }
}
