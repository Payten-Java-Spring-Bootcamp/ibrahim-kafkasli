package com.ibrahim.GraduationProject.controller.user;

import com.ibrahim.GraduationProject.exception.custom.EntityDontCreatedException;
import com.ibrahim.GraduationProject.exception.custom.EntityNotFoundException;
import com.ibrahim.GraduationProject.service.user.User;
import com.ibrahim.GraduationProject.service.user.UserServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@Api(value = "User Api Doc")
public class UserController {

    private final UserServiceImpl userServiceImpl;

    @PostMapping("/user")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation(value = "Create User Function", notes = "This method creates new user")
    public @ApiResponse(code = 201, message = "Containing some model fields") UserResponse createUser(@RequestBody @Valid @ApiParam(value = "Containing model fields without id") UserRequest userRequest){
        User user = userServiceImpl.createUser(userRequest.convertToUser());
        return UserResponse.convertFromUser(user);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/user/{tc}")
    @ApiOperation(value = "Get User Function", notes = "This method returns user by tc")
    public @ApiResponse(code = 200, message = "Containing some model fields") UserResponse getUserByTc(@PathVariable @ApiParam(value = "Turkish republic identification number")  String tc){
        User user = userServiceImpl.getUser(tc);
        return UserResponse.convertFromUser(user);
    }

    @DeleteMapping("/user/{tc}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ApiOperation(value = "Delete User Function", notes = "This method deletes user by tc")
    public @ApiResponse(code = 204, message = "This method returns no value") void deleteUser(@PathVariable @ApiParam(value = "Turkish republic identification number") String tc){
        userServiceImpl.deleteUser(tc);
    }

    @PostMapping("/user/{tc}")
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "Update User Function", notes = "This method update user")
    public @ApiResponse(code = 200, message = "Contains some model fields") UserResponse updateUser(@PathVariable @ApiParam(value = "Turkish republic identification number") String tc, @RequestBody @ApiParam(value = "some model fields") UserRequest updateUserRequest){
        User user = userServiceImpl.updateUser(tc, updateUserRequest.convertToUser());
        return UserResponse.convertFromUser(user);
    }

}
