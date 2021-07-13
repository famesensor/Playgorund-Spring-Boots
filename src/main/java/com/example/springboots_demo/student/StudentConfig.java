package com.example.springboots_demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return  args -> {
           Student fame = new Student("Fame","fame@mail.com", LocalDate.of(1998, Month.DECEMBER,25), 22);
           Student sensor = new Student("Sensor", "sensor@gmail.com",LocalDate.of(1998, Month.DECEMBER,25), 22);

           repository.saveAll(List.of(fame,sensor));
        };
    }
}
