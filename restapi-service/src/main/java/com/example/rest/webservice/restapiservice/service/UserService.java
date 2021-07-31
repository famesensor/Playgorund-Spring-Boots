package com.example.rest.webservice.restapiservice.service;

import com.example.rest.webservice.restapiservice.controller.UserNotFoundException;
import com.example.rest.webservice.restapiservice.dto.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserService {
    private static List<User> users = new ArrayList<>();

    private static int userCount = 2;
    static {
        users.add(new User(1, "Fame", new Date()));
        users.add(new User(2,"Sensor", new Date()));
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        if (user.getId() == null) user.setId(++userCount);
        users.add(user);
        return user;
    }

    public int deleteUserById(int id) {
          User user = users.stream().filter(ele -> ele.getId() == id).findAny().orElse(null);
          if (user == null) throw new UserNotFoundException("not found");
          users.remove(user);
          return user.getId();
    }

    public User findById(int id) {
        return users.stream().filter(user -> user.getId() == id).findAny().orElse(null);
    }
}
