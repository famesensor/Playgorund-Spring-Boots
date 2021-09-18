package com.example.spring.springBootKotlinApp.services

import com.example.spring.springBootKotlinApp.entities.BlogCategory
import com.example.spring.springBootKotlinApp.model.blogcategory.BlogCategoryRequest

interface BlogCategoryService {

    fun createBlogCategory(body: BlogCategoryRequest): BlogCategory

    fun updateBlogCategory(id: Long, body: BlogCategoryRequest): BlogCategory

    fun getBlogCategories(): List<BlogCategory>

    fun getBlogCategory(id: Long): BlogCategory
}