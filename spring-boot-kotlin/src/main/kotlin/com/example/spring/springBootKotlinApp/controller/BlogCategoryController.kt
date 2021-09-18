package com.example.spring.springBootKotlinApp.controller

import com.example.spring.springBootKotlinApp.entities.BlogCategory
import com.example.spring.springBootKotlinApp.model.blogcategory.BlogCategoryRequest
import com.example.spring.springBootKotlinApp.services.BlogCategoryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/v1/blog-category")
class BlogCategoryController @Autowired constructor(val blogCategoryService: BlogCategoryService) {

    @PostMapping
    fun createBlogCategory(@RequestBody body: BlogCategoryRequest): ResponseEntity<BlogCategory> {
        return ResponseEntity(blogCategoryService.createBlogCategory(body), HttpStatus.CREATED)
    }

    @PutMapping("/{id}")
    fun updateBlogCategory(
        @PathVariable id: Long,
        @RequestBody body: BlogCategoryRequest
    ): BlogCategory {
        return blogCategoryService.updateBlogCategory(id, body);
    }

    @GetMapping
    fun getBlogCategories(): List<BlogCategory> {
        return blogCategoryService.getBlogCategories();
    }
}