package com.ibrahim.GraduationProject.service.user;

import com.ibrahim.GraduationProject.exception.custom.EntityDontCreatedException;
import com.ibrahim.GraduationProject.exception.custom.EntityNotFoundException;
import com.ibrahim.GraduationProject.repository.user.UserEntity;
import com.ibrahim.GraduationProject.repository.user.UserRepository;
import com.ibrahim.GraduationProject.utils.FormatControl;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Cacheable
    public User createUser(User user){
        formatControl(user.getPhoneNumber());
        UserEntity userEntity = userRepository.save(user.convertToUserEntity());
        if(userEntity == null){
            throw new EntityDontCreatedException("User Entity Don't Created");
        }
        return User.convertFromUserEntity(userEntity);
    }

    @Cacheable
    public User getUser(String tc){
        UserEntity userEntity = getUserEntityByTc(tc);
        return User.convertFromUserEntity(userEntity);
    }

    @Cacheable
    public void deleteUser(String tc){
        UserEntity userEntity = getUserEntityByTc(tc);
        userRepository.deleteById(userEntity.getId());
    }

    @Cacheable
    public User updateUser(String tc, User user){
        UserEntity userEntity = getUserEntityByTc(tc);
        userEntity.setTc(user.getTc());
        userEntity.setName(user.getName());
        userEntity.setSurName(user.getSurName());
        userEntity.setMonthlyIncome(user.getMonthlyIncome());
        userEntity.setPhoneNumber(user.getPhoneNumber());
        userEntity.setCreditScore(user.getCreditScore());
        userRepository.saveAndFlush(userEntity);
        return User.convertFromUserEntity(userEntity);
    }

    //Formata uygun değilse exception fırlatılacak
    private boolean formatControl(String phoneNumber){
        boolean result = FormatControl.isValidPhoneNumber(phoneNumber);
        if(!result){
            throw new IllegalArgumentException("Format Not Acceptable");
        }
        return true;
    }

    private UserEntity getUserEntityByTc(String tc){
        UserEntity userEntity = userRepository.getUserEntityByTc(tc);
        if(userEntity == null){
            throw new EntityNotFoundException("User Not Found From TC");
        }
        return userEntity;
    }
}
