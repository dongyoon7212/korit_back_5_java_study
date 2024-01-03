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
    //함수의 **오버로딩** => 함수명이 같지만 매개변수의 자료형이 다르면 새로운 함수 정의가 가능하다.
    public static void fx02(String a, int b) { //변수명은 상관없이 자료형이 중요
        System.out.println("fx02 함수 실행");
        System.out.println("이름: " + b);
        System.out.println("나이: " + a);
        System.out.println();
    }

    public static int fx03() {
        System.out.println("fx03 함수 실행");
        return 100; //반환할 int의 값 100
    }

//    public static int fx03() { 함수 자료형이 달라지면 안된다.
//        System.out.println("fx03 함수 실행");
//        return "100"; //반환할 int의 값 100
//    }

    public static String fx04(String name, int age) {
        return name + ", " + age; //반환될 값은 String이다.
    }

    public static void main(String[] args) {
        fx01(); //호출
        fx02(26, "이동윤"); //자료형으로 판단 자료형에 따라 함수를 찾아감
        fx02("이동윤", 26); //오버로딩된 함수
        int num = fx03();
        System.out.println(fx03()); //fx03()에서 반환된 100
        String result = fx04("이동윤", 26);
        System.out.println(result);
    }

}
