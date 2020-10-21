package com.thoughtworks.basicquiz.service;

import com.thoughtworks.basicquiz.model.User;
import com.thoughtworks.basicquiz.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {
    private final UserRepository userRepository = new UserRepository();

    public UserService() {
    }

    public Collection<User> findAllUser() {
        return userRepository.findAll();
    }
}