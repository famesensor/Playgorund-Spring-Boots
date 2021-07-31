package com.example.rest.webservice.restapiservice.user;

import com.example.rest.webservice.restapiservice.user.dto.User;
import com.example.rest.webservice.restapiservice.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.findAll();
    }
}
