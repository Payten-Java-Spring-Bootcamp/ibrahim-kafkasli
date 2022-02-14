package com.ibrahim.GraduationProject.service.error;

import com.ibrahim.GraduationProject.exception.custom.EntityDontCreatedException;
import com.ibrahim.GraduationProject.repository.error.ErrorEntity;
import com.ibrahim.GraduationProject.repository.error.ErrorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class ErrorServiceImpl implements ErrorService{

    private final ErrorRepository errorRepository;

    public ErrorEntity exceptionLogging(String message, String errorType) throws EntityDontCreatedException {
        Error error = Error.builder()
                            .errorMessage(message)
                            .errorTime(LocalDateTime.now())
                            .errorType(errorType)
                            .build();
        error.convertToErrorEntity();
        ErrorEntity errorEntity =  errorRepository.save(error.convertToErrorEntity());
        if(errorEntity == null){
            throw new EntityDontCreatedException("Error Entity Don't Created");
        }
        return errorEntity;
    }
}
