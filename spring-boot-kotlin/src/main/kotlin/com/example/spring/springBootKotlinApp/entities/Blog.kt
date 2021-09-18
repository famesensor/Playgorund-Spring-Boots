package com.example.spring.springBootKotlinApp.entities

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "blog")
class Blog(
    @Id @GeneratedValue val id: Long? = null,

    var title: String? = null,

    var detail: String? = null,

    @ManyToOne
    @JoinColumn(name = "blog_category_id")
    var blogCategory: BlogCategory? = null,

    var createDate: Date,

    var updateDate: Date,
) {
}