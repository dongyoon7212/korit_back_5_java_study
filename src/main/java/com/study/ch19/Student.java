package com.study.ch19;

import lombok.ToString;

@ToString
public class Student {
    private String naem;
    private String address;
    private int age;

    public Student(String naem, String address, int age) {
        this.naem = naem;
        this.address = address;
        this.age = age;
    }

    public static StudentBuilder builder() { //2. StudentBuilder호출하는 메소드
        return new StudentBuilder();
    }

    public static class StudentBuilder { // 1. 클래스를 먼저 만든다.
        private String name;
        private String address;
        private int age;

        public Student build() { // 4. Student를 리턴해주는 build
            return new Student(name, address, age);
        }

        public StudentBuilder name(String name) { // 3. setter들 만들어준다.
            this.name = name;
            return this; // 자기 자신을 리턴
        }

        public StudentBuilder address(String address) {
            this.address = address;
            return this;
        }

        public StudentBuilder age(int age) {
            this.age = age;
            return this;
        }
    }
}


