package com.study.ch09;

public class ElectronicDeviceMain {

    public static void main(String[] args) {
        ElectronicDevice[] electronicDevices = new ElectronicDevice[10];

        for (int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i] = i % 2 == 0 ? new Computer() : new SmartPhone(); // 업캐스팅
        }

        System.out.println();

        for (int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i].showDeviceState();
        }

        System.out.println();

        for (int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i].setPowerOn(); // 재정의 된 것이 우선순위가 높다. *** 오버라이드
        }

        System.out.println();

        for (int i = 0; i < electronicDevices.length; i++) {
            electronicDevices[i].showDeviceState();
        }

        for (int i = 0; i < electronicDevices.length; i++) {
            if (electronicDevices[i] instanceof Computer) { // 인스턴스인지 확인 => 컴퓨터의 인스턴스면 true
                Computer computer = (Computer) electronicDevices[i]; // 컴퓨터로 다운캐스팅
                computer.playGame();
            } else if (electronicDevices[i] instanceof SmartPhone) { // 인스턴스인지 확인 => 스마트폰의 인스턴스면 true
                SmartPhone smartPhone = (SmartPhone) electronicDevices[i]; // 스마트폰으로 다운캐스팅
                smartPhone.call();
            }
            // 자바 버전이 높아지면서 instanceof가 사라짐
        }
    }

}
