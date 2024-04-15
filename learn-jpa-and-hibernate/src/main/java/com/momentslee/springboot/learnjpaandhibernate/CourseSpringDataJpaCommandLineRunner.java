package com.momentslee.springboot.learnjpaandhibernate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseSpringDataJpaCommandLineRunner implements CommandLineRunner {
    private final CourseSpringDataJpaRepository courseSpringDataJpaRepository;

    public CourseSpringDataJpaCommandLineRunner(CourseSpringDataJpaRepository courseSpringDataJpaRepository) {
        this.courseSpringDataJpaRepository = courseSpringDataJpaRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        this.courseSpringDataJpaRepository.save(new Course(1, "Learn JPA and Hibernate", "GwangCheonLee"));
        this.courseSpringDataJpaRepository.save(new Course(2, "Learn Azure", "GwangCheonLee"));
        this.courseSpringDataJpaRepository.save(new Course(3, "Learn GCP", "GwangCheonLee"));

        this.courseSpringDataJpaRepository.deleteById(1L);

        System.out.println(this.courseSpringDataJpaRepository.findById(2L));
        System.out.println(this.courseSpringDataJpaRepository.findById(3L));

        System.out.println(this.courseSpringDataJpaRepository.findAll());
        System.out.println(this.courseSpringDataJpaRepository.count());
        System.out.println(this.courseSpringDataJpaRepository.findByAuthor("GwangCheonLee"));

    }
}
