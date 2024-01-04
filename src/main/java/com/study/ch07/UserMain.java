package com.study.ch07;

public class UserMain {
    public static void main(String[] args) {
        User01 user01 = new User01("dongyoon7212","94027212");
        User01 user02 = new User01("dongyoon7212","94027212","이동윤","dongyoon7212@naver.com");

        user01.showInfo();
        System.out.println("------------------------");
        user02.showInfo();
        System.out.println("------------------------");

        user01.setName("장현원");
        user01.setEmail("ddang9908@naver.com");

        user01.showInfo();

    }
}
