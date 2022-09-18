package com.example.springbootproject.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyControllerAdvice {
    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public String showExceptionMessage(Exception e){
        return "Sorry ! Your request is invalid";

    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public String showExceptionMessage1(Exception e){
        return "Sorry ! Your request can not be  found";

    }

}
