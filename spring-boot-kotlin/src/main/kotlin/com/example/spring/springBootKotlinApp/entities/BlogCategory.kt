package com.example.spring.springBootKotlinApp.entities

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "blog_category")
class BlogCategory {

    @Id
    @GeneratedValue
    val id: Long? = null;

    var name: String? = null;

    lateinit var createDate: Date;
}