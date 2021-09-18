package com.example.spring.springBootKotlinApp.repositories

import com.example.spring.springBootKotlinApp.entities.Blog
import org.springframework.data.jpa.repository.JpaRepository

interface BlogRepository: JpaRepository<Blog, Long> {
}