package com.study.ch18;

public class AdditionImpl implements Addition {
    @Override
    public int add(int a, int b) {
        System.out.println("AdditionImpl에서 호출한 add 메소드");
        return a + b; // 변수명은 상관없음, 자료형만 중요
    }
}
