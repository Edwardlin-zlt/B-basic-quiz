package com.thoughtworks.basicquiz.service;

import com.thoughtworks.basicquiz.model.User;
import com.thoughtworks.basicquiz.repository.UserRepository;

import java.util.Collection;

public class UserService {
    private final UserRepository userRepository = new UserRepository();

    public UserService() {
    }

    public Collection<User> findAllUser() {
        return userRepository.findAll();
    }
}
