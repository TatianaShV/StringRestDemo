package ru.netology.springrestdemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.*;

public class InvalidCredentials extends RuntimeException {
    public  InvalidCredentials(String msg) {
       super(msg);
    }
}
