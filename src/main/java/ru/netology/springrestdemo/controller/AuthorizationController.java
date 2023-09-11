package ru.netology.springrestdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import ru.netology.springrestdemo.AutorizationService.AuthorizationService;
import ru.netology.springrestdemo.exception.InvalidCredentials;
import ru.netology.springrestdemo.exception.UnauthorizedUser;
import ru.netology.springrestdemo.model.Authorities;

import java.util.List;

@RestController
@RequestMapping("/")
public class AuthorizationController {
    @Autowired
    AuthorizationService service;


    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@RequestParam("user") String user,
                                            @RequestParam("password") String password) {

        return service.getAuthorities(user, password);
    }

    @ExceptionHandler(InvalidCredentials.class)
    public ResponseEntity<String> icHandler(InvalidCredentials e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler(UnauthorizedUser.class)
    public ResponseEntity<String> unauthorizedUserHandler(UnauthorizedUser e) {
        final Logger logger = LoggerFactory.getLogger(AuthorizationController.class);
        logger.error(e.getMessage());
        return new ResponseEntity<>(e.getMessage(), HttpStatus.UNAUTHORIZED);
    }
}

