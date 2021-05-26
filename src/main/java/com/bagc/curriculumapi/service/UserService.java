package com.bagc.curriculumapi.service;

import com.bagc.curriculumapi.model.User;
import com.bagc.curriculumapi.model.UserResponse;

import java.util.List;

public interface UserService {

    UserResponse createUser(User request);

    List<User> getAllUsers();

    User updateUserById(User request, String id);
}
