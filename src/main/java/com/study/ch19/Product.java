package com.study.ch19;

public class Product {
    private String name;
    private int code;

    public Product(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public static ProductBuilder builder() {
        return new ProductBuilder();
    }

    public static class ProductBuilder {
        private String name;
        private int code;

        public ProductBuilder name(String name) {
            this.name = name;
            return this;
        }
        public ProductBuilder code(int code) {
            this.code = code;
            return this;
        }

        public Product build() {
            return new Product(name, code);
        }

    }
}
