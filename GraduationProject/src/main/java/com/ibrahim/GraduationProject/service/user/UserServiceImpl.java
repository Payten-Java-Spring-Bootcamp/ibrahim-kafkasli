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
}
