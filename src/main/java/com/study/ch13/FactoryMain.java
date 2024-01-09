package com.study.ch13;

import java.util.Scanner;

public class FactoryMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Factory factory = new Factory();
        FactoryService1 factoryService1 = new FactoryService1(scanner, factory);
        FactoryService2 factoryService2 = new FactoryService2(scanner, factory);

        factoryService1.create();
        factoryService2.create();
    }

}
