package com.ibrahim.GraduationProject.service.user;

import com.ibrahim.GraduationProject.exception.custom.EntityNotFoundException;

public interface UserService {
    User createUser(User user) throws  EntityNotFoundException;
    User getUser(String tc) throws EntityNotFoundException;
    void deleteUser(String tc) throws EntityNotFoundException;
    User updateUser(String tc, User convertToUser) throws EntityNotFoundException;
}
