package com.ibrahim.GraduationProject.exception;

import com.ibrahim.GraduationProject.exception.custom.EntityDontCreatedException;
import com.ibrahim.GraduationProject.exception.custom.EntityNotFoundException;
import com.ibrahim.GraduationProject.service.error.ErrorServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@RequiredArgsConstructor
public class ApiExceptionHandler {

    private final ErrorServiceImpl errorServiceImpl;

    @ExceptionHandler(value = EntityNotFoundException.class)
    public String entityNotFound(){
        String message = "Record Not Found";
        errorServiceImpl.exceptionLogging(message, "Entity Not Found Exception");
        return message;
    }

    @ExceptionHandler(value = EntityDontCreatedException.class)
    public String entityDontCreated(){
        String message = "Reacord Don't Created!";
        errorServiceImpl.exceptionLogging(message, "Entity Don't Created Exception");
        return message;
    }

    @ExceptionHandler(value = IllegalArgumentException.class)
    public String iaException() {
        return "Please Check Your Phone or Email Format";
    }
}
