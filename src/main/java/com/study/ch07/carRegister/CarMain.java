package com.study.ch07.carRegister;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        CarService carService = new CarService();
        Scanner sc = new Scanner(System.in);

        String carBrand = null;
        String carName = null;
        String carType = null;
        long carPrice = 0;

        System.out.print("차 브랜드 :");
        carBrand = sc.nextLine();
        if(carService.isEmptyString(carBrand)) {
            System.out.println("차 브랜드를 다시 입력하세요.");
            return;
        }
        System.out.print("차 이름 :");
        carName = sc.nextLine();
        if(carService.isEmptyString(carName)) {
            System.out.println("차 이름를 다시 입력하세요.");
            return;
        }
        System.out.print("차 종류 :");
        carType = sc.nextLine();
        if(carService.isEmptyString(carType)) {
            System.out.println("차 종류를 다시 입력하세요.");
            return;
        }
        System.out.print("차 가격 :");
        carPrice = sc.nextLong();
        System.out.println("------------------------------");

        Car car = new Car(carBrand, carName, carType, carPrice);

        carService.carRegisterEntity(car);

        System.out.println("프로그램 종료");

    }
}
