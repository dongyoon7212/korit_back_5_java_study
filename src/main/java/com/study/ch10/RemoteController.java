package com.study.ch10;

public class RemoteController extends ElectronicDevice {
// 재정의를 하면 일반클래스
    @Override
    void showDeviceState() {
        System.out.println("리모컨의 상태를 확인합니다.");
    }
}
