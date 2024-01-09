package com.study.ch13;

import java.util.Scanner;

public class FactoryMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FactoryService1 factoryService1 = new FactoryService1(scanner);
        FactoryService2 factoryService2 = new FactoryService2(scanner);

        // 첫번째 create때 만들어진 인스턴스에서 실행
        factoryService1.create();
        factoryService2.create();
    }

}
