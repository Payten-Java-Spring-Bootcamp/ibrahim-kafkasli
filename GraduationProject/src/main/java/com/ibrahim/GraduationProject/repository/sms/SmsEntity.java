package com.ibrahim.GraduationProject.repository.sms;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Table(name = "sms_logs")
@Entity
@ApiModel(value = "Sms Model Class", description = "This model has some fields for SMS")
public class SmsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "Sms Model Identifier Field")
    private Long id;

    @ApiModelProperty(value = "Sms Model Twilio Number Field")
    private String fromNumber;

    @ApiModelProperty(value = "Sms Model Customer Phone Number Field")
    private String toNumber;

    @ApiModelProperty(value = "Sms Model Message Field")
    private String message;
}
