package com.momentslee.springboot.learnjpaandhibernate;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
    private static final String INSERT_QUERY = """
            INSERT INTO COURSE (id, name, author) VALUES (?, ?, ?);
            """;

    private final JdbcTemplate springJdbcTemplate;

    public CourseJdbcRepository(JdbcTemplate springJdbcTemplate) {
        this.springJdbcTemplate = springJdbcTemplate;
    }

    public void insert(Course course) {
        this.springJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
    }
}
