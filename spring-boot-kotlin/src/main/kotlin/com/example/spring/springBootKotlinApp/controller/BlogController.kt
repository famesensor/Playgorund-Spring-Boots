package com.example.spring.springBootKotlinApp.controller

import com.example.spring.springBootKotlinApp.entities.Blog
import com.example.spring.springBootKotlinApp.model.blog.BlogRequest
import com.example.spring.springBootKotlinApp.services.BlogService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/v1/blog/")
class BlogController @Autowired constructor(val blogService: BlogService) {

    @PostMapping
    fun createBlog(@RequestBody body: BlogRequest): ResponseEntity<Blog> {
        return ResponseEntity(blogService.createBlog(body), HttpStatus.CREATED)
    }

    @GetMapping
    fun getBlogs(): List<Blog> {
        return blogService.getBlogs()
    }

    @PutMapping("/{id}")
    fun updateBlog(@PathVariable id: Long, @RequestBody body: BlogRequest): Blog {
        return blogService.updateBlog(id, body)
    }

    @GetMapping("/{id}")
    fun getBlog(@PathVariable id: Long): Blog {
        return blogService.getBlog(id);
    }

    @DeleteMapping("/{id}")
    fun deleteBlog(@PathVariable id: Long): Blog {
        return blogService.deleteBlog(id);
    }
}