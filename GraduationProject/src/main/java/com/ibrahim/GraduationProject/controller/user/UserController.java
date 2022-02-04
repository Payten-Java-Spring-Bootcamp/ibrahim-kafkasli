package com.ibrahim.GraduationProject.controller.user;

import com.ibrahim.GraduationProject.service.user.User;
import com.ibrahim.GraduationProject.service.user.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserServiceImpl userServiceImpl;

    @PostMapping("/user")
    @ResponseStatus(HttpStatus.CREATED)
    public Long createUser(@RequestBody @Valid UserRequest userRequest){
        Long id = userServiceImpl.createUser(userRequest.convertToUser());
        return id;
    }

    @GetMapping("/user/{tc}")
    public UserResponse getUserByTc(@PathVariable String tc){
        User user = userServiceImpl.getUser(tc);
        return UserResponse.convertFromUser(user);
    }

    @DeleteMapping("/user/{tc}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable String tc){
        userServiceImpl.deleteUser(tc);
    }

    @PostMapping("/user/{tc}")
    public UserResponse updateUser(@PathVariable String tc, @RequestBody UserRequest updateUserRequest){
        User user = userServiceImpl.updateUser(tc, updateUserRequest.convertToUser());
        return UserResponse.convertFromUser(user);
    }

}
