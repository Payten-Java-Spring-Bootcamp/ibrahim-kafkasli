package com.ibrahim.GraduationProject.service.user;

import com.ibrahim.GraduationProject.repository.user.UserEntity;
import com.ibrahim.GraduationProject.repository.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public Long createUser(User user){
        UserEntity userEntity = user.convertToUserEntity();
        userRepository.save(userEntity);
        return userEntity.getId();
    }

    public User getUser(String tc) {
        UserEntity userEntity = userRepository.getUserEntityByTc(tc);
        return User.convertFromUserEntity(userEntity);
    }

    public void deleteUser(String tc) {
        UserEntity userEntity = userRepository.getUserEntityByTc(tc);
        userRepository.deleteById(userEntity.getId());
    }

    public User updateUser(String tc, User user) {
        UserEntity userEntity = userRepository.getUserEntityByTc(tc);
        userEntity.setTc(user.getTc());
        userEntity.setName(user.getName());
        userEntity.setSurName(user.getSurName());
        userEntity.setMonthlyIncome(user.getMonthlyIncome());
        userEntity.setPhoneNumber(user.getPhoneNumber());
        userEntity.setCreditScore(user.getCreditScore());
        userRepository.saveAndFlush(userEntity);
        return User.convertFromUserEntity(userEntity);
    }
}
