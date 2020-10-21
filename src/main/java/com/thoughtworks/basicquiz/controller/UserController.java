package com.thoughtworks.basicquiz.controller;

import com.thoughtworks.basicquiz.model.User;
import com.thoughtworks.basicquiz.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public Collection<User> findAllUser() {
        return userService.findAllUser();
    }
}
