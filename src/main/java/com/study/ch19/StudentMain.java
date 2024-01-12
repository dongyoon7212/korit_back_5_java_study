package com.study.ch19;

public class StudentMain {
    public static void main(String[] args) {
        Student student = Student.builder()
                .name("이동윤")
                .address("부산시")
                .age(26)
                .build();

        System.out.println(student);
    }
}
