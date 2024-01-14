package com.study.ch19;

import lombok.ToString;

@ToString
public class Book2 {
    private String name;
    private String code;

    public Book2(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public static Book2Builder builder() {
        return new Book2Builder();
    }

    public static class Book2Builder {
        private String name;
        private String code;

        public Book2Builder name(String name) {
            this.name = name;
            return this;
        }

        public Book2Builder code(String code) {
            this.code = code;
            return this;
        }

        public Book2 build() {
            return new Book2(name, code);
        }
    }
}
