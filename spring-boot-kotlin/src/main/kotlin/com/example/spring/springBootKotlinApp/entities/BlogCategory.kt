package com.example.spring.springBootKotlinApp.entities

import org.hibernate.annotations.UpdateTimestamp
import org.springframework.data.annotation.CreatedDate
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "blog_category")
data class BlogCategory(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", unique = true, nullable = false)
    val id: Long = 0,

    var name: String = "",

    @CreatedDate
    @Column(nullable = false)
    var createDate: LocalDateTime = LocalDateTime.now(),

    @UpdateTimestamp
    @Column(nullable = false)
    var updateDate: LocalDateTime = LocalDateTime.now()
)