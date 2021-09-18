package com.example.spring.springBootKotlinApp.repositories

import com.example.spring.springBootKotlinApp.entities.BlogCategory
import org.springframework.data.jpa.repository.JpaRepository

interface BlogCategoryRepository : JpaRepository<BlogCategory, Long> {
}