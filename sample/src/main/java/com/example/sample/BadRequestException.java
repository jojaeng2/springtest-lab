package com.example.sample;

public class BadRequestException extends RuntimeException {
    public BadRequestException() {
        super("Invalid input size, you must provide size 3");
    }
}
