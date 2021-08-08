package com.example.spring.security.springsecurity;

import com.example.spring.security.springsecurity.entity.Role;
import com.example.spring.security.springsecurity.entity.User;
import com.example.spring.security.springsecurity.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class SpringSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityApplication.class, args);
    }

    @Bean
    CommandLineRunner run(UserService userService) {
        return args -> {
            userService.createROle(new Role(null, "ROLE_USER"));
            userService.createROle(new Role(null, "ROLE_MANAGER"));
            userService.createROle(new Role(null, "ROLE_ADMIN"));
            userService.createROle(new Role(null, "ROLE_SUPER_ADMIN"));

            userService.createUser(new User(null, "test", "test", "test user", new ArrayList<>()));
            userService.createUser(new User(null, "test2", "test", "test user2", new ArrayList<>()));
            userService.createUser(new User(null, "test3", "test", "test user3", new ArrayList<>()));
            userService.createUser(new User(null, "test4", "test", "test user4", new ArrayList<>()));

            userService.addRoleToUser("test", "ROLE_USER");
            userService.addRoleToUser("test2", "ROLE_MANAGER");
            userService.addRoleToUser("test3", "ROLE_ADMIN");
            userService.addRoleToUser("test4", "ROLE_USER");
            userService.addRoleToUser("test4", "ROLE_ADMIN");
            userService.addRoleToUser("test4", "ROLE_SUPER_ADMIN");

        };
    }
}
