package com.study.ch02;

public class StudentTypeMain {
    public static void main(String[] args) {
        StudentType dongyoon = new StudentType();
        dongyoon.name = "이동윤";
        dongyoon.studentYear = 1;
        dongyoon.address = "부산 사하구";

        System.out.println("이름: " + dongyoon.name);
        System.out.println("학년: " + dongyoon.studentYear);
        System.out.println("주소: " + dongyoon.address);

        int a = 10;
        double b = a;

        Person p = dongyoon; //업케스팅
        StudentType dongyoon2 = (StudentType) p; //다운케스팅

//        Person 장현원 = new Person();
//        StudentType 장현원학생 = (StudentType) 장현원;

        StudentType 장현원학생 = new StudentType();
        Person 장현원 = 장현원학생;
        StudentType 장현원학생2 = (StudentType) 장현원;
    }
}