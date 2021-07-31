package com.example.rest.webservice.restapiservice.user.service;

import com.example.rest.webservice.restapiservice.user.dto.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Component
public class UserService {
    private static List<User> users = new ArrayList<>();

    private static int userCount = 2;
    static {
        users.add(new User(1, "Fame", new Date(25,12,1998)));
        users.add(new User(2,"Sensor", new Date(27,12,1999)));
    }

    public List<User> findAll() {
        return users;
    }

    public void save(User user) {
        if (user.getId() == null) user.setId(userCount++);
        users.add(user);
    }

    public User findById(int id) {
        return users.stream().filter(user -> user.getId() == id).findAny().orElse(null);
    }
}
