package com.example.springbootproject.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BusinessException extends RuntimeException{
    String errorCode;
    String errorMessage;



}
