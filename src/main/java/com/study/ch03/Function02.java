package com.study.ch03;

public class Function02 {

    // 매개변수x, 리턴x
    public static void fx01() {
        // void -> 비어있는, 공허한
        System.out.println("fx01 함수 실행");
        System.out.println();
    }

    public static void fx02(int age, String name) {
        System.out.println("fx02 함수 실행");
        System.out.println("나이: " + age);
        System.out.println("이름: " + name);
        System.out.println();
    }

    public static void main(String[] args) {
        fx01(); //호출
        fx02(26, "이동윤");
    }

}
