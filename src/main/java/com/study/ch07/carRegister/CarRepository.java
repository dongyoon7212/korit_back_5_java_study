package com.study.ch07.carRegister;

public class CarRepository {
    void carRegisterDB(Car car) {
        System.out.println("레포지토리에서 디비로 전달");

        CarDB carDB = new CarDB();
        carDB.carInfo(car);
    }
}
