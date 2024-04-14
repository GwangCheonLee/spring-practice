package com.momentslee.springboot.learnjpaandhibernate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
    private final CourseJdbcRepository courseJdbcRepository;
    private final CourseJpaRepository courseJpaRepository;

    public CourseJdbcCommandLineRunner(CourseJdbcRepository courseJdbcRepository, CourseJpaRepository courseJpaRepository) {
        this.courseJdbcRepository = courseJdbcRepository;
        this.courseJpaRepository = courseJpaRepository;
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
