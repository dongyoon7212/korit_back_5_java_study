package com.study.ch19;

public class BuilderMain {

    public static void main(String[] args) {
        Car.CarBuilder carBuilder = Car.builder();
                                    // Car에서 CarBuilder 생성자호출
        Car car2 = carBuilder.build();
        // 아래 한줄로
        Car car = Car.builder()
                .model("아반떼")
                .color("블랙")
                .build();

//        Car car = Car.builder() //builder() 스태틱
//                .color("블랙")
//                .model("아반떼")
//                .build();

        System.out.println(car);
    }

}
