package com.example.springbootproject.advice;

import com.example.springbootproject.exceptions.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class MyControllerAdvice  {
    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public String showExceptionMessage(Exception e){
        return "Sorry ! Your request is invalid";

    }


    @ResponseBody
    @ResponseStatus(HttpStatus.PAYLOAD_TOO_LARGE)
    @ExceptionHandler(NotFoundException.class)
    public String showExceptionMessage1(Exception e){
        return "Sorry ! Your request can not be  found";
    }

}
