package com.study.ch07.carRegister;

public class CarService {
    boolean isEmptyString(String str) {
        if(str == null) {
            return true;
        }
        return str.isBlank();
    }

    void carRegisterEntity(Car car){
        System.out.println("서비스에서 엔티티로 전달");
        System.out.println("------------------------------");

        CarEntity carEntity = new CarEntity();
        carEntity.carRegisterRepository(car);
    }


}
