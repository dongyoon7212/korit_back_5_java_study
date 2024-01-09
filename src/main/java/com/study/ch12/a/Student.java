package com.study.ch12.a;

public class Student {
    private String name;
    private String address;

    public Student() { //default라면 동일한 패키지만 사용가능

    }

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void test() {
        System.out.println(add(10, 20));
        System.out.println(add(20, 30));
        System.out.println(add(30, 40));
    }

    private int add(int a, int b) {
        return a + b;
    }
}
