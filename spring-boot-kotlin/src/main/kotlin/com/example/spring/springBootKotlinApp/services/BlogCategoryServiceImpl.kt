package com.example.spring.springBootKotlinApp.services

import com.example.spring.springBootKotlinApp.entities.BlogCategory
import com.example.spring.springBootKotlinApp.model.blogcategory.BlogCategoryRequest
import com.example.spring.springBootKotlinApp.repositories.BlogCategoryRepository
import org.hibernate.annotations.NotFound
import org.hibernate.annotations.common.util.impl.LoggerFactory.logger
import org.slf4j.Logger
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class BlogCategoryServiceImpl @Autowired constructor(val blogCategoryRepository: BlogCategoryRepository) :
    BlogCategoryService {

    override fun createBlogCategory(body: BlogCategoryRequest): BlogCategory {
        var blogCategory = BlogCategory(name = body.name);
        return blogCategoryRepository.save(blogCategory)
    }

    override fun updateBlogCategory(id: Long, body: BlogCategoryRequest): BlogCategory {
//        var blogCategory = blogCategoryRepository.findById(id).map { item -> {
//            val updateBlogCategory = item.copy(name = body.name)
//
//            blogCategoryRepository.save(updateBlogCategory)
//        } }.orElse { throw ResponseStatusException(HttpStatus.NOT_FOUND, "Not found blog category") }

        var blogCategory = blogCategoryRepository.findById(id)

        if (!blogCategory.isPresent) throw ResponseStatusException(HttpStatus.NOT_FOUND, "Not found blog category")

        var updateBlog = blogCategory.get()
        updateBlog.name = body.name
        return blogCategoryRepository.save(updateBlog)
    }

    override fun getBlogCategories(): List<BlogCategory> {
        return blogCategoryRepository.findAll()
    }

    override fun getBlogCategory(id: Long): BlogCategory {
        var blogCategory = blogCategoryRepository.findById(id)

        if (!blogCategory.isPresent) throw ResponseStatusException(HttpStatus.NOT_FOUND, "Not found blog category")

        return blogCategory.get()
    }
}
