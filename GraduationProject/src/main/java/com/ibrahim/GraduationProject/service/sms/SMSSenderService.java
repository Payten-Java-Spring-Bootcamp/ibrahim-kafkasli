package com.ibrahim.GraduationProject.service.sms;

public interface SMSSenderService {
    Boolean sendSms(String phoneNumber, String message);
}
