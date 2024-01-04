package com.study.ch07.carRegister;

public class CarDB {
    void carInfo(Car car) {
        System.out.println("------------------------------");
        System.out.println("차 브랜드 :" + car.Brand);
        System.out.println("차 이름 :" + car.Name);
        System.out.println("차 종류 :" + car.Type);
        System.out.println("차 가격 :" + car.Price);
    }
}
