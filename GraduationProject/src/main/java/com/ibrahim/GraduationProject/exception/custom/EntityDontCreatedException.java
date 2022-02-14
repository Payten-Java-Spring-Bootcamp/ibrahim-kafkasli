package com.ibrahim.GraduationProject.exception.custom;

public class EntityDontCreatedException extends RuntimeException{
    public EntityDontCreatedException(String message){
        super(message);
    }
}
