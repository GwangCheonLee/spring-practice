package com.momentslee.springboot.learnjpaandhibernate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJpaCommandLineRunner implements CommandLineRunner {
    private final CourseJpaRepository courseJpaRepository;

    public CourseJpaCommandLineRunner(CourseJpaRepository courseJpaRepository) {
        this.courseJpaRepository = courseJpaRepository;
    }

    @Override
    public void run(String... args) throws Exception {
//        courseJpaRepository.insert(new Course(1, "Learn Microservices", "GwangCheonLee"));
//        courseJpaRepository.insert(new Course(2, "Learn AWS", "GwangCheonLee"));
//        courseJpaRepository.insert(new Course(3, "Learn GCP", "GwangCheonLee"));
//        courseJpaRepository.deleteById(1);

//        System.out.println(courseJpaRepository.findById(2));

    }
}
