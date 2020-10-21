package com.thoughtworks.basicquiz.controller;

import com.thoughtworks.basicquiz.model.User;
import com.thoughtworks.basicquiz.service.UserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    @CrossOrigin
    public List<User> findAllUser() {
        return userService.findAllUser();
    }
}
