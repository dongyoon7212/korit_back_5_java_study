package com.study.ch07.carRegister;

public class CarEntity {

    void carRegisterRepository(Car car) {
        System.out.println("엔티티에서 레포지토리로 전달");
        System.out.println("------------------------------");

        CarRepository carRepository = new CarRepository();
        carRepository.carRegisterDB(car);
    }

}
