package com.ibrahim.GraduationProject.controller.user;

import com.ibrahim.GraduationProject.service.user.User;
import com.ibrahim.GraduationProject.service.user.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserServiceImpl userServiceImpl;

    @PostMapping("/user")
    public Long createUser(@RequestBody UserRequest userRequest){
        Long id = userServiceImpl.createUser(userRequest.convertToUser());
        return id;
    }
}
