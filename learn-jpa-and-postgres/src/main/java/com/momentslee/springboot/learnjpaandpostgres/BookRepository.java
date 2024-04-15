package com.momentslee.springboot.learnjpaandpostgres;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}