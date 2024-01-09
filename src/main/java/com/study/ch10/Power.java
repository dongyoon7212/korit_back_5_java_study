package com.study.ch10;

//인터페이스는 모든 메소드가 기본적으로 추상 메소드이다.
//인터페이스는 다중 상속이 가능하다.
//인터페이스는 변수 선언이 불가능하다.
//변수 초기화를 하면 선언이 가능하다. => 사실상 상수 선언만 가능
public interface Power {
    public static final String ERROR_CODE = "-9999"; //상수니까 대문자로

    void setPowerOn();
    void setPowerOff();

    //default를 붙이면 일반 메소드
    default void test() {

    }
}
