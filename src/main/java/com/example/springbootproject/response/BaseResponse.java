package com.example.springbootproject.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@AllArgsConstructor
@Data
public class BaseResponse {
    
    String message;

    String errorCode;
}
