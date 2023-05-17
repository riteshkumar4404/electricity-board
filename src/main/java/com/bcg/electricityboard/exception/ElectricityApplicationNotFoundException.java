package com.bcg.electricityboard.exception;

public class ElectricityApplicationNotFoundException extends RuntimeException {
    public ElectricityApplicationNotFoundException(Long id){
        super("Applicant Id not found: "+id);
    }
}
