package com.thoughtworks.basicquiz.repository;

import com.thoughtworks.basicquiz.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {
    private static Long userId = 0L;
    private static final Map<Long, User> userMap = new HashMap<Long, User>();

    static {
        userId++;
        userMap.put(userId, new User(userId, "Lintao", 24L, "https://inews.gtimg.com/newsapp_match/0/3581582328/0", "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Repellendus, non, dolorem, cumque distinctio magni quam expedita velit laborum sunt amet facere tempora ut fuga aliquam ad asperiores voluptatem dolorum! Quasi."));
        userId++;
        userMap.put(userId, new User(userId, "JOJO", 24L, "https://inews.gtimg.com/newsapp_match/0/3581582328/0", "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Repellendus, non, dolorem, cumque distinctio magni quam expedita velit laborum sunt amet facere tempora ut fuga aliquam ad asperiores voluptatem dolorum! Quasi."));
    }

    public UserRepository() {
    }

    public List<User> findAll() {
        return new ArrayList<>(userMap.values());
    }

    public User findById(Long id) {
        return userMap.get(id);
    }

    public Long insert(User user) {
        //TODO GTB-工程实践: - UserRepository.java:33 - ++i或i++操作不是线程安全的，可以了解下AtomicInteger
        userId++;
        userMap.put(userId, new User(userId, user.getName(), user.getAge(), user.getAvatar(), user.getDescription()));
        return userId;
    }
}
