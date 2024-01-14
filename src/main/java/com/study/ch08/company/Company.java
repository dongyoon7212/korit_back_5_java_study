package com.study.ch08.company;

public class Company {
    String name;
    String code;

    public Company(String name, String code) {
        this.name = name;
        this.code = code;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
