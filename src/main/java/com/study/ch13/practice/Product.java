package com.study.ch13.practice;

public class Product {
    private String serialName;
    private String model;

    @Override
    public String toString() {
        return "Product{" +
                "serialName='" + serialName + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public Product(String serialName, String model) {
        this.serialName = serialName;
        this.model = model;
    }
}
