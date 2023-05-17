package com.bcg.electricityboard.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ElectricityApplicationNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(ElectricityApplicationNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String electricityApplicationNotFoundHandler( ElectricityApplicationNotFoundException electricityApplicationNotFoundException){
        return electricityApplicationNotFoundException.getMessage();
    }
}
