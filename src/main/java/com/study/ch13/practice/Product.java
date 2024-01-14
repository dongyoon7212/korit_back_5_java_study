package com.study.ch13.practice;

public class Product {
    private String serialNumber;
    private String model;

    public Product(String serialNumber, String model) {
        this.serialNumber = serialNumber;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Product{" +
                "serialNumber='" + serialNumber + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
