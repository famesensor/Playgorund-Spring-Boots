package com.example.rest.webservice.restapiservice.controller;

import com.example.rest.webservice.restapiservice.dto.User;
import com.example.rest.webservice.restapiservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController

public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.findAll();
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable int id) {
        User user = userService.findById(id);
        if (user == null) throw new UserNotFoundException("not found");
        return user;
    }

    @PostMapping("/users")
    public void createUser(@Valid @RequestBody User user) {
        userService.save(user);
    }

    @PutMapping("/users/{id}")
    public void deleteUser(@PathVariable int id) {
        userService.deleteUserById(id);
    }
}
