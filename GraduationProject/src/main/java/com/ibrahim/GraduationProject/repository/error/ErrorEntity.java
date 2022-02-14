package com.ibrahim.GraduationProject.repository.error;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "error_log")
@Getter
@Setter
@ApiModel(value = "Error Model Class", description = "This model has some fields for exception")
public class ErrorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "Error Model Identifier Field")
    private Long Id;

    @ApiModelProperty(value = "Error Model Error Type Field")
    private String errorType;

    @ApiModelProperty(value = "Error Model Error Time Field")
    private LocalDateTime errorTime;

    @ApiModelProperty(value = "Error Model Error Message Field")
    private String errorMessage;
}
