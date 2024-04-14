package com.momentslee.springboot.learnjpaandhibernate;

public class Course {
    private final long id;
    private final String name;
    private final String author;

    private Course() {
        this.id = 0;
        this.name = null;
        this.author = null;
    }

    public Course(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }


    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
