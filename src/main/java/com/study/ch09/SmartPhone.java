package com.study.ch09;

public class SmartPhone extends ElectronicDevice {
    String model;
    String color;

    void call() {
        System.out.println("전화 연결을 시도합니다.");
    }

    @Override // @로 시작하면 "어노테이션" => 어노테이션 오버라이드 (재정의된 것을 구분하기 위해서, 하나의 기능을 함축적으로 쓰기 위함)
    void showDeviceState() {
        super.showDeviceState();
    }
}
