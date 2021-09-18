package com.example.spring.springBootKotlinApp.entities

import org.hibernate.annotations.UpdateTimestamp
import org.springframework.data.annotation.CreatedDate
import java.time.LocalDateTime
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "blog")
class Blog(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", unique = true, nullable = false)
    val id: Long = 0,

    @Column(nullable = false)
    var title: String = "",

    @Column(nullable = false)
    var detail: String = "",

    @ManyToOne
    @JoinColumn(name = "blog_category_id")
    var blogCategory: BlogCategory? = BlogCategory(),

    @CreatedDate
    @Column(nullable = false)
    var createDate: LocalDateTime = LocalDateTime.now(),

    @UpdateTimestamp
    @Column(nullable = false)
    var updateDate: LocalDateTime = LocalDateTime.now()
) {
}