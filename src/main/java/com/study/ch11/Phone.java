package com.study.ch11;

public class Phone {
    static int autoCount = 0;
    int serialNumber;
    Company company;

    //자동으로 증가할 수 있는 로직 => 생성될때 카운트가 되어서 시리얼 넘버를 증강시킴
    public Phone(Company company) {
        autoCount++;
        this.serialNumber = 20240000;
        this.serialNumber += autoCount;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "serialNumber=" + serialNumber +
                ", company=" + company.toString() +
                '}';
    }
}
