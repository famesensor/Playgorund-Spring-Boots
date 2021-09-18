package com.example.spring.springBootKotlinApp.services

import com.example.spring.springBootKotlinApp.entities.Blog
import com.example.spring.springBootKotlinApp.entities.BlogCategory
import com.example.spring.springBootKotlinApp.model.blog.BlogRequest
import com.example.spring.springBootKotlinApp.repositories.BlogCategoryRepository
import com.example.spring.springBootKotlinApp.repositories.BlogRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException
import java.util.*

@Service
class BlogServiceImpl @Autowired constructor(val blogRepository: BlogRepository, val blogCategoryService: BlogCategoryService) : BlogService {
    override fun createBlog(body: BlogRequest): Blog {
        var blogCategory = blogCategoryService.getBlogCategory(body.blogCategoryId)

        var blog: Blog = Blog(title = body.title, detail = body.detail, blogCategory = blogCategory)

        return blogRepository.save(blog)
    }

    override fun updateBlog(id: Long, body: BlogRequest): Blog {
        var updateBlog: Blog = getBlog(id)

        updateBlog.title = body.title
        updateBlog.detail = body.detail

        if (updateBlog.blogCategory?.id != body.blogCategoryId) updateBlog.blogCategory = blogCategoryService.getBlogCategory(body.blogCategoryId)

        return blogRepository.save(updateBlog)
    }

    override fun getBlog(id: Long): Blog {
        var blog: Optional<Blog> = blogRepository.findById(id)

        if (!blog.isPresent) throw ResponseStatusException(HttpStatus.NOT_FOUND, "Not found blog")

        return blog.get()
    }

    override fun deleteBlog(id: Long) {
        var blog: Blog = getBlog(id)

        return blogRepository.delete(blog)
    }

    override fun getBlogs(): List<Blog> {
        return blogRepository.findAll()
    }
}