package com.example.fullstack.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

    private static final long serialVersionUID = 1L; //this rep a class implementing serialization, so we need a serial id

    public ResourceNotFoundException(String message) {
        super(message);
    }
}