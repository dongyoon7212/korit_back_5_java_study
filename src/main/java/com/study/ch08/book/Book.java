package com.study.ch08.book;

public class Book {
    String name;
    String type;
    String writer;

    public Book(String name, String type, String writer) {
        this.name = name;
        this.type = type;
        this.writer = writer;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }
}
