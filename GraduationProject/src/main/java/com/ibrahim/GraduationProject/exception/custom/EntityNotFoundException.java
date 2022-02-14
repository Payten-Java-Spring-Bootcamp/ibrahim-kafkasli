package com.ibrahim.GraduationProject.exception.custom;

public class EntityNotFoundException extends RuntimeException{

    public EntityNotFoundException(String exceptionMessage){
        super(exceptionMessage);
    }

}
