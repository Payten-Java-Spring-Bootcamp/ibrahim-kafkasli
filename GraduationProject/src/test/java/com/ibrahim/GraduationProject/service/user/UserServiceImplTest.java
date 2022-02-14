package com.ibrahim.GraduationProject.service.user;

import com.ibrahim.GraduationProject.repository.user.UserEntity;
import com.ibrahim.GraduationProject.repository.user.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatcher;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    @InjectMocks
    private UserServiceImpl userService; //biz bu servis üzerinde işlem yapıyoruz

    @Mock
    private UserRepository userRepository; //UserService bu repoya ihtiyaç duyuyor.

    @Test
    void createUser() {
        User user = User.builder()
                        .tc("TestTc")
                        .name("TestName")
                        .surName("TestSurname")
                        .creditScore(1)
                        .monthlyIncome(1L)
                        .phoneNumber("05531653475")
                        .build();

        UserEntity userEntityMock = mock(UserEntity.class);
        User userMock = mock(User.class);
        when(userRepository.save(ArgumentMatchers.any(UserEntity.class))).thenReturn(userEntityMock);
        when(userService.createUser(ArgumentMatchers.any(User.class))).thenReturn(userMock);
        User result = userService.createUser(user);
        assertEquals(result.getName(), user.getName());
    }

    @Test
    void getUser() {
    }

    @Test
    void deleteUser() {
    }

    @Test
    void updateUser() {
    }
}