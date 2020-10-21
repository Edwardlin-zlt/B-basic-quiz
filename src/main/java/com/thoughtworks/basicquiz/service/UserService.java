package com.thoughtworks.basicquiz.service;

import com.thoughtworks.basicquiz.model.User;
import com.thoughtworks.basicquiz.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository = new UserRepository();

    public UserService() {
    }

    public List<User> findAllUser() {
        return userRepository.findAll();
    }

    public User findUserByID(Long id) {
        return userRepository.findById(id);
    }
}
