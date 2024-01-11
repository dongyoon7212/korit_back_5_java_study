package com.study.ch18;

@FunctionalInterface // 함수형 인터페이스, 메소드가 두개 생길때 바로 오류가 뜸.
public interface Addition {
    public int add(int x, int y);
//    public int add2(int x, int y);
}