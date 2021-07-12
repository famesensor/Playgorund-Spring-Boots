package com.example.springboots_demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = " ")
public class StudentController {
    @GetMapping
    public List<Student> getStudents() {
        return List.of(new Student(1L, "Fame", "fame@mail.com", LocalDate.of(1998, Month.DECEMBER, 25), 22));
    }
}
