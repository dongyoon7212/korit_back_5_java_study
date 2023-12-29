package com.study.ch03;

public class Function01 {

    public static void main(String[] args) {
        System.out.println(fx1(1,2,3,4,5)); // 함수 호출(콜)
        fx2("이동윤");
    }

    // 함수 정의
    // 함수는 자주 사용하는거 또 쓸것들을 함수로 뺀다. (재사용)
    // 코드가 너무 길어지고 보기 힘들어질때 함수로 뺀다.
    // 클린코드 개념...
    static int fx1(int a, int b, int c, int d, int e) {
        return  a + b * c - d * e;
    }

    static void fx2(String name) {
        System.out.println("이름은 " + name + " 입니다.");
    }

}