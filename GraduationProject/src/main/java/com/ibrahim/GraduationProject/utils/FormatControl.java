package com.ibrahim.GraduationProject.utils;

import org.springframework.cache.annotation.Cacheable;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import java.util.regex.Pattern;

public class FormatControl {

    public static boolean isValidPhoneNumber(String phoneNumber){

        final String PHONE_REGEX = "(05|5|905|)[0-9][0-9][1-9]([0-9]){6}";
        final Pattern phonePattern = Pattern.compile(PHONE_REGEX);

        phoneNumber = phoneNumber.replaceAll("[\\-\\s+\\(\\)]", "");
        boolean isValid = phoneNumber.matches(phonePattern.toString());

        return isValid;
    }

    public static boolean isValidEmailAddress(String email) {
        boolean result = true;
        try {
            InternetAddress emailAddr = new InternetAddress(email);
            emailAddr.validate();
        } catch (AddressException ex) {
            result = false;
        }
        return result;
    }

}
