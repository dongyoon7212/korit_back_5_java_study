package com.study.ch12.a;

public class AMain {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("이동윤");
        System.out.println(student.getName());
        student.setAddress("부산");
        System.out.println(student.getAddress());
    }

}
