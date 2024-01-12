package com.study.ch19;


import lombok.ToString;

@ToString
public class Book {
    private String name;
    private String code;

    public Book(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public static BookBuilder builder() {
        return new BookBuilder();
    }

    public static class BookBuilder {
        private String name;
        private String code;

        public BookBuilder name(String name) {
            this.name = name;
            return this;
        }

        public BookBuilder code(String code) {
            this.code = code;
            return this;
        }

        public Book build() {
            return new Book(name,code);
        }
    }
}
