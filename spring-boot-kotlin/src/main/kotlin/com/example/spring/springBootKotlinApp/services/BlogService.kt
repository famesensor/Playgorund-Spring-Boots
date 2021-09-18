package com.example.spring.springBootKotlinApp.services

import com.example.spring.springBootKotlinApp.entities.Blog
import com.example.spring.springBootKotlinApp.model.blog.BlogRequest

interface BlogService {

    fun createBlog(body: BlogRequest): Blog

    fun updateBlog(id: Long, body: BlogRequest): Blog

    fun getBlog(id: Long): Blog

    fun deleteBlog(id: Long)

    fun getBlogs(): List<Blog>
}