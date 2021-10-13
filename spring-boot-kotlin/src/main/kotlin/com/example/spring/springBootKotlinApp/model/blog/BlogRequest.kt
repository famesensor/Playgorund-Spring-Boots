package com.example.spring.springBootKotlinApp.model.blog

import javax.validation.constraints.*


data class BlogRequest(
    @NotNull(message = "message") @Size(min=1) var title: String,
    @NotEmpty(message = "message") var detail: String,
    @NotEmpty(message = "message") var blogCategoryId: Long
)