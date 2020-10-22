package com.thoughtworks.basicquiz.controller;

import com.thoughtworks.basicquiz.model.User;
import com.thoughtworks.basicquiz.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> findAllUser() {
        return userService.findAllUser();
    }

    //TODO GTB-完成度: - UserController.java:25 Bug，当User不存在的时候，应该抛异常404
    @GetMapping("/users/{id:[\\d]+}")
    public User findUserById(@PathVariable("id") Long id) {
        return userService.findUserByID(id);
    }

    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public Long createUser(@RequestBody @Valid User user) {
        return userService.createUser(user);
    }
}
