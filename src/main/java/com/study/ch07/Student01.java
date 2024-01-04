package com.study.ch07;

public class Student01 {
    String name;
    int age;
//    String address;
    final String address;
    //final이 붙으면 NoArgsConstructor 사용불가
//
    // 생성자 (constructor)
    // args (arguments) 매개변수 값

    // NoArgsConstructor (매개변수 없음)
//    Student01() {
//        address = "";
//    }

    // AllArgsConstructor (매개변수를 다 가지고 있음)
    Student01(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // RequiredArgsConstructor
    Student01(String address) {
        this.address = address;
    }
}
