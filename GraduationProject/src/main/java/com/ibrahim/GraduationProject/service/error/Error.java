package com.ibrahim.GraduationProject.service.error;

import com.ibrahim.GraduationProject.repository.error.ErrorEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class Error {

    private String errorType;

    private LocalDateTime errorTime;

    private String errorMessage;

    public ErrorEntity convertToErrorEntity() {
        ErrorEntity errorEntity = new ErrorEntity();
        errorEntity.setErrorType(errorType);
        errorEntity.setErrorMessage(errorMessage);
        errorEntity.setErrorTime(errorTime);
        return errorEntity;
    }
}
