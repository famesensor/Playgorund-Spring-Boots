package com.example.spring.security.springsecurity.service;

import com.example.spring.security.springsecurity.entity.Role;
import com.example.spring.security.springsecurity.entity.User;

import java.util.List;

public interface UserService {
    User createUser(User user);

    Role createROle(Role role);

    void addRoleToUser(String username, String roleName);

    User getUser(String username);

    List<User> getUsers();
}
