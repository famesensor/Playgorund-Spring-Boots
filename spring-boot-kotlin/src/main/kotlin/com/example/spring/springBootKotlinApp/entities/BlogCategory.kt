package com.example.spring.springBootKotlinApp.entities

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "blog_category")
data class BlogCategory(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    val name: String = "",

    val createDate: Date,

    val updateDate: Date
)