package com.ibrahim.GraduationProject.service.sms;
import com.ibrahim.GraduationProject.exception.custom.EntityDontCreatedException;
import com.ibrahim.GraduationProject.repository.sms.SmsEntity;
import com.ibrahim.GraduationProject.repository.sms.SmsLogRepository;
import com.ibrahim.GraduationProject.service.error.ErrorServiceImpl;
import com.twilio.exception.ApiException;
import com.twilio.rest.api.v2010.account.Message;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.twilio.Twilio;
import com.twilio.type.PhoneNumber;


@Service
@RequiredArgsConstructor
@Slf4j
public class SMSSenderServiceImpl implements SMSSenderService{



    private final SmsLogRepository smsLogRepository;
    private final ErrorServiceImpl errorServiceImpl;

    @Override
    @Cacheable
    public Boolean sendSms(String phoneNumber, String message){
        try{
            Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
            Message.creator(
                    new PhoneNumber(phoneNumber),
                    new PhoneNumber(twilioNumber),
                    message)
                    .create();
            logSmsToDatabase(phoneNumber, twilioNumber, message);
            return true;
        }catch (Exception e){
            errorServiceImpl.exceptionLogging("Mesaj Gönderilemedi",e.toString());
            log.error("Mesaj Gönderilemedi: ",e);
            return false;
        }
    }
    private void logSmsToDatabase(String phoneNumber, String twilioNumber, String message) {
        SmsEntity smsEntity = new SmsEntity();
        smsEntity.setFromNumber(twilioNumber);
        smsEntity.setToNumber(phoneNumber);
        smsEntity.setMessage(message);
        SmsEntity resultEntity = smsLogRepository.save(smsEntity);
        if(resultEntity == null){
            throw new EntityDontCreatedException("Sms Log Entity Don't Created");
        }

    }
}
