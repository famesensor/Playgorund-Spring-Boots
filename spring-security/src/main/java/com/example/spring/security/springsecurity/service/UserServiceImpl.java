package com.example.spring.security.springsecurity.service;

import com.example.spring.security.springsecurity.entity.Role;
import com.example.spring.security.springsecurity.entity.User;
import com.example.spring.security.springsecurity.repository.RoleRepository;
import com.example.spring.security.springsecurity.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Override
    public User createUser(User user) {
        log.info("Create new user {} to database", user.getName());
        return userRepository.save(user);
    }

    @Override
    public Role createROle(Role role) {
        log.info("Create new role {} to database", role.getName());
        return roleRepository.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        log.info("Adding role {} to user {}", roleName, username);
        User user = userRepository.findByUsername(username);
        Role role = roleRepository.findByName(roleName);
        user.getRoles().add(role);
    }

    @Override
    public User getUser(String username) {
        log.info("get user {}", username);
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> getUsers() {
        log.info("get users");
        return userRepository.findAll();
    }
}
