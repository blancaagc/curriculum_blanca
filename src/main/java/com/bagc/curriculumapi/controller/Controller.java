package com.bagc.curriculumapi.controller;

import com.bagc.curriculumapi.model.User;
import com.bagc.curriculumapi.model.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.bagc.curriculumapi.service.UserService;

import java.util.List;

@RestController
@RequestMapping(value = "/api/cv")
public class Controller {

    @Autowired
    private UserService userService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/users")
    public UserResponse postUser(@RequestBody User request) {
        return userService.createUser(request);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/users")
    public List<User> findAllUsers() {

        return userService.getAllUsers();
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping(value = "/users/{id}")
    public User putUser(@RequestBody User request, @PathVariable String id) {

        return userService.updateUserById(request, id);

    }
}