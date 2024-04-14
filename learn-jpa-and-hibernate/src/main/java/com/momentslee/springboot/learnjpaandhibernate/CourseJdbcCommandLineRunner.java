package com.momentslee.springboot.learnjpaandhibernate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
    private final CourseJdbcRepository courseJdbcRepository;

    public CourseJdbcCommandLineRunner(CourseJdbcRepository courseJdbcRepository) {
        this.courseJdbcRepository = courseJdbcRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        courseJdbcRepository.insert(new Course(1, "Learn Microservices", "GwangCheonLee"));
        courseJdbcRepository.insert(new Course(2, "Learn AWS", "GwangCheonLee"));
        courseJdbcRepository.insert(new Course(3, "Learn GCP", "GwangCheonLee"));
        courseJdbcRepository.deleteById(1);

        System.out.println(courseJdbcRepository.findById(2));

    }
}
