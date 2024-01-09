package com.study.ch13;

/*
* Company 클래스를 싱글톤을 적용하여 구현하시오.
* */

public class Company {
    private static Company instance; //1. 자기 자신 instance
    private String name; // 그냥 객체 안에서 사용되는 변수(무시)

    private Company() {} // 2. 생성자는 private

    public static Company getInstance() { // 3. getInstance만들고 if문, null 체크 하고 생성자 생성, return으로 instance
        if (instance == null) {
            instance = new Company();
        }
        return instance;
    }
}
