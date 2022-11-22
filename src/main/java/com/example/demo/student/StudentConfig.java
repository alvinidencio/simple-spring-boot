package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student john = new Student(
                    "John",
                    "john@gmail.com",
                    LocalDate.of(2001, JANUARY, 5)
            );

            Student steven = new Student(
                    "Steven",
                    "steven@gmail.com",
                    LocalDate.of(2004, MARCH, 11)
            );

            studentRepository.saveAll(
                    List.of(john, steven)
            );
        };
    }
}
