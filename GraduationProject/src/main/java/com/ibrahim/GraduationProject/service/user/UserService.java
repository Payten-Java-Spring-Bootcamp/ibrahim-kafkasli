package com.ibrahim.GraduationProject.service.user;

public interface UserService {
    Long createUser(User user);
    User getUser(String tc);
    void deleteUser(String tc);
    User updateUser(String tc, User convertToUser);
}
