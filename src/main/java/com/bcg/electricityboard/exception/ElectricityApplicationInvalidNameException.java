package com.bcg.electricityboard.exception;

public class ElectricityApplicationInvalidNameException extends RuntimeException {
    public ElectricityApplicationInvalidNameException(String name){
        super("Applicant name is invalid : "+name);
    }
}
