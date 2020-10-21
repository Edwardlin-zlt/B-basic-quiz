package com.thoughtworks.basicquiz.repository;

import com.thoughtworks.basicquiz.model.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private static Long userId = 1L;
    private static final Map<Long, User> userMap = new HashMap<Long, User>();

    static {
        userMap.put(userId, new User(userId, "Lintao", 24L, "https://inews.gtimg.com/newsapp_match/0/3581582328/0", "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Repellendus, non, dolorem, cumque distinctio magni quam expedita velit laborum sunt amet facere tempora ut fuga aliquam ad asperiores voluptatem dolorum! Quasi."));
    }

    public UserRepository() {
    }

    public Collection<User> findAll() {
        return userMap.values();
    }
}
