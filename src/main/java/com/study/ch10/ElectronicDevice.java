package com.study.ch10;

/*
*  [ 추상화 ]
*  1. 추상 클래스 abstract
*  - 공통점을 뽑아낸다.
*  2. 인터페이스 interface
* */
public abstract class ElectronicDevice {
    boolean powerState;

    void setPowerOn() {
        powerState = true;
    }

    void setPowerOff() {
        powerState = false;
    }

    // 추상 메소드
    // -인터페이스와 추상클래스에서만 정의 가능
    abstract void showDeviceState();
}
