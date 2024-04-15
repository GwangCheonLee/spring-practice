package com.momentslee.springboot.learnjpaandpostgres;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookCommandLineRunner implements CommandLineRunner {
    private final BookRepository bookRepository;

    public BookCommandLineRunner(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        this.bookRepository.save(new Book("The Great Gatsby", "F. Scott Fitzgerald"));

        List<Book> books = this.bookRepository.findAll();
        System.out.println(books);
    }
}
