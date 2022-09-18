package com.example.springbootproject.exceptions;


public class NotFoundException extends RuntimeException{

    String error;

    public NotFoundException(String message,String error){
        super(message);
        this.error=error;}
}
